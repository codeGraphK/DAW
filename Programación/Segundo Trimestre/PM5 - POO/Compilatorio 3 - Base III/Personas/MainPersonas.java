public class MainPersonas {
    public static void main(String[] args) {
        Personas Persona1 = new Personas("888888K", "Lukas", "Graham"),
        Persona2 = new Personas("434343K", "Chris", "Lahm"),
        Persona3 = new Personas("545454K", "Richard", "Camelo"),
        Persona4 = new Personas("878787K", "Uso", "Carruso"),
        Persona5 = new Personas("232323K", "Cookiezi", "Rafis");

        Personas[] listPersonas = {Persona1, Persona2, Persona3, Persona4, Persona5};

        Personas.mostrarListado(listPersonas);
    }
}