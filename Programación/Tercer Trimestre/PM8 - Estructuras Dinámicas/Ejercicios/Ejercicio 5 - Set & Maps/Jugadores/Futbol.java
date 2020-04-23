import java.util.HashSet;
import java.util.Iterator;

public class Futbol {

    public static void main(String[] args) {

        HashSet <Jugador> jugadores = new HashSet<Jugador>();

        boolean bResult = false;

        jugadores.add(new Jugador("Eden Hazard"));
        jugadores.add(new Jugador("Sergio Ramos"));
        jugadores.add(new Jugador("Gareth Bale"));
        jugadores.add(new Jugador("Karim Benzema"));
        jugadores.add(new Jugador("Fede Valverde"));
        jugadores.add(new Jugador("Lionel Messi"));
        jugadores.add(new Jugador("Gerard Piqué"));
        jugadores.add(new Jugador("Sergio Busquets"));
        jugadores.add(new Jugador("Luis Suaréz"));
        jugadores.add(new Jugador("Antoine Griezmann"));

        /* Realiza un bucle sobre los jugadores del conjunto y muestra sus nombres */

        Iterator <Jugador> it = jugadores.iterator();
        while (it.hasNext())
            System.out.println(it.next().getsNombre());

        /* Consulta si en el conjunto existe el jugador "Neymar JR". Avisa si existe o no */

        Jugador ney = new Jugador("Neymar JR");
        it = jugadores.iterator();
        while (it.hasNext() && !bResult) {
            if(it.next().getsNombre().equals(ney.getsNombre()))
                bResult = !bResult;
        }
        System.out.println("\nSe encuentra " + ney.getsNombre() + ": " +  bResult);

        /* Crea un segundo conjunto jugadores2 con los jugadores Piqué y Busquets */

        it = jugadores.iterator();
        HashSet <Jugador> jugadores2 = new HashSet<Jugador>();
        while (it.hasNext() && jugadores2.size() != 2) {
            Jugador actual = it.next();
            if (actual.getsNombre().matches("GERARD PIQUÉ|SERGIO BUSQUETS"))
                jugadores2.add(actual);
        }

        /* Consulta si todos los elementos de jugadores2 existen en jugadores */

        System.out.println("\nContiene jugadores a jugadores2: " + jugadores.containsAll(jugadores2));

        /* Realiza una unión de los conjuntos jugadores y jugadores2 */
        
        System.out.println("\n¿Cambió al añadir? " + jugadores.addAll(jugadores2));

        /* Elimina todos los jugadores del conjutno jugadores2 y muestra el número de jugadores que tiene el conjutno jugadores2 (debería ahora ser cero) */

        jugadores2.clear();
        System.out.println("\nTamaño de jugadores2: " + jugadores2.size());

    }

}