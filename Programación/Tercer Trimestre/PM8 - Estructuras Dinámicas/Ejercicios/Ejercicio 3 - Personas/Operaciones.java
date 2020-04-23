import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

/**
 * Operaciones
 */
public class Operaciones {

    Hashtable <String, Persona> hashTableOp;

    public Operaciones() {
        this.hashTableOp = new Hashtable <String, Persona> ();
    }

    public void listarEnumeration() {
        Enumeration <Persona> enuMain = this.hashTableOp.elements();

        while(enuMain.hasMoreElements()) {
            Persona currentOne = enuMain.nextElement();
            System.out.println(currentOne.mostrarDatos());
        }
    }

    public void listarIterator() {
        Iterator <Persona> iterator = (this.hashTableOp.values()).iterator();

        while (iterator.hasNext()) {
            Persona currentOne = iterator.next();
            System.out.println(currentOne.mostrarDatos());
        }
    }

    public void listarClaves() {
        Iterator <String> iterator = (this.hashTableOp.keySet()).iterator();

        while (iterator.hasNext()) {
            String currentKey = iterator.next();
            System.out.println(currentKey);
        }
    }

    public boolean eliminarPorDni(String dniIn) {
        boolean bResult = false;
        
        try {
            if (hashTableOp.containsKey(dniIn) && this.hashTableOp.remove(dniIn) != null) {
                bResult = !bResult;
            }
        } catch (NullPointerException e) {
            System.out.println("Valor introducido es null");
        }

        return bResult;
    }

    public int eliminarPorApellido(String apellidoIn) {
        Enumeration <Persona> enuMain = this.hashTableOp.elements();
        int contEliminados = 0;

        while (enuMain.hasMoreElements()) {
            Persona currentOne = enuMain.nextElement();
            if (currentOne.getsApellido().equals(apellidoIn) && this.hashTableOp.remove(currentOne.getsDni(), currentOne)) {
                contEliminados++;
            }
        }

        return contEliminados;
    }

    public int eliminarContengaLetra(Character charIn) {
        Enumeration <Persona> enuMain = this.hashTableOp.elements();
        int contEliminados = 0;

        try {
            while (enuMain.hasMoreElements()) {
                Persona currentOne = enuMain.nextElement();
                if(currentOne.getsNombre().indexOf(charIn.toString()) != -1 && this.hashTableOp.remove(currentOne.getsDni(), currentOne)) {
                    contEliminados++;
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Valor introducido es null");
        }


        return contEliminados;
    }

	public Hashtable<String, Persona> getHashTableOp() {
		return hashTableOp;
	}
    
}