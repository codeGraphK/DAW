import java.util.PriorityQueue;

public class mainPersona {

    public static void main(String[] args) {
        
        PriorityQueue <Persona> pQueue = new PriorityQueue<Persona>();

        Persona personaUno = new Persona("1777777K", "Miguel", "Gracia", 18, 1.65, pQueue);
        Persona personaDos = new Persona("2888888M", "Carlos", "Mendez", 19, 1.66, pQueue);
        Persona personaTres = new Persona("3387423B", "Larry", "Ruiz", 20, 1.68, pQueue);
        Persona personaCuatro = new Persona("4222222L", "Diego", "Peña", 21, 1.70, pQueue);
        Persona personaCinco = new Persona("5454545G", "Ruben", "Ruiz", 22, 1.71, pQueue);
        Persona personaSeis = new Persona("6328732N", "Javier", "Díaz", 23, 1.72, pQueue);
        Persona personaSiete = new Persona("7821232F", "Jose", "Heredia", 24, 1.77, pQueue);
        Persona personaOcho = new Persona("8287373A", "Luis", "Ramos", 25, 1.82, pQueue);
        Persona personaNueve = new Persona("9324422C", "Andres", "Jiménez", 26, 1.90, pQueue);
        Persona personaDiez = new Persona("1023342M", "Simon", "Daniel", 27, 1.93, pQueue);
        Persona personaOnce = new Persona("8023342M", "Daniel", "Mendez", 27, 1.93, pQueue);

        unQueue(pQueue);

    }

    public static void unQueue(PriorityQueue <Persona> pqIn) {
        while (!pqIn.isEmpty()) {
            System.out.println(pqIn.poll().mostrarDatos());
        }
    }

}