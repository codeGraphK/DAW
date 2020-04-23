import java.io.*;

public class MinMaxZer {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        BufferedReader rdNumb = new BufferedReader(new InputStreamReader(System.in));

        int iNum, iMax, iMin, iCount, iSum, iMedia;
        boolean correcto = true;
        iCount = 0;
        iSum = 0;
        iMax = 0;
        iMin = 0;
        iMedia = 0;

        System.out.println("Introduce un numero entero:");
        iNum = Integer.parseInt(rdNumb.readLine());
        
        while(iNum != 0){
            if(correcto){
                iMin = iNum;
            }
            iCount++;
            iSum += iNum;
            iMedia = iSum/iCount;
            if(iMax <= iNum){
                iMax = iNum;
            }
            if(iMin >= iNum){
                iMin = iNum;
            }
            correcto = false;
            System.out.println("Introduce otro numero entero:");
            iNum = Integer.parseInt(rdNumb.readLine());
        }
        
        System.out.println("El minimo de todos los numeros que ingresaste es: " + iMin);
        System.out.println("El maximo de todos los numeros que ingresaste es: " + iMax);
        System.out.println("La media de todos los numeros que ingresaste es: " + iMedia);

    }

}