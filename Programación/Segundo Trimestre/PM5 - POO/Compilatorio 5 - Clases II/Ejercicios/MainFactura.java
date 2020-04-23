import java.io.*;

public class MainFactura {

    // Página 195, Ejercicio (17) Done.
    // 18 y el Done.
    // 23. Done.
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader rdAll = new BufferedReader(new InputStreamReader(System.in));

        /* Factura fac1 = new Factura("x001", 100, 2.5);
        Factura fac2 = new Factura("x002", 125, 5.0);
        Factura fac3 = new Factura("x001", 150, 7);
        Factura fac4 = new Factura("x005", 200, 10);
        Factura fac5 = new Factura("x003", 175, 3.5);

        Factura[] FacturasCreadas = new Factura[Factura.iContadorFacturas];

        FacturasCreadas[0] = fac1;
        FacturasCreadas[1] = fac2;
        FacturasCreadas[2] = fac3;
        FacturasCreadas[3] = fac4;
        FacturasCreadas[4] = fac5; */

        Factura[] FacturasCreadas = new Factura[5];

        Factura fac1 = new Factura("", 0, 0);
        Factura fac2 = new Factura("", 0, 0);
        Factura fac3 = new Factura("", 0, 0);
        Factura fac4 = new Factura("", 0, 0);
        Factura fac5 = new Factura("", 0, 0);
        
        FacturasCreadas[0] = fac1;
        FacturasCreadas[1] = fac2;
        FacturasCreadas[2] = fac3;
        FacturasCreadas[3] = fac4;
        FacturasCreadas[4] = fac5;

        for(int iCont = 0; iCont < FacturasCreadas.length;iCont++) {
            System.out.println("Introduce el código del Artículo:");
            FacturasCreadas[iCont].setCodArticulo(rdAll.readLine());
            System.out.println("Introduce la cantidad de litros vendidos:");
            FacturasCreadas[iCont].setLitros(Integer.parseInt(rdAll.readLine()));
            System.out.println("Introduce el precio por Litro:");
            FacturasCreadas[iCont].setPrecioLitro(Double.parseDouble(rdAll.readLine()));
        }

        int [] xResultado = Factura.Operaciones(FacturasCreadas);

        System.out.println("La facturación total fue de: " + xResultado[0] + "€");
        System.out.println("Se vendieron del artículo 1 <" + xResultado[1] + "> litros");
        System.out.println("Se emitieron " + xResultado[2] + " facturas de más de 600€");
    }
}