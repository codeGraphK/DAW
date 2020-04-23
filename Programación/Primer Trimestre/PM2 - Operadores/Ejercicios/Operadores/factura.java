package Operadores;

import java.io.*;

public class factura {
	
	
	
	public static void main(String[] args) {
	
		int iUnids, iTotal;
		double dPrecio, dImport, dIva, dIvasum;
		char euro = "€".charAt(0);
		
		iUnids = Integer.parseInt(args[0]);
		dPrecio = Double.parseDouble(args[1]);
		
		dImport = iUnids*dPrecio;
		dIva = dImport*0.21;
		dIvasum = dImport+dIva;
		
		iTotal = (int)dIvasum;
		
		System.out.println("Cantidad:" + " " + iUnids);
		System.out.println("Precio:" + " " + dPrecio + "€");
		System.out.println("Importe:" + " " + dImport + "€");
		System.out.println("Iva 21%:" + " " + dIva + "€");
		System.out.println("Total:" + " " + iTotal + "€");
	
	}

}