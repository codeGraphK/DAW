package pack2;

public class Empleado {

	private String sDni;
	private String sNombre;
	private String sApellido1;
	private String sApellido2;
	private String sDireccion;
	private int iNumEmp;
	
	public Empleado (String dni, String nombre, String apellido1, int numEmp) {
		sDni = dni;
		sNombre = nombre;
		sApellido1 = apellido1;
		iNumEmp = numEmp;
		sApellido2 = "";
		sDireccion = "";
	}
	public Empleado (String dni, String nombre, String apellido1, String apellido2, String direccion, int numEmp) {
		sDni = dni;
		sNombre = nombre;
		sApellido1 = apellido1;
		sApellido2 = apellido2;
		sDireccion = direccion;
		iNumEmp = numEmp;
	}
	
	private int NumDigitos(int numEmp) {
		
		int cont = 0;
		
		while(numEmp > 0) {
			numEmp /= 10;
			cont++;
		}
		
		return cont;
		
	}
	
	/* ------------------------ */
	
	public String getDni() {
		return sDni;
	}
	
	public void setDni(String dni) {
		this.sDni = dni;
	}
	
	public String getNombre(String nombre) {
		return sNombre;
	}
	
	public void setNombre(String nombre) {
		this.sNombre = nombre;
	}
	
	public String getApellido1() {
		return sApellido1;
	}
	
	public void setApellido1(String apellido1) {
		this.sApellido1 = apellido1;
	}
	
	public String getApellido2() {
		return sApellido2;
	}
	
	public void setApellido2(String apellido2) {
		this.sApellido2= apellido2;
	}
	
	public String getDireccion() {
		return sDireccion;
	}
	
	public void setDireccion(String direccion) {
		this.sDireccion = direccion;
	}
	
	/* ----------------------------------- */
	
	private char getFstNombre() {
		
		char cFstNombre = sNombre.charAt(0);
		
		return cFstNombre;
	}
	
	private char getFstApell1() {
		
		char cFstApell1 = sApellido1.charAt(0);
		
		return cFstApell1;
	}
	
	private String getCiphEmp() {
		String NumEmpOut = String.valueOf(iNumEmp);
		
		for(int i = 0; i < 5 - NumDigitos(iNumEmp); i++) {
			NumEmpOut = "0" + NumEmpOut;
		}
		
		return NumEmpOut;
	}
	
	public String getNumEmp() {
		
		return String.valueOf(getFstNombre())+String.valueOf(getFstApell1()) + getCiphEmp();
		
	}
	
	public void setDni(int numEmp) {
		this.iNumEmp = numEmp;
	}
	
	/*public Empleado (String dni, String nombre, String apellido1, String apellido2, int numEmp) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.numEmp = numEmp;
	}*/

	

	/*public Empleado (String dni, String nombre, String apellido1, int numEmp, String direccion) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.numEmp = numEmp;
		this.direccion = direccion;
	}*/
	
}