public class Jefe extends EmpleadoConGratificaciones {

    public Jefe(int sueldoBase, int montoGratificacion) {
        this.iSueldoBase = sueldoBase;
        this.iMontoGratificacion = montoGratificacion;
    }

    public int calcularSueldo() {
        return super.calcularSueldo() * 3;
    }

    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println(iMontoGratificacion);
    }

}