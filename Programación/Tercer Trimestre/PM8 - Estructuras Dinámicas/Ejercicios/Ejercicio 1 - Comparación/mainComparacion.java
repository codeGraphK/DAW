import java.util.ArrayList;
import java.util.LinkedList;

/**
 * mainComparación
 */
public class mainComparacion {

    public static void main(String[] args) {
        int conteo = 0;
        for (long longer : devolverDatos()) {
            String definition = "";
            switch (conteo) {
                case 0:
                case 1:
                    definition = " en cargar";
                    break;
                case 2:
                case 3:
                    definition = " en buscar";
                    break;
                case 4:
                case 5:
                    definition = " en eliminar";
                    break;
                default:
                    break;
            }
            if(conteo % 2 == 0)
                definition += " ArrayList";
            else
                definition += " LinkedList";
            System.out.println(longer + " miliseconds" + definition);
            conteo++;
        }
    }

    public static int [] devolverDatos() {
        int [] iAResult = new int [6];
        ArrayList <Integer> aIntegers = new ArrayList<Integer>();
        long before, after;
        LinkedList <Integer> aLinkedList = new LinkedList<Integer>();
        int tiempoEnCargarArray, tiempoEnCargarLinked,
        tiempoBuscarArray, tiempoBuscarLinked,
        tiempoDeleteArray, tiempoDeleteLinked, randomNumber;
        
        /* Tiempo en rellenar el ArrayList */
        before = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            aIntegers.add(i);
        }
        after = System.currentTimeMillis();
        tiempoEnCargarArray = (int)(after - before);
        
        /* Tiempo en rellenar el LinkedList */
        before = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            aLinkedList.add(i);
        }
        after = System.currentTimeMillis();
        tiempoEnCargarLinked = (int)(after - before);
        
        /* Tiempo en buscar en ArrayList */
        randomNumber = (int)(Math.random() * 1000000);
        before = System.currentTimeMillis();
        aIntegers.indexOf(randomNumber);
        after = System.currentTimeMillis();
        tiempoBuscarArray = (int)(after - before);
        
        /* Tiempo en buscar en LinkedList */
        randomNumber = (int)(Math.random() * 1000000);
        before = System.currentTimeMillis();
        aLinkedList.indexOf(randomNumber);
        after = System.currentTimeMillis();
        tiempoBuscarLinked = (int)(after - before);
        
        /* Tiempo en eliminar de ArrayList */
        randomNumber = (int)(Math.random() * 1000000);
        before = System.currentTimeMillis();
        aIntegers.remove(aIntegers.indexOf(randomNumber));
        after = System.currentTimeMillis();
        tiempoDeleteArray = (int)(after - before);
        
        /* Tiempo en eliminar de LinkedList */
        randomNumber = (int)(Math.random() * 1000000);
        before = System.currentTimeMillis();
        aLinkedList.remove(aLinkedList.indexOf(randomNumber));
        after = System.currentTimeMillis();
        tiempoDeleteLinked = (int)(after - before);

        iAResult[0] = tiempoEnCargarArray;
        iAResult[1] = tiempoEnCargarLinked;
        iAResult[2] = tiempoBuscarArray;
        iAResult[3] = tiempoBuscarLinked;
        iAResult[4] = tiempoDeleteArray;
        iAResult[5] = tiempoDeleteLinked;

        return iAResult;
    }
}