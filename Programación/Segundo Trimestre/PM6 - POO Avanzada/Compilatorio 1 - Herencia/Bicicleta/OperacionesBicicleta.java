import java.io.IOException;
import java.util.ArrayList;

/**
 * OperacionesBicicleta
 */
public class OperacionesBicicleta {

    private static ArrayList<Bicicleta> coleccionBicicletas = new ArrayList<Bicicleta>();

    public static boolean altaBicicleta(Bicicleta biciIn) {
        boolean done = false;
        if (biciIn != null) {
            done = coleccionBicicletas.add(biciIn);
        }
        return done;
    }

    public static void listaBicis() {
        for (Bicicleta bicicleta : coleccionBicicletas) {
            System.out.println(bicicleta.toString());
        }
    }

    public static Bicicleta busquedaBici(int id) {
        Bicicleta foundOne = null;
        for (Bicicleta bicicleta : coleccionBicicletas) {
            if (bicicleta.getCodObject() == id)
                foundOne = bicicleta;
        }
        return foundOne;
    }

    public static void removeBici(int id) {
        coleccionBicicletas.remove(coleccionBicicletas.indexOf(busquedaBici(id)));
    }

    public static boolean cambioBici(Bicicleta toChange, int opcion, int valor)
            throws NumberFormatException, IOException {
        boolean done = false;
        if (toChange != null) {
            switch (opcion) {
            case 1:
                toChange.setVelocidadActual(valor);
                break;
            case 2:
                toChange.cambiarPlato(valor);
                ;
                break;
            case 3:
                toChange.cambiarPinon(valor);
                break;
            case 4:
                ((BicicletaMontana) toChange).cambiarSuspension(valor);
                break;
            case 5:
                ((BicicletaTandem) toChange).setNumAsientos(valor);
                break;
            default:
                break;
            }
            done = true;
        }
        return done;
    }

}