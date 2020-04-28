package colecciones;

import java.util.Comparator;

/**
 * comparadorString
 */
public class comparadorString implements Comparator <String> {

	@Override
	public int compare(String strUno, String strDos) {
        return strDos.compareTo(strUno);
    }

    
}