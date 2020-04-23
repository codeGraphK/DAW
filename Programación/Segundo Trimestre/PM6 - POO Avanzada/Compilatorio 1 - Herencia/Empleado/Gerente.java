public class Gerente extends EmpleadoConGratificaciones {
    public int bonoAnual;

    public Gerente(int sueldoBase, int bono) {
        this.iSueldoBase = sueldoBase;
        this.bonoAnual = bono;
    }

    public int getBonoAnual() {
        return bonoAnual;
    }

    public int calcularSueldo() {
        return super.calcularSueldo() * 2;
    }

    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println(bonoAnual);
    }

}