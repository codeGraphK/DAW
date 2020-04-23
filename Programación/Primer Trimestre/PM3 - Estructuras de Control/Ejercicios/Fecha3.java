import java.io.*;

public class Fecha3 {

	public static void main(String [] args){
		
		String sFecha, sDia, sMes, sMesL, sAnyo, sFormato, sResult;
		int iDia, iMes, iAnyo;
		sFormato = args[0].toUpperCase();
		sFecha = args[1];
		sMesL = "";
		sAnyo = String.valueOf(sFecha.charAt(4))+String.valueOf(sFecha.charAt(5))+String.valueOf(sFecha.charAt(6))+String.valueOf(sFecha.charAt(7));
		sDia = "";
		sMes = "";
		iDia = 0;
		iMes = 0;
		iAnyo = 0;
		boolean correcto = true;
		sResult = "";
		/*String.valueOf(n) converts any type of variable into a String
		substring()
		charAt()*/
		
		if(sFecha.length() != 8 || sFormato.length() != 2 || args.length !=2){
		
			System.out.println("	/ Introduce tu fecha en el formato ddmmaaaa sin espacios. /	");

		}else{
			
			switch(sFormato) {
				case "ES":
					sDia = String.valueOf(sFecha.charAt(0))+String.valueOf(sFecha.charAt(1));
					sMes = String.valueOf(sFecha.charAt(2))+String.valueOf(sFecha.charAt(3));
					break;
				case "US":
					sMes = String.valueOf(sFecha.charAt(0))+String.valueOf(sFecha.charAt(1));
					sDia = String.valueOf(sFecha.charAt(2))+String.valueOf(sFecha.charAt(3));
					break;
				default:
					System.out.println("	/ El argumento de formato no es correcto. /	");
					correcto = false;
					break;
			}
			if(correcto){
				
				iDia = Integer.parseInt(sDia);
				iMes = Integer.parseInt(sMes);
				iAnyo = Integer.parseInt(sAnyo);

				if((iDia < 1 || iDia > 31) || (iMes < 1 || iMes > 12) || (iAnyo < 1900 || iAnyo > 2900)){
					
					System.out.println("	/ Introduce una fecha valida. /	");
					
				}else {
					
					switch(iMes) {
						case 1:
							sMesL = "Enero";
							break;
						case 2:
							sMesL = "Febrero";
							break;
						case 3:
							sMesL = "Marzo";
							break;
						case 4:
							sMesL = "Abril";
							break;
						case 5:
							sMesL = "Mayo";
							break;
						case 6:
							sMesL = "Junio";
							break;
						case 7:
							sMesL = "Julio";
							break;
						case 8:
							sMesL = "Agosto";
							break;
						case 9:
							sMesL = "Septiembre";
							break;
						case 10:
							sMesL = "Octubre";
							break;
						case 11:
							sMesL = "Noviembre";
							break;
						case 12:
							sMesL = "Diciembre";
							break;
						default:
							System.out.println("	/ Introduce un valor de 01 a 12. /	");
							break;
					}

					sResult = "Hoy es " + iDia + " de " + sMesL + " de " + iAnyo + ".";

					if (iAnyo%4 == 0  &&  iAnyo%100 != 0 || iAnyo % 400 == 0) {

						switch(iMes) {
							case 2:
								if (iDia > 29) {
									System.out.println("	/ Febrero consta de solo 29 dias en este anio. /	");
									sResult = "";
								}
								break;
							default:
								System.out.println("");
								break;
						}

					}else {
						switch(iMes) {
							case 4:
							case 6:
							case 9:
							case 11:
								if (iDia > 30) {
									System.out.println("	/ El mes que ingresaste consta de 30 dias solamente. /	");
									sResult = "";
								}
								break;
							case 2:
								if (iDia > 28) {
									System.out.println("	/ Febrero consta de solo 28 dias en este anio. /	");
									sResult = "";
								}
								break;
							default:
								System.out.println("");
								break;
						}
					}						
						System.out.println(sResult);
					
				}
			}
			
		}
		
	}	
		
}
