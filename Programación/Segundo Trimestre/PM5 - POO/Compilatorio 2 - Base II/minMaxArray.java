import java.io.*;

public class minMaxArray {
    public static void main(String[] args) throws IOException {
        BufferedReader rdInt = new BufferedReader(new InputStreamReader(System.in));
        
        int iLongitud, iNum, iCont = 0, iSum = 0;
        int[] iAEntrada;

        System.out.println("Introduzca la cantidad de números enteros que desea introducir:");
        iLongitud = Integer.parseInt(rdInt.readLine());
        iAEntrada = new int[iLongitud];

        do {
            System.out.println("Introduce tu número:");
            iNum = Integer.parseInt(rdInt.readLine());
            iAEntrada[iCont] = iNum;
            iCont++;
            iSum += iNum;
        }while(iCont < iAEntrada.length);

        double dMedia = iSum/iLongitud;

        System.out.println("El valor máximo de todos los que ingresaste es: " + Arreglos.getEntMaxValue(iAEntrada));
        System.out.println("El valor mínimo de todos los que ingresaste es: " + Arreglos.getEntMinValue(iAEntrada));
        System.out.println("La media es: " + dMedia);
    }
}