import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.TreeSet;

/**
 * ArbolAleatorio
 */
public class ArbolAleatorio implements Comparator <Integer> {

    public static void main(String[] args) {
        TreeSet <Integer> parTS = new TreeSet<Integer>(), imparTS = new TreeSet<Integer>(new ArbolAleatorio());
        
        /*  Llamamos al método 25 veces y vamos insertando en un conjunto u otro
            dependiendo si el número es par o impar. */

        for (int i = 0; i < 25; i++) {
            int iResult = getInt();
            if(iResult % 2 == 0 || iResult == 2)
                parTS.add(iResult);
            else
            imparTS.add(iResult);
        }
        
        /* Después muestra por consola el contenido de cada conjunto */

        String contentTreeSets = "Pares\tImpares\n";
        Iterator <Integer> itPar = parTS.iterator(), itImpar = imparTS.iterator();
        while(itPar.hasNext() || itImpar.hasNext()) {
            try {
                contentTreeSets += itPar.next() + "\t";
            } catch (NoSuchElementException e) {
                /*  Si no tenemos más pares, inserta un tab para
                    escribir el siguiente impar */
                contentTreeSets += "\t";
            }
            
            try {
                contentTreeSets += itImpar.next() + "\n";
            } catch (NoSuchElementException e) {
                /*  Si no tenemos más impares, inserta una línea
                    para escribir el siguiente par */
                contentTreeSets += "\n";
            }
        }
        System.out.println(contentTreeSets);

        /*  Finalmente une los dos conjutnos en uno llamado número y
            muestra por consola todos los números de ese conjunto */

        TreeSet <Integer> numeroTS = new TreeSet<Integer>(new ArbolAleatorio());

        numeroTS.addAll(parTS);
        numeroTS.addAll(imparTS);

        System.out.println("número = " + numeroTS.toString());
    }

    private static int getInt() {
        return (int)(Math.random() * 500) + 1;
    }

	@Override
	public int compare(Integer o1, Integer o2) {
		return o1 - o2;
	}
    
}