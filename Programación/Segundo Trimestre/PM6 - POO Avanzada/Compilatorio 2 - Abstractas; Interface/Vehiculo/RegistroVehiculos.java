import java.util.ArrayList;

/**
 * RegistroVehiculos
 */
public class RegistroVehiculos {

    private static int numVehiculos;
    private static ArrayList<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();

    public static boolean registraVehiculo(Vehiculo vehiculoIn) {
        boolean bResult = false;
        if (!existeVehiculo(vehiculoIn) || buscaVehiculo(vehiculoIn.getsMatricula()) != null) {
            bResult = listaVehiculos.add(vehiculoIn);
        }
        return bResult;
    }

    public static Vehiculo buscaVehiculo(String matriculaIn) {
        Vehiculo vResult = null;
        boolean bKeep = true;
        for (int i = 0; i < listaVehiculos.size() && bKeep; i++) {
            if (listaVehiculos.get(i).getsMatricula() == matriculaIn) {
                vResult = listaVehiculos.get(i);
                bKeep = !bKeep;
            }
        }
        return vResult;
    }

    public static boolean existeVehiculo(Vehiculo vehiculoIn) {
        return listaVehiculos.contains(vehiculoIn);
    }

    public static String mostrarTodosPrecios(int diasIn) {
        String sResult = "";
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo instanceof Coche) {
                sResult += ((Coche) vehiculo).getsMatricula() + " " + ((Coche) vehiculo).precioAlquiler(diasIn) + "\n";
            }
            if (vehiculo instanceof Microbus) {
                sResult += ((Microbus) vehiculo).getsMatricula() + " " + ((Microbus) vehiculo).precioAlquiler(diasIn)
                        + "\n";
            }
            if (vehiculo instanceof Furgoneta) {
                sResult += ((Furgoneta) vehiculo).getsMatricula() + " " + ((Furgoneta) vehiculo).precioAlquiler(diasIn)
                        + "\n";
            }
            if (vehiculo instanceof Camión) {
                sResult += ((Camión) vehiculo).getsMatricula() + " " + ((Camión) vehiculo).precioAlquiler(diasIn)
                        + "\n";
            }
        }
        return sResult;
    }

    public static int getNumVehiculos() {
        numVehiculos = listaVehiculos.size();
        return numVehiculos;
    }

    public static ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

}