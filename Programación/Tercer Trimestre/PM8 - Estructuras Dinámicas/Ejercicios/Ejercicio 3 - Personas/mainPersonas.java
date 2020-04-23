import java.util.Hashtable;

/**
 * mainPersonas
 */
public class mainPersonas {

    public static void main(String[] args) {
        Operaciones opUno = new Operaciones();

        Persona personaUno = new Persona("1777777K", "Miguel", "Gracia", 18, 1.65, opUno);
        Persona personaDos = new Persona("2888888M", "Carlos", "Mendez", 19, 1.66, opUno);
        Persona personaTres = new Persona("3387423B", "Larry", "Ruiz", 20, 1.68, opUno);
        Persona personaCuatro = new Persona("4222222L", "Diego", "Peña", 21, 1.70, opUno);
        Persona personaCinco = new Persona("5454545G", "Ruben", "Ruiz", 22, 1.71, opUno);
        Persona personaSeis = new Persona("6328732N", "Javier", "Díaz", 23, 1.72, opUno);
        Persona personaSiete = new Persona("7821232F", "Jose", "Heredia", 24, 1.77, opUno);
        Persona personaOcho = new Persona("8287373A", "Luis", "Ramos", 25, 1.82, opUno);
        Persona personaNueve = new Persona("9324422C", "Andres", "Jiménez", 26, 1.90, opUno);
        Persona personaDiez = new Persona("1023342M", "Simon", "Daniel", 27, 1.93, opUno);
        

        /* opUno.listarIterator();
        opUno.listarEnumeration();
        opUno.listarClaves(); 
        System.out.println(opUno.eliminarPorDni("9324422C"));
        System.out.println(opUno.eliminarPorApellido("Ruiz"));
        System.out.println(opUno.eliminarContengaLetra('o')); */

        /*
            No noto algún orden o patrón al momento visualizar 
            La tabla, en ninguno de los campos.
        */
    }
}