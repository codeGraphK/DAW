public class mainBiblioteca {

    public static void main(String[] args) {

        Libros libro1 = new Libros("01102", "El caimán", "2001");

        libro1.prestar();
        libro1.devolver();
        System.out.println(libro1.prestado());

    }
}