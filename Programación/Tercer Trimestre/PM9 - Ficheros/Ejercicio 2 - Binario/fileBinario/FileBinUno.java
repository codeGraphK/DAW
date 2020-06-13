import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.TreeSet;

public class FileBinUno {

    static BufferedReader rdData = new BufferedReader(new InputStreamReader(System.in));
    static File fArchivo;
    static FileOutputStream flujoSalida;
    static ObjectOutputStream filtroSalida;
    static FileInputStream flujoEntrada;
    static ObjectInputStream filtroEntrada;
    
    public static void main(String[] args) {
        
        try {
            System.out.print("Introduce el nombre del archivo: ");
            fArchivo = new File(rdData.readLine());
            
            menuFirst();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    private static void menuFirst() throws IOException {
        System.out.println("1. Solicitar notas");
        System.out.println("2. Listado de notas");
        System.out.println("3. Nota media del fichero (decimal)");
        System.out.println("4. Salir del programa");
        
        switch (rdData.readLine()) {
            case "1":
            soliNotas();
            break;
            case "2":
            listNotas();
            break;
            case "3":
            avgNota();
            break;
            default:
            break;
        }

        fArchivo.delete();
    }
    
    private static void soliNotas() throws IOException {
        TreeSet <Alumno> treeAlumno = new TreeSet<Alumno>(new CompAlumno());
        flujoSalida = new FileOutputStream(fArchivo);
        filtroSalida = new ObjectOutputStream(flujoSalida);
        boolean bKeep = true;
        
        while (bKeep) {
            System.out.print("Introduce el dni del alumno: ");
            String sDni = rdData.readLine();
            if (!sDni.equals("-1")) {
                System.out.print("Introduce una nota: ");
                double dNota = Double.parseDouble(rdData.readLine());
                treeAlumno.add(new Alumno(sDni, dNota));
            } else {
                bKeep = !bKeep;
            }
        }

        for (Alumno alumno : treeAlumno) {
            filtroSalida.writeObject(alumno);
        }

        flujoSalida.close();
        filtroSalida.close();

        menuFirst();
    }

    private static void listNotas() throws IOException {
        flujoEntrada = new FileInputStream(fArchivo);
        filtroEntrada = new ObjectInputStream(flujoEntrada);
        String sResult = "";
        boolean bKeep = true;

        while (bKeep) {
            try {
                Alumno aluActual = (Alumno) filtroEntrada.readObject();
                sResult += aluActual.getdNota() + " ";
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (EOFException e) {
                bKeep = !bKeep;
                sResult += ".";
            }
        }

        flujoEntrada.close();
        filtroEntrada.close();
        
        System.out.println("Las notas son: " + sResult);

        menuFirst();
    }
    
    private static void avgNota() throws IOException {
        flujoEntrada = new FileInputStream(fArchivo);
        filtroEntrada = new ObjectInputStream(flujoEntrada);
        double dNotaMedia = 0;
        boolean bKeep = true;

        for (int i = 0; bKeep; i++) {
            try {
                Alumno aluActual = (Alumno) filtroEntrada.readObject();
                dNotaMedia += aluActual.getdNota();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (EOFException e) {
                bKeep = !bKeep;
                dNotaMedia /= i;
            }
        }

        flujoEntrada.close();
        filtroEntrada.close();

        System.out.println("La nota media del fichero es: " + dNotaMedia);

        menuFirst();
    }

}