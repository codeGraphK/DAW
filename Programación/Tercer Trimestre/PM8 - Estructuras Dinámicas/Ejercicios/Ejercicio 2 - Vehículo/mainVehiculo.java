import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * mainVehiculo
 */
public class mainVehiculo {

    public static void main(String[] args) {
        HashSet <Vehiculo> setVehiculos = new HashSet<Vehiculo>();
        HashMap <String,Vehiculo> mapVehiculos = new HashMap<String,Vehiculo>();

        Vehiculo cocheUno = new Coche("Audi", "rojo", "electrico", "1234JKL", 1.75, 3.25);
        Vehiculo cocheDos = new Coche("Seat", "azul", "gasolina", "7890FDS", 1.6, 3.5);
        Vehiculo motoUno = new Moto("Suzuki", "negra", "gasolina", "3487DFJ", "Deportiva");
        Vehiculo motoDos = new Moto("Yamaha", "marron", "gasolina", "9012LAS", "Trail");
        Vehiculo motoTres = new Moto("AKT", "blanca", "electrico", "8484SDA", "Nacked");

        setVehiculos.add(motoTres);
        setVehiculos.add(cocheUno);
        setVehiculos.add(cocheDos);
        setVehiculos.add(motoUno);
        setVehiculos.add(motoDos);

        mapVehiculos.put(cocheUno.getsMatricula(), cocheUno);
        mapVehiculos.put(cocheDos.getsMatricula(), cocheDos);
        mapVehiculos.put(motoUno.getsMatricula(), motoUno);
        mapVehiculos.put(motoDos.getsMatricula(), motoDos);
        mapVehiculos.put(motoTres.getsMatricula(), motoTres);

        System.out.println("--------- HASHSET ---------");
        listadoVehiculos(setVehiculos);
        System.out.println("--------- HASHMAP ---------");
        listadoVehiculos(mapVehiculos);
    }

    public static void listadoVehiculos(HashSet <Vehiculo> hashIn) {
        Iterator <Vehiculo> posActual = hashIn.iterator();

        String ListadoCoches = "", ListadoMotos = "";

        while(posActual.hasNext()){
            Vehiculo here = posActual.next();
            if(here instanceof Coche){
                ListadoCoches += ((Coche)here).mostrarDatos() + "\n";
            } else if (here instanceof Moto){
                ListadoMotos += ((Moto)here).mostrarDatos() + "\n";
            }
        }

        System.out.println("Listado de coches:");
        System.out.println("Marca\tColor\tCombustible\tMatrícula\tAncho\tLargo");
        System.out.println("--------------------------------------------------------------");
        System.out.println(ListadoCoches);
        
        System.out.println("\nListado de motos:");
        System.out.println("Marca\tColor\tCombustible\tMatrícula\tTipo");
        System.out.println("----------------------------------------------------------");
        System.out.println(ListadoMotos);
    }
    
    public static void listadoVehiculos(HashMap <String,Vehiculo> hashIn) {
        String ListadoCoches = "", ListadoMotos = "";

        for (Vehiculo vehiculoActual : hashIn.values()) {
            if(vehiculoActual instanceof Coche){
                ListadoCoches += ((Coche)vehiculoActual).mostrarDatos() + "\n";
            } else if (vehiculoActual instanceof Moto){
                ListadoMotos += ((Moto)vehiculoActual).mostrarDatos() + "\n";
            }
        }

        System.out.println("Listado de coches:");
        System.out.println("Marca\tColor\tCombustible\tMatrícula\tAncho\tLargo");
        System.out.println("--------------------------------------------------------------");
        System.out.println(ListadoCoches);
        
        System.out.println("\nListado de motos:");
        System.out.println("Marca\tColor\tCombustible\tMatrícula\tTipo");
        System.out.println("----------------------------------------------------------");
        System.out.println(ListadoMotos);
    }
}