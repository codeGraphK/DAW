/**
 * mainMathematics
 */
public class mainMathematics {

    public static void main(String[] args) {
        double[] listadoReales = { 1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 12, 10 };
        ArrayReales array1 = new ArrayReales(listadoReales);

        System.out.println(array1.sumatorio());
    }
}