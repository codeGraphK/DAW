import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * FichTexto
 */
public class FichTexto {

    public static void main(String[] args) {

        File fArchivo = new File("quixote.txt");
        File fSalida = new File("quixoteSalida.txt");
        File fCuatro = new File("ejercicio4.txt");
        FileReader rdArchivo = null;
        FileWriter wrArchivo = null;

        try {
            /* --------- Ejercicio 1 --------- */
            System.out.println("Ejercicio 1\n");
            rdArchivo = new FileReader(fArchivo);
            while (rdArchivo.ready()) {
                int cNow = rdArchivo.read();
                System.out.print((cNow == 97) ? "x" : (char) cNow);
            }
            rdArchivo.close();
            /* ------------------------------- */

            /* --------- Ejercicio 2 --------- */
            System.out.println("\nEjercicio 2\n");
            rdArchivo = new FileReader(fArchivo);
            wrArchivo = new FileWriter(fSalida);
            while (rdArchivo.ready())
                wrArchivo.append((char) rdArchivo.read());
            rdArchivo.close();
            wrArchivo.close();
            System.out.println("Hecho.");
            /* ------------------------------- */

            /* --------- Ejercicio 3 --------- */
            System.out.println("\nEjercicio 3");
            mainMenu();
            /* ------------------------------- */

            /* --------- Ejercicio 4 --------- */
            System.out.println("\nEjercicio 4\n");
            int iResult = 0;
            rdArchivo = new FileReader(fCuatro);
            while (rdArchivo.ready()) {
                char cNow = (char) rdArchivo.read();
                if (cNow > 47 && cNow < 58)
                    iResult += Integer.parseInt(String.valueOf(cNow));
            }
            rdArchivo.close();
            System.out.println(iResult);
            /* ------------------------------- */

            /* --------- Ejercicio 5 --------- */
            System.out.println("\nEjercicio 5\n");
            int iWords = 1;
            char cPrevio = 0;
            String sResult = "", sInter = "";
            File fileOut = new File("quixoteInverso.txt");
            rdArchivo = new FileReader(fArchivo);
            wrArchivo = new FileWriter(fileOut);
            while (rdArchivo.ready()) {
                char cActual = (char) rdArchivo.read();
                if (cPrevio != 32 && (cActual == 32 || cActual == 46)) {
                    if (cActual != 46)
                        iWords++;
                    sResult = sInter + " " + sResult;
                    sInter = "";
                } else {
                    sInter += cActual;
                }
                cPrevio = cActual;
            }
            wrArchivo.write(sResult);
            System.out.println("Tiene " + iWords + " palabras.");
            /* ------------------------------- */
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
        } catch (IOException e) {
            System.out.println("Error de entrada-salida");
        } finally {
            try {
                rdArchivo.close();
                wrArchivo.close();
            } catch (Exception e) {
                System.out.println("Excepción al cerrar.");
            }
        }

    }

    public static void mainMenu() {
        BufferedReader rdOption = new BufferedReader(new InputStreamReader(System.in));
        int iOption = 3;

        System.out.println("\n1. Crear fichero.");
        System.out.println("2. Mostrar fichero.");
        System.out.println("3. Salir.");

        try {
            System.out.print("\nIntroduce la opción: ");
            iOption = Integer.parseInt(rdOption.readLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        switch (iOption) {
            case 1:
                crearFichero();
                break;
            case 2:
                mostrarFichero();
                break;
            default:
                System.out.println("Saliendo...");
                break;
        }
    }

    public static void crearFichero() {
        BufferedReader rdData = new BufferedReader(new InputStreamReader(System.in));
        File fileOut = null;
        FileWriter wrFile = null;

        try {
            System.out.print("\nIntroduce el nombre del archivo: ");
            fileOut = new File(rdData.readLine());
            wrFile = new FileWriter(fileOut, true);

            System.out.print("\nIntroduce el dni: ");
            wrFile.write(rdData.readLine() + " ");

            System.out.print("\nIntroduce el nombre: ");
            wrFile.write(rdData.readLine() + " ");

            System.out.print("\nIntroduce el apellido: ");
            wrFile.write(rdData.readLine() + "\n");
        } catch (IOException e) {
            System.out.println("Error de entrada-salida.");
        } finally {
            try {
                wrFile.close();
            } catch (IOException e) {
                System.out.println("Error de entrada-salida al cerrar.");
            }
            mainMenu();
        }
    }

    public static void mostrarFichero() {
        BufferedReader rdArchive = new BufferedReader(new InputStreamReader(System.in));
        File fileToShow = null;
        FileReader rdFile = null;

        try {
            System.out.print("\nIntroduce el nombre del archivo: ");
            fileToShow = new File(rdArchive.readLine());
            rdFile = new FileReader(fileToShow);
            while (rdFile.ready())
                System.out.print((char) rdFile.read());
        } catch (IOException e) {
            System.out.println("Error de entrada-salida.");
        } finally {
            try {
                rdFile.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar.");
            }
            mainMenu();
        }

    }
}