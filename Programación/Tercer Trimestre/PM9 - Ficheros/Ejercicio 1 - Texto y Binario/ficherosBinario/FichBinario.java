import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

public class FichBinario {

    static BufferedReader rdData = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

        File fSource = new File("fSource.txt");
        FileOutputStream flujoSalida = null;
        ObjectOutputStream filtroSalida = null;

        Persona perUno = new Persona("111A", "Juan", "López", 18, 1.63);
        Persona perDos = new Persona("222B", "Maria", "Ruiz", 20, 1.83);
        Persona perTre = new Persona("333C", "David", "Méndez", 19, 1.73);

        /* Texto Generado de Ejemplo */
        try {
            flujoSalida = new FileOutputStream(fSource);
            filtroSalida = new ObjectOutputStream(flujoSalida);

            filtroSalida.writeObject(perUno);
            filtroSalida.writeObject(perDos);
            filtroSalida.writeObject(perTre);
        } catch (IOException e) {
            System.out.println("Error de entrada-salida.");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                filtroSalida.close();
                flujoSalida.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        mainMenu();
    }

    private static void mainMenu() {
        File fOut = null;
        int iOption = 5;
        System.out.print("\nIntroduce el nombre del archivo: ");

        try {
            fOut = new File(rdData.readLine());
            OperacionesRegistroPersonas opPer = new OperacionesRegistroPersonas(fOut);

            do {
                System.out.println("\n1. Alta de persona.");
                System.out.println("2. Búsqueda de persona.");
                System.out.println("3. Mostrar listado de personas.");
                System.out.println("4. Eliminar persona.");
                System.out.println("5. Salir.");

                System.out.print("\nIntroduce la opcion: ");
                iOption = Integer.parseInt(rdData.readLine());

                switch (iOption) {
                    case 1:
                        opPer.altaPersona(altaMenu());
                        break;
                    case 2:
                        opPer.buscarPersona(buscarMenu());
                        break;
                    case 3:
                        opPer.listadoPersonas();
                        break;
                    case 4:
                        opPer.eliminarPersona(eliminarMenu());
                        break;
                    default:
                        break;
                }
            } while (iOption != 5);
        } catch (IOException e) {
            System.out.println("Error de entrada-salida.");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Excepción no esperada.");
            e.printStackTrace();
        }

    }

    private static Persona altaMenu() throws IOException {
        System.out.print("\nIntroduce el DNI: ");
        String sDni = rdData.readLine();
        System.out.print("\nIntroduce el nombre: ");
        String sNombre = rdData.readLine();
        System.out.print("\nIntroduce los apellidos: ");
        String sApel = rdData.readLine();
        System.out.print("\nIntroduce la edad: ");
        int iEdad = Integer.parseInt(rdData.readLine());
        System.out.print("\nIntroduce la altura: ");
        double dAltura = Double.parseDouble(rdData.readLine());

        Persona perOut = new Persona(sDni, sNombre, sApel, iEdad, dAltura);

        return perOut;
    }

    private static String buscarMenu() throws IOException {
        System.out.print("\nIntroduce el DNI: ");
        return rdData.readLine();
    }

    private static String eliminarMenu() throws IOException {
        System.out.print("\nIntroduce el DNI: ");
        return rdData.readLine();
    }
}