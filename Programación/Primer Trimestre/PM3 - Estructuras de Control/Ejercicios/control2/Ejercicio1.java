package ej.control2;
import java.io.*;

public class Ejercicio1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader rdNum = new BufferedReader(new InputStreamReader(System.in));
		
		int iQuant, iNum, iCont, iMax, iPos;
		iPos = 0;
		iCont = 1;
		iMax = 0;
		
		System.out.println("Hola!, introduce a continuación la cantidad de Sueldos que deseas ingresar:");
		iQuant = Integer.parseInt(rdNum.readLine());
		
		if(iQuant <= 0) {
			System.out.println("Introduce un valor valido por favor");
		}else {
			while(iCont <= iQuant){
				System.out.println("Introduce tu " + iCont + "° sueldo:");
				iNum = Integer.parseInt(rdNum.readLine());
				if(iNum >= iMax){
					iMax = iNum;
					iPos = iCont;
				}
				iCont++;
			}
			System.out.println("El Sueldo máximo que ingresaste fue el " + iPos + "°, que vale: " + iMax);
		}
		
	}

}
