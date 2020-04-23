public class MainArreglos {
    public static void main(String[] args) {
        int [] iAEnteros = {2,5,6,7,3,13,9,27,10,13};
        double [] iADecis = {2.272,5.838,6.154,7.833,3.519,13.876,9.922,27.113,10.92,13.131};
        /* int[][] ix = new int[3][];
        ix[0] = new int[4]; */

        Personas Persona1 = new Personas("888888K", "Lukas", "Graham"),
        Persona2 = new Personas("434343K", "Chris", "Lahm"),
        Persona3 = new Personas("545454K", "Richard", "Camelo"),
        Persona4 = new Personas("878787K", "Uso", "Carruso"),
        Persona5 = new Personas("232323K", "Cookiezi", "Rafis");
        Personas[] listPersonas = {Persona1, Persona2, Persona3, Persona4, Persona5};

        System.out.println(Arreglos.busquedaPersona("232323K", listPersonas));
        System.out.println(Arreglos.SepararParImp(iAEnteros)[1][1]);
        System.out.println(Arreglos.VoltearDatos(iAEnteros)[9]);
    }
}