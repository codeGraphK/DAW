/**
 * Empleado
 */
public abstract class Empleado extends Persona {

    private String sIdEmp;
    private double dSalario;
    private double dBonus;
    private static int empCount = 1;

    public Empleado(String sDni, String sNombre, String sApellidos, double dSalario) {
        super(sDni, sNombre, sApellidos);
        this.sIdEmp = asignarIdEmpleado();
        this.dSalario = dSalario;
        empCount++;
    }

    public String getsIdEmp() {
        return sIdEmp;
    }

    public double getdSalario() {
        return dSalario;
    }

    public double getdBonus() {
        return dBonus;
    }

    private String asignarIdEmpleado() {
        int iHere = empCount, iCont = 0;
        String sResult = "";
        while (iHere != 0) {
            iCont++;
            iHere /= 10;
        }
        for (int i = 0; i < 4 - iCont; i++) {
            sResult += 0;
        }
        return sResult + empCount;
    }

    @Override
    public String toString() {
        return super.toString() + " Empleado [dBonus=" + dBonus + ", dSalario=" + dSalario + ", sIdEmp=" + sIdEmp + "]";
    }
}