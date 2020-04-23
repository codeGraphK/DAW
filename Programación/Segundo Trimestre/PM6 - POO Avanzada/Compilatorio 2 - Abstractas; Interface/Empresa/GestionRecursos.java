import java.util.ArrayList;

/**
 * GestionRecursos
 */
public class GestionRecursos {

    private ArrayList<Empleado> listadoRecursos;

    public GestionRecursos() {
        this.listadoRecursos = new ArrayList<Empleado>();
    }

    public ArrayList<Empleado> getListadoRecursos() {
        return listadoRecursos;
    }

    public void setListadoRecursos(ArrayList<Empleado> listadoRecursos) {
        this.listadoRecursos = listadoRecursos;
    }

    public Empleado buscarEmpleado(Empleado empleadoIn) {
        Empleado empResult = null;
        if (equals(empleadoIn))
            empResult = this.listadoRecursos.get(this.listadoRecursos.indexOf(empleadoIn));
        return empResult;
    }

    public Empleado buscarEmpleado(String idEmpleadoIn) {
        Empleado empResult = null;
        for (int i = 0; i < this.listadoRecursos.size() && empResult == null; i++) {
            if (this.listadoRecursos.get(i).getsIdEmp() == idEmpleadoIn)
                empResult = this.listadoRecursos.get(i);
        }
        return empResult;
    }

    public boolean AltaRecurso(Empleado empleadoIn) {
        boolean bResult = false;
        if (empleadoIn != null && equals(empleadoIn)) {
            this.listadoRecursos.add(empleadoIn);
            bResult = !bResult;
        }
        return bResult;
    }

    public boolean ModificarRecurso(Empleado empleadoIn) {
    }

    public boolean EliminarRecurso(Empleado empleadoIn) {
        boolean bResult = false;
        if (empleadoIn != null && !equals(empleadoIn)) {
            this.listadoRecursos.remove(empleadoIn);
            bResult = !bResult;
        }
        return bResult;
    }

    public String DetalleDeRecurso(Empleado empleadoIn) {
        String sResult = "";
        if (buscarEmpleado(empleadoIn) != null)
            sResult = buscarEmpleado(empleadoIn).toString();
        return sResult;
    }

    public String ListadoDeRecursos(Empleado empleadoIn) {
        String sResult = "";
        for (Empleado empleado : this.listadoRecursos) {
            sResult += empleado.toString();
        }
        return sResult;
    }

    public boolean equals(Empleado empleadoIn) {
        boolean bResult = false;
        for (int i = 0; i < this.listadoRecursos.size() && !bResult; i++) {
            if (empleadoIn.getsDni() == listadoRecursos.get(i).getsDni()
                    || buscarEmpleado(empleadoIn.getsIdEmp()) != null || this.listadoRecursos.contains(empleadoIn))
                bResult = !bResult;
        }
        return bResult;
    }

}