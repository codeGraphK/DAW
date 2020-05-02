package Colecciones.src.colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Utilidades
 */
public class Utilidades {
    
    public static void main(String[] args) {

        /* Ejercicio 1 */

        ArrayList <String> aListOut = new ArrayList<String>();

        aListOut.add("and");
        aListOut.add("let");
        aListOut.add("know");
        aListOut.add("had");
        aListOut.add("and");
        aListOut.add("let");
        aListOut.add("dream");
        aListOut.add("dream");
        aListOut.add("know");
        aListOut.add("and");
        
        System.out.println(allRepeats(aListOut).toString());
        
        /* Ejercicio 2 */
        
        HashMap <String, Integer> aHashOut = new HashMap<String, Integer>();
        
        aHashOut.put("police", 1);
        aHashOut.put("stop", 2);
        aHashOut.put("sign", 3);
        aHashOut.put("time", 4);
        aHashOut.put("away", 5);
        aHashOut.put("get", 6);
        aHashOut.put("right", 7);
        aHashOut.put("told", 8);
        aHashOut.put("near", 9);
        aHashOut.put("end", 10);
        
        System.out.println(strWithPairs(aHashOut).toString());

        /* Ejercicio 3 */

        ArrayList <Integer> arrayOut = new ArrayList<Integer>();

        arrayOut.add(2);
        arrayOut.add(3);
        arrayOut.add(3);
        arrayOut.add(3);
        arrayOut.add(4);
        arrayOut.add(5);
        arrayOut.add(4);
        arrayOut.add(6);
        arrayOut.add(4);

        System.out.println(mostRepInteger(arrayOut).toString());

        /* Ejercicio 4 */

        Collection <Object> colOut = new ArrayList<Object>(aListOut);

        System.out.println(trimRepeated(colOut).toString());

        /* Ejercicio 5 */

        Map <String, Object> mapOut = new HashMap<String, Object>(aHashOut);

        System.out.println(getValues(mapOut).toString());

    }

    public static HashMap <String, Integer> allRepeats (ArrayList <String> aListIn) {
        HashMap <String, Integer> hashResult = new HashMap<String, Integer>();

        for (String strActual : aListIn) {
            if(hashResult.containsKey(strActual))
                hashResult.put(strActual, hashResult.get(strActual) + 1);
            else
                hashResult.put(strActual, 1);
        }

        return hashResult;        
    }

    public static ArrayList <String> strWithPairs(HashMap <String, Integer> hashIn) {
        ArrayList <String> aListResult = new ArrayList<String>();
        
        Iterator <String> itStr = hashIn.keySet().iterator();

        while (itStr.hasNext()) {
            String strActual = itStr.next();
            if (hashIn.get(strActual) % 2 == 0 || hashIn.get(strActual) == 2)
                aListResult.add(strActual);
        }

        return aListResult;
    }

    public static ArrayList <Integer> mostRepInteger(ArrayList <Integer> arrayIn) {
        ArrayList <Integer> mostCommons = new ArrayList<Integer>();
        HashMap <Integer, Integer> contInts = new HashMap<Integer,Integer>();
        int iMaxOcurrence = 2;
        boolean bKeep = false;

        for (Integer intActual : arrayIn) {
            if(contInts.containsKey(intActual))
                contInts.put(intActual, contInts.get(intActual) + 1);
            else
                contInts.put(intActual, 1);
        }

        Iterator <Integer> it = contInts.keySet().iterator();

        while (it.hasNext() && !bKeep) {
            int iActual = it.next();
            if (contInts.get(iActual) == iMaxOcurrence) {
                mostCommons.add(iActual);
            } else if (contInts.get(iActual) > iMaxOcurrence) {
                mostCommons.clear();
                iMaxOcurrence = contInts.get(iActual);
                mostCommons.add(iActual);
            }
            if(mostCommons.size() > 0)
                bKeep = contInts.get(mostCommons.get(0)) > (arrayIn.size() / 2);
        }

        return mostCommons;
    }

    public static Collection <Object> trimRepeated(Collection <Object> collectionIn) {
        Collection <Object> colResult = new ArrayList<Object>();

        Iterator <Object> it = collectionIn.iterator();
        while (it.hasNext()) {
            Object actual = it.next();
            if(!colResult.contains(actual))
                colResult.add(actual);
        }

        return colResult;
    }

    public static Set <Object> getValues(Map <String, Object> mapIn) {
        Set <Object> setResult = new HashSet<Object>();

        Iterator <String> itStr = mapIn.keySet().iterator();
        while (itStr.hasNext()) {
            setResult.add(mapIn.get(itStr.next()));
        }

        return setResult;
    }
}