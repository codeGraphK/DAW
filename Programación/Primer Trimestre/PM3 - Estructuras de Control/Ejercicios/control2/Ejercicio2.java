package ej.control2;
import java.io.*;

public class Ejercicio2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader rdNum = new BufferedReader(new InputStreamReader(System.in));
		int iNum, iCont, iSumPos, iContPos, iSumNeg, iContNeg, iContZer, iMediaPos, iMediaNeg;
		iCont = 1;
		iSumPos = 0;
		iContPos = 0;
		iContNeg = 0;
		iSumNeg = 0;
		iContZer = 0;
		
		System.out.println("A continuación deberás introducir 10 números enteros aleatorios.");
		
		while(iCont <= 10) {
			System.out.println("Introduce tu " + iCont + "° número:");
			iNum = Integer.parseInt(rdNum.readLine());
			if(iNum > 0){
				iSumPos += iNum;
				iContPos++;
			}else {
				if(iNum < 0) {
					iSumNeg += iNum;
					iContNeg++;
				}else {
					iContZer++;
				}
			}
			iCont++;
		}
		
		iMediaPos = iSumPos/iContPos;
		iMediaNeg = iSumNeg/iContNeg;
		
		System.out.println("");
		System.out.println("Ingresaste " + iContZer + " ceros.");
		System.out.println("La media de los " + iContPos + " números positivos que ingresaste es: " + iMediaPos);
		System.out.println("La media de los " + iContNeg + " números negativos que ingresaste es: " + iMediaNeg);
	}

}
