public class Masajista extends SeleccionFutbol {

    String titulacion;
    int aniosExperiencia;

    public void darMasaje() {
        System.out.println("Está masajeando");
    }

    public Masajista(int id, String nombre, String apelllidos, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, apelllidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public String toString() {
        return "Masajista [aniosExperiencia=" + aniosExperiencia + ", titulacion=" + titulacion + "]";
    }

}