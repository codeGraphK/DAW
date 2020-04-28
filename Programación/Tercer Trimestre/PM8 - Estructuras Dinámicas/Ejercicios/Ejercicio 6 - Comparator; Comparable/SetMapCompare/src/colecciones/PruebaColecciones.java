package colecciones;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class PruebaColecciones implements Comparator<Usuario> {

    public static void main(String[] args) {

        /* Conjuntos ordenados */

        TreeSet <String> strTreeSet = new TreeSet<String>();

        strTreeSet.add("he");
        strTreeSet.add("works");
        strTreeSet.add("hard");
        strTreeSet.add("run");
        strTreeSet.add("out");
        strTreeSet.add("from");
        strTreeSet.add("my");
        strTreeSet.add("eyes");
        strTreeSet.add("everyday");
        strTreeSet.add("try");

        for (String string : strTreeSet) {
            System.out.println(string);
        }

        TreeSet <Usuario> usTreeSet = new TreeSet<Usuario>();

        usTreeSet.add(new Usuario("Michael", "michael@michael.com", "01-01-2001"));
        usTreeSet.add(new Usuario("Michael", "michael@michael2.com", "06-06-2006"));
        usTreeSet.add(new Usuario("Michael", "michael@michael3.com", "06-06-2006"));
        usTreeSet.add(new Usuario("Freddy", "freddy@freddy.com", "02-02-2002"));
        usTreeSet.add(new Usuario("Bruno", "bruno@bruno.com", "03-03-2003"));
        usTreeSet.add(new Usuario("David", "david@david.com", "04-04-2004"));
        usTreeSet.add(new Usuario("Charles", "charles@charles.com", "05-05-2005"));
        
        System.out.println("\nOrden Alfabético");
        
        Iterator <Usuario> itUser = usTreeSet.iterator();
        while (itUser.hasNext())
            System.out.println(itUser.next());
        
        TreeSet <Usuario> userTreeSet = new TreeSet<Usuario>(new PruebaColecciones());
        
        userTreeSet.addAll(usTreeSet);

        System.out.println("\nOrden Inverso");

        for (Usuario usuario : userTreeSet) {
            System.out.println(usuario.toString());
        }

        ArrayList <Usuario> arrayList = new ArrayList<>(userTreeSet);
        arrayList.sort(new PruebaColecciones().reversed());

        System.out.println("\nArrayList");

        for (Usuario usuario : arrayList) {
            System.out.println(usuario.toString());
        }

        /* Mapas con claves ordenadas */

        TreeMap <String, Usuario> userTreeMap = new TreeMap<>();

        for (Usuario usuario : userTreeSet) {
            userTreeMap.put(usuario.getsNombre(), usuario);
        }

        Iterator <String> itTreeMap = userTreeMap.keySet().iterator();

        System.out.println("\nUserTreeMap Keys");

        while (itTreeMap.hasNext()) {
            System.out.println(itTreeMap.next());
        }

        TreeMap <String, Usuario> userTMDos = new TreeMap<String, Usuario>(new comparadorString());

        userTMDos.putAll(userTreeMap);

        Iterator <String> itKeys = userTMDos.keySet().iterator();

        System.out.println("\nClaves con Comparator");

        while (itKeys.hasNext()) {
            System.out.println(itKeys.next());
        }

    }

	@Override
	public int compare(Usuario o1, Usuario o2) {
		return o2.getsNombre().compareTo(o1.getsNombre());
    }
    
}