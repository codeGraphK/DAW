/**
 * Operaciones
 */
public class Operaciones {

    public static int division(int dividendo, int divisor) {
        int iResult = 0;
        try {
            iResult = dividendo / divisor;
        } catch (ArithmeticException e) {
            //TODO: handle exception
            System.err.println("No podemos dividir por 0");
        }
        return iResult;
    }
    
    public static int divisionLanzador(int dividendo, int divisor) {
        int iResult = 0;
        if (divisor == 0) 
            throw new ArithmeticException("No podemos dividir por 0");
        else
            iResult = dividendo / divisor;
        return iResult;
    }
}