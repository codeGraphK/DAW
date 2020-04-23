public class Entrenador extends SeleccionFutbol {

    String idFederacion;

    public void dirigirPartido() {
        System.out.println("Está dirigiendo un partido");
    }

    public void dirigirEntrenamiento() {
        System.out.println("Está dirigiendo un entrenamiento");
    }

    public Entrenador(int id, String nombre, String apelllidos, int edad, String idFederacion) {
        super(id, nombre, apelllidos, edad);
        this.idFederacion = idFederacion;
    }

    @Override
    public String toString() {
        return "Entrenador [idFederacion=" + idFederacion + "]";
    }

}