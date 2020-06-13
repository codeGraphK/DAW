import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileBinTres {
    static BufferedReader rdData = new BufferedReader(new InputStreamReader(System.in));
    static File fArchivo;

    public static void main(String[] args) {
        try {
            System.out.print("Introduce el nombre del archivo: ");
            fArchivo = new File(rdData.readLine());

            if (fArchivo.exists() && fArchivo.isDirectory()) {
                File [] listFiles = fArchivo.listFiles();
                for (File file : listFiles) {
                    if (file.isDirectory()) {
                        System.out.println(file.getName() + "/");
                    } else {
                        System.out.println("-" + file.getName());
                    }
                }
            } else {
                System.out.println("El archivo no exise o no es un directorio.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}