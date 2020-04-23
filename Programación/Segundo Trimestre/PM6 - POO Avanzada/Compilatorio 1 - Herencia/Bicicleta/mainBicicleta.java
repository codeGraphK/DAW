import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mainBicicleta {
    public static void main(String[] args) throws NumberFormatException, IOException {
        /*
         * Bicicleta miBicicleta = new Bicicleta(120, 3, 1); Bicicleta tuBicicleta = new
         * Bicicleta(100, 1, 2); Bicicleta bicicletaRobada = new Bicicleta();
         * BicicletaMontana bicicletaMontana = new BicicletaMontana(60, 4, 1, 100);
         * BicicletaTandem bicicletaTandem = new BicicletaTandem(70, 2, 1, 2); /*
         * Bicicleta bicicletaMontana2 = new BicicletaMontana(); Bicicleta
         * bicicletaTandem2 = new BicicletaTandem();
         * 
         * 
         * Bicicleta[] ArrayBicicleta = new Bicicleta[3];
         * 
         * ArrayBicicleta[0] = miBicicleta; ArrayBicicleta[1] = bicicletaMontana;
         * ArrayBicicleta[2] = bicicletaTandem;
         * 
         * for (Bicicleta bicicleta : ArrayBicicleta) {
         * System.out.print(bicicleta.getClass().getName() + " " +
         * bicicleta.getVelocidadActual() + " - "); bicicleta.acelerar();
         * System.out.println(bicicleta.getVelocidadActual()); }
         * 
         * /* bicicletaMontana.acelerar();
         * 
         * System.out.println(bicicletaMontana.getVelocidadActual());
         */

        MenuOpciones();

    }

    static void MenuOpciones() throws NumberFormatException, IOException {
        BufferedReader rdSomething = new BufferedReader(new InputStreamReader(System.in));
        int opcionMenu = 0;
        while (opcionMenu != 7) {

            System.out.println("1. Bicicleta");
            System.out.println("2. Bicicleta Montaña");
            System.out.println("3. Bicicleta Tandem");
            System.out.println("4. Listar Bicicletas");
            System.out.println("5. Buscar Bicicleta");
            System.out.println("6. Cambiar valor Bicicleta");
            System.out.println("7. Salir");
            System.out.print("Introduce la opción deseada: ");

            opcionMenu = Integer.parseInt(rdSomething.readLine());

            crearBiciCleta(opcionMenu);

        }
    }

    public static void crearBiciCleta(int opcionMenu) throws NumberFormatException, IOException {
        Bicicleta BiciResult = null;
        BufferedReader rdSomething = new BufferedReader(new InputStreamReader(System.in));
        int velocidad = 0, plato = 0, pinon = 0;
        if (opcionMenu != 4 && opcionMenu != 5 && opcionMenu != 6 && opcionMenu != 7) {
            System.out.println("Introduce la velocidad:");
            velocidad = Integer.parseInt(rdSomething.readLine());
            System.out.println("Introduce el plato:");
            plato = Integer.parseInt(rdSomething.readLine());
            System.out.println("Introduce el piñón:");
            pinon = Integer.parseInt(rdSomething.readLine());
        }

        switch (opcionMenu) {
        case 1:
            BiciResult = new Bicicleta(velocidad, plato, pinon);
            if (!OperacionesBicicleta.altaBicicleta(BiciResult)) {
                System.out.println("Ha ocurrido un error");
            } else {
                System.out.println("Hecho.");
            }
            System.out.println("Creado objeto Bicicleta");
            break;
        case 2:
            int suspension;
            System.out.println("Introduce la suspension:");
            suspension = Integer.parseInt(rdSomething.readLine());
            BiciResult = new BicicletaMontana(velocidad, plato, pinon, suspension);
            if (!OperacionesBicicleta.altaBicicleta(BiciResult)) {
                System.out.println("Ha ocurrido un error");
            } else {
                System.out.println("Hecho.");
            }
            System.out.println("Creado objeto Bicicleta Montana");
            break;
        case 3:
            int asientos;
            System.out.println("Introduce los asientos:");
            asientos = Integer.parseInt(rdSomething.readLine());
            BiciResult = new BicicletaTandem(velocidad, plato, pinon, asientos);
            if (!OperacionesBicicleta.altaBicicleta(BiciResult)) {
                System.out.println("Ha ocurrido un error");
            } else {
                System.out.println("Hecho.");
            }
            System.out.println("Creado objeto Bicicleta Tandem");
            break;
        case 4:
            OperacionesBicicleta.listaBicis();
            break;
        case 5:
            int idIn;
            System.out.println("Introduce el id:");
            idIn = Integer.parseInt(rdSomething.readLine());
            System.out.println(OperacionesBicicleta.busquedaBici(idIn).toString());
            break;
        case 6:
            int idInn;
            System.out.println("Introduce el id:");
            idInn = Integer.parseInt(rdSomething.readLine());
            Bicicleta toChange = OperacionesBicicleta.busquedaBici(idInn);
            System.out.println("1. velocidad");
            System.out.println("2. plato");
            System.out.println("3. pinon");
            if (toChange instanceof BicicletaMontana) {
                System.out.println("4. suspension");
            } else if (toChange instanceof BicicletaTandem)
                System.out.println("5. numAsientos");
            System.out.print("Introduce la opción deseada: ");
            int opcion = Integer.parseInt(rdSomething.readLine()), valor;
            System.out.print("Introduce el valor deseado: ");
            valor = Integer.parseInt(rdSomething.readLine());
            if (!OperacionesBicicleta.cambioBici(toChange, opcion, valor)) {
                System.out.println("Ha ocurrido un error.");
            } else {
                System.out.println("Hecho.");
            }
            break;
        case 7:
            break;
        default:
            System.out.println("Numero incorrecto");
            break;
        }
    }
}