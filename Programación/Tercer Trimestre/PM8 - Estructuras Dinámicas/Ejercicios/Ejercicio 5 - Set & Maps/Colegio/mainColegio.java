
public class mainColegio {

    public static void main(String[] args) {
        Colegio colegioUno = new Colegio();
        colegioUno.aniadirNacionalidad("Alemania");
        colegioUno.aniadirNacionalidad("Venezuela");
        colegioUno.aniadirNacionalidad("Brasil");
        colegioUno.aniadirNacionalidad("Colombia");
        colegioUno.aniadirNacionalidad("Perú");
        colegioUno.aniadirNacionalidad("Rusia");
        colegioUno.aniadirNacionalidad("Andorra");
        System.out.println(colegioUno.listadoNacionalidades());
        System.out.println(colegioUno.mostrarAlumnos("Perú"));
        System.out.println(colegioUno.nacionalidades());
        colegioUno.aniadirNacionalidad("Rusia");
        colegioUno.aniadirNacionalidad("Rusia");
        colegioUno.aniadirNacionalidad("Rusia");
        colegioUno.aniadirNacionalidad("Colombia");
        colegioUno.aniadirNacionalidad("Colombia");
        colegioUno.aniadirNacionalidad("alemania");
        System.out.println(colegioUno.listadoNacionalidades());
        System.out.println(colegioUno.mostrarAlumnos("Rusia"));
    }

}