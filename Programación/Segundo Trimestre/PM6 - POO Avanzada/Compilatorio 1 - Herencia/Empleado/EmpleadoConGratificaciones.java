public class EmpleadoConGratificaciones extends Empleado {
    public int iMontoGratificacion;

    public EmpleadoConGratificaciones() {
        super();
    }

    public void setiMontoGratificacion(int monto) {
        this.iMontoGratificacion = monto;
    }

    public int getiMontoGratificacion() {
        return iMontoGratificacion;
    }

}