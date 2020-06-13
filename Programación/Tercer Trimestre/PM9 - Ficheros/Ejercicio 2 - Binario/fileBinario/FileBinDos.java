import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.TreeSet;

public class FileBinDos {

    static BufferedReader rdData = new BufferedReader(new InputStreamReader(System.in));
    static File fArchivo;
    static FileOutputStream flujoSalida;
    static ObjectOutputStream filtroSalida;
    static FileInputStream flujoEntrada;
    static ObjectInputStream filtroEntrada;
    public static void main(String[] args) {
        try {
            insReadSec();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void insReadSec() throws IOException {
        System.out.print("Introduce el nombre del archivo: ");
        fArchivo = new File(rdData.readLine());
        flujoSalida = new FileOutputStream(fArchivo);
        filtroSalida = new ObjectOutputStream(flujoSalida);

        for (int i = 0; i < 10; i++) {
            int r = (int)(Math.random() * 10);
            filtroSalida.writeInt(r);
            System.out.print(r + " ");
        }

        filtroSalida.close();
        flujoSalida.close();

        flujoEntrada = new FileInputStream(fArchivo);
        filtroEntrada = new ObjectInputStream(flujoEntrada);

        TreeSet <Integer> treeInt = new TreeSet<Integer>(new CompInt().reversed());

        try {
            while (true) {
                treeInt.add(filtroEntrada.readInt());
            }
        } catch (EOFException e) {
            System.out.print(".\n");
        }

        System.out.print("En orden decresciente: ");
        for (Integer integer : treeInt) {
            System.out.print(integer + " ");
        }

        flujoEntrada.close();
        filtroEntrada.close();
    }
}