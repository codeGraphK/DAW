import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Iterator;

public class OperacionesRegistroPersonas {

    private File f;

    public OperacionesRegistroPersonas(File fileIn) {
        this.f = fileIn;
    }

    public void altaPersona(Persona perIn) {
        HashMap<String, Persona> perSetHash = getHashMap();
        perSetHash.put(perIn.getsDni(), perIn);
        setFile(perSetHash);
    }

    public void buscarPersona(String dniIn) {
        HashMap<String, Persona> perHash = getHashMap();
        if (perHash.containsKey(dniIn))
            System.out.println(perHash.get(dniIn).toString());
        else
            System.out.println("No existe la persona.");
    }

    public void listadoPersonas() {
        Iterator<Persona> itPers = getHashMap().values().iterator();
        while (itPers.hasNext())
            System.out.println(itPers.next().toString());
    }

    public void eliminarPersona(String dniIn) {
        HashMap<String, Persona> delHash = getHashMap();
        System.out.println("Persona eliminada: " + delHash.remove(dniIn).toString());
        setFile(delHash);
    }

    private HashMap<String, Persona> getHashMap() {
        HashMap<String, Persona> hashResult = new HashMap<String, Persona>();
        FileInputStream flujoEntrada = null;
        ObjectInputStream filtroEntrada = null;

        try {
            flujoEntrada = new FileInputStream(this.f);
            filtroEntrada = new ObjectInputStream(flujoEntrada);

            while (true) {
                Persona perNow = (Persona) filtroEntrada.readObject();
                hashResult.put(perNow.getsDni(), perNow);
            }

        } catch (EOFException e) {
            System.out.println("Lista de Personas");
        } catch (IOException e) {
            System.out.println("Error de entrada-salida.");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Excepción no esperada.");
            e.printStackTrace();
        } finally {
            try {
                flujoEntrada.close();
                filtroEntrada.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return hashResult;
    }

    private boolean setFile(HashMap<String, Persona> hashIn) {
        boolean bDone = true;
        FileOutputStream flujoSalida = null;
        ObjectOutputStream filtroSalida = null;

        try {
            flujoSalida = new FileOutputStream(this.f);
            filtroSalida = new ObjectOutputStream(flujoSalida);

            Iterator<Persona> itValues = hashIn.values().iterator();
            while (itValues.hasNext())
                filtroSalida.writeObject(itValues.next());

        } catch (IOException e) {
            System.out.println("Error de entrada-salida.");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Excepción no esperada.");
            e.printStackTrace();
        } finally {
            try {
                flujoSalida.close();
                filtroSalida.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return bDone;
    }

    public File getF() {
        return f;
    }

    public void setF(File f) {
        this.f = f;
    }
}