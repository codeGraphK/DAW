public class Empleado {
    public String sNombre;
    public int iSueldoBase;

    public Empleado() {

    }

    public Empleado(int sueldoBase) {
        iSueldoBase = sueldoBase;
    }

    public void setsNombre(String nom) {
        this.sNombre = nom;
    }

    public int getSueldoBase() {
        return iSueldoBase;
    }

    public int calcularSueldo() {
        return this.iSueldoBase;
    }

    public void imprimirDatos() {
        System.out.println(sNombre + iSueldoBase);
    }
}