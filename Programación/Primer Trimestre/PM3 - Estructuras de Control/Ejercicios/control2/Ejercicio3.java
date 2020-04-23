package ej.control2;
import java.io.*;

public class Ejercicio3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader rdData = new BufferedReader(new InputStreamReader(System.in));

		String sEdad, sAltura;
		int iCont, iEdad, iEdSum, iContMay, iContAlt, iEdMed, iData, iPos;
		double dAltura, dAltSum, dAltMed;
		boolean breakDw, breakW, breaksAlt;
		sEdad = "";
		sAltura = "";
		breakW = true;
		breakDw = false;
		breaksAlt = true;
		iPos = 1; 
		iCont = 0;
		iEdSum = 0;
		dAltSum = 0;
		iContAlt = 0;
		iContMay = 0;
		iData = 0;

		System.out.println("Ingresarás edades y alturas de 5 alumnos separadas por un espacio; Mostrará promedios, mayores de 18 y más altos de 1.75m.");

		while(iPos <= 5 && breakW) {

			do {

				System.out.println("Introduce la edad y la altura del " + iPos + "º alumno:");
				if(breakDw){
					if(iData != 2){
						System.out.println("Introduce nada más la edad y la altura.");
					}
					if(sEdad.length() == 0){
						System.out.println("Introduce algo al menos.");
					}else {
						if(sEdad.length() > 2){
						System.out.println("Los alumnos no tienen más de 99 años.");
						}
					}
					if(sAltura.length() == 0){
						System.out.println("... O introduce la edad y la altura separadas por un espacio.");
					}else {
						if(sAltura.length() > 4 || sAltura.length() < 4){
						System.out.println("Introduce la altura en metros con dos decimales por favor.");
						}
					}
				}
				String [] sDatosAlStrings = rdData.readLine().split(" ");
				iData = sDatosAlStrings.length;
				sEdad = sDatosAlStrings[0];
				if(iData != 2){
					breaksAlt = false;
				}
				if(breaksAlt){
					sAltura = sDatosAlStrings[1];
				}
				breakDw = true;
			
			}while(iData != 2 ||(sEdad.length() > 2 || sEdad.length() == 0) || (sEdad.length() > 2 || sEdad.length() == 0) || (sAltura.length() > 4 || sAltura.length() < 4));
			
			iEdad = Integer.parseInt(sEdad);
			dAltura = Double.parseDouble(sAltura);

			if((iEdad <= 0 || dAltura <= 0)){
				System.out.println("Introduciste valores ilógicos.");
				breakW = false;
			}

			iEdSum += iEdad;
			dAltSum += dAltura; 

			if(iEdad > 18){
				iContMay++;
			}
			if(dAltura > 1.75){
				iContAlt++;
			}
			
			iPos++;
			iCont++;
			
			
		}

		iEdMed = iEdSum/iCont;
		dAltMed = dAltSum/iCont;

		System.out.println("Muy bien.");
		System.out.println("---------------------------------------------------");
		System.out.println("La edad promedio de los " + iCont + " alumnos que ingresaste es: " + iEdMed + ".");
		System.out.println("La altura promedio es: " + dAltMed + ".");
		System.out.println("Hay " + iContMay + " alumnos que son mayores de 18.");
		System.out.println("Y hay " + iContAlt + " alumnos que miden más de 1.75m.");
		System.out.println("---------------------------------------------------");
	}

}
