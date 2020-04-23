import java.util.ArrayList;

/**
 * Jefe
 */
public class Jefe extends Empleado {

    private ArrayList<Operario> listadoOperarios;

    public Jefe(String sDni, String sNombre, String sApellidos, double dSalario) {
        super(sDni, sNombre, sApellidos, dSalario);
        this.listadoOperarios = new ArrayList<Operario>();
    }

    public ArrayList<Operario> getListadoOperarios() {
        return listadoOperarios;
    }

    public void setListadoOperarios(ArrayList<Operario> listadoOperarios) {
        this.listadoOperarios = listadoOperarios;
    }

    @Override
    public String toString() {
        return super.toString() + " Jefe [listadoOperarios=" + listadoOperarios + "]";
    }

}