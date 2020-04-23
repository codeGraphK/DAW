public class Futbolista extends SeleccionFutbol {

    int dorsal;
    String demarcacion;

    public void jugarPartido() {
        System.out.println("Está jugando un partido");
    }

    public void entrenar() {
        System.out.println("Está entrenando");
    }

    public Futbolista(int id, String nombre, String apelllidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apelllidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    @Override
    public String toString() {
        return "Futbolista [demarcacion=" + demarcacion + ", dorsal=" + dorsal + "]";
    }

    @Override
    public void Viajar() {
        System.out.println("Viajan en avión");
    }

    @Override
    public void Concentrarse() {
        System.out.println("Se concentra en el spa");
    }

    /*
     * @Override public boolean equals(Object obj) { boolean result;
     * 
     * 
     * 
     * return ; }
     */

}