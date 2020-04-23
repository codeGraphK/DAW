public class SeleccionFutbol {
    int id;
    String Nombre;
    String Apelllidos;
    int Edad;

    public void Concentrarse() {
        System.out.println("Están concentrados");
    }

    public void Viajar() {
        System.out.println("Están viajando");
    }

    public SeleccionFutbol(int id, String nombre, String apelllidos, int edad) {
        this.id = id;
        Nombre = nombre;
        Apelllidos = apelllidos;
        Edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApelllidos() {
        return Apelllidos;
    }

    public void setApelllidos(String apelllidos) {
        Apelllidos = apelllidos;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    @Override
    public String toString() {
        return "SeleccionFutbol [Apelllidos=" + Apelllidos + ", Edad=" + Edad + ", Nombre=" + Nombre + ", id=" + id
                + "]";
    }

}