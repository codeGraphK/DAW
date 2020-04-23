public class Personas {
    private String sNombre, sApellido;
    private String iDni;

    public Personas(String dni, String nombre, String Apellido) {
        iDni = dni;
        sNombre = nombre;
        sApellido = Apellido;
    }

    public String getDNI() {
        return this.iDni;
    }

    public String getNombre() {
        return this.sNombre;
    }

    public String getApellido() {
        return this.sApellido;
    }

    public static void mostrarListado(Personas [] listado){
        int index = 0;

        /* for(Personas x : listado) {
            index++;
            System.out.println("-----------");
            System.out.printf("Persona %d\n", index);
            System.out.println("-----------");
            System.out.printf("DNI: %d\n", x.getDNI());
            System.out.printf("Nombre: %s\n", x.getNombre());
            System.out.printf("Apellido: %s\n", x.getApellido());
        } */

        for(int x = 0; x < listado.length; x++){
            index++;
            System.out.println("-----------");
            System.out.printf("Persona %d\n", index);
            System.out.println("-----------");
            System.out.printf("DNI: %s\n", listado[x].getDNI());
            System.out.printf("Nombre: %s\n", listado[x].getNombre());
            System.out.printf("Apellido: %s\n", listado[x].getApellido());
        }
    }
}