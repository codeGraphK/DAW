import java.util.HashMap;
import java.util.Iterator;

/**
 * Colegio
 */
public class Colegio {

    HashMap <String, Integer> nacionalidadesMap;

    public Colegio () {
        this.nacionalidadesMap = new HashMap<String, Integer>();
    }

	public Colegio(HashMap<String, Integer> nacionalidadesMap) {
		this.nacionalidadesMap = nacionalidadesMap;
    }
    
    public boolean aniadirNacionalidad(String nacionIn) {
        boolean bResult = false;
        if(!this.nacionalidadesMap.containsKey(nacionIn.toUpperCase())) {
            this.nacionalidadesMap.put(nacionIn.toUpperCase(), 1);
            bResult = !bResult;
        } else {
            this.nacionalidadesMap.put(nacionIn.toUpperCase(), this.nacionalidadesMap.get(nacionIn.toUpperCase()) + 1);
            bResult = !bResult;
        }
        return bResult;
    }

    public String listadoNacionalidades() {
        String sResult = "\nNacionalidad\tEstudiantes\n";
        Iterator <String> it = this.nacionalidadesMap.keySet().iterator();
        while(it.hasNext()) {
            String actual = it.next();
            sResult += actual + (actual.length() < 8 ? "\t\t" : "\t") + this.nacionalidadesMap.get(actual) + "\n";
        }
        return sResult;
    }
    
    public String mostrarAlumnos(String nacionIn) {
        String sResult = "Nacionalidad\tEstudiantes\n";
        if(this.nacionalidadesMap.containsKey(nacionIn.toUpperCase()))
            sResult += nacionIn.toUpperCase() + (nacionIn.length() < 8 ? "\t\t" : "\t") + this.nacionalidadesMap.get(nacionIn.toUpperCase());
        return sResult;
    }

    public String nacionalidades() {
        String sResult = "\nNacionalidad\n";
        Iterator <String> it = this.nacionalidadesMap.keySet().iterator();
        while (it.hasNext())
            sResult += it.next() + "\n";
        return sResult;
    }

    public boolean eliminar() {
        boolean bResult = false;
        this.nacionalidadesMap.clear();
        if(nacionalidadesMap.isEmpty())
            bResult = !bResult;
        return bResult;
    }
    
}