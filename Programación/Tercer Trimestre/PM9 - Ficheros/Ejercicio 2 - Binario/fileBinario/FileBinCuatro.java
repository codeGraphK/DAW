import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileBinCuatro {
    static BufferedReader rdData = new BufferedReader(new InputStreamReader(System.in));
    static File fArchivo;

    public static void main(String[] args) {
        String ruta = "./";
        try {
            System.out.print("Introduce el nombre del archivo: ");
            fArchivo = new File(ruta + rdData.readLine());

            if (fArchivo.exists() && fArchivo.list().length == 0) {
                fArchivo.delete();
                System.out.println("Borrado.");
            } else {
                System.out.println("No se puede borrar porque puede que el directorio no se encuentre vacío.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}