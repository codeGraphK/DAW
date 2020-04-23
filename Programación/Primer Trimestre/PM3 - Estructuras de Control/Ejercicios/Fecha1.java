import java.io.*;

public class Fecha1 {

	public static void main(String [] args){
		
		String sFecha, sDia, sMes, sMesL, sAnyo;
		sFecha = args[0];
		sMesL = "";
		sDia = String.valueOf(sFecha.charAt(0))+String.valueOf(sFecha.charAt(1));
		sMes = String.valueOf(sFecha.charAt(2))+String.valueOf(sFecha.charAt(3));
		sAnyo = String.valueOf(sFecha.charAt(4))+String.valueOf(sFecha.charAt(5))+String.valueOf(sFecha.charAt(6))+String.valueOf(sFecha.charAt(7));
		//String.valueOf(n) converts any type of variable into a String
		
		if((sFecha.length() > 8 || sFecha.length() <= 0) || args.length !=1){
		
			System.out.println("Introduce tu fecha en el formato ddmmaaaa sin espacios.");
		
		}else{
		
			switch(sMes) {
			case "01":
				sMesL = "Enero";
				break;
			case "02":
				sMesL = "Febrero";
				break;
			case "03":
				sMesL = "Marzo";
				break;
			case "04":
				sMesL = "Abril";
				break;
			case "05":
				sMesL = "Mayo";
				break;
			case "06":
				sMesL = "Junio";
				break;
			case "07":
				sMesL = "Julio";
				break;
			case "08":
				sMesL = "Agosto";
				break;
			case "09":
				sMesL = "Septiembre";
				break;
			case "10":
				sMesL = "Octubre";
				break;
			case "11":
				sMesL = "Noviembre";
				break;
			case "12":
				sMesL = "Diciembre";
				break;
			default:
				System.out.println("Introduce un valor de 01 a 12.");
				break;
			}
			
			System.out.println("Hoy es " + sDia + " de " + sMesL + " de " + sAnyo + ".");
		}
		
	}	
		
}

