import java.util.HashMap;
import java.util.LinkedHashMap;

public class mainPersona {

    public static void main(String[] args) {
        
        /*  Creamos una lista de personas cuya clave es el dni, la cual
            estará ordenada por orden de inserción. */
        LinkedHashMap <String, Persona> linkedHashMap = new LinkedHashMap<String, Persona>();

        /* Inserta 5 personas */
        Persona perUno = new Persona("888K", "Luis");
        Persona perDos = new Persona("555F", "Cristian");
        Persona perTre = new Persona("999L", "Miguel");
        Persona perCua = new Persona("777M", "Lauren");
        Persona perCin = new Persona("222S", "Sofía");

        linkedHashMap.put(perUno.getsDni(), perUno);
        linkedHashMap.put(perDos.getsDni(), perDos);
        linkedHashMap.put(perTre.getsDni(), perTre);
        linkedHashMap.put(perCua.getsDni(), perCua);
        linkedHashMap.put(perCin.getsDni(), perCin);

        /* Convierte esa lista en un conjunto cuyo orden no es importante */
        HashMap <String, Persona> hashMap = linkedHashMap;

        /*  Realizamos una conversión explícita debido a que la clase
            LinkedHashMap es una subclase que hereda de la clase HashMap.
            Por lo cual nuestra LinkedHashMap ya es de por sí un HashMap
            Y se lo podemos asignar de la previa forma. */
    }

}