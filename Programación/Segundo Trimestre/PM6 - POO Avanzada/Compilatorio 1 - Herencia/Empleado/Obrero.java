public class Obrero extends Empleado {

    public Obrero() {
        super();
    }

    public Obrero(int sueldo) {
        super(sueldo);
    }

    public void setSueldo(int sueldoBase) {
        this.iSueldoBase = sueldoBase;
    }

    public void imprimirDatos() {
        super.imprimirDatos();
    }

}