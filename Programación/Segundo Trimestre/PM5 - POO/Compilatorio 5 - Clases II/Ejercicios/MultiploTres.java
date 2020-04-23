import java.io.*;

public class MultiploTres {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader rdNum = new BufferedReader(new InputStreamReader(System.in));
        String sResultado = "No hay múltiplos de tres.";
        boolean bFound = true;
        
        for(int iCont = 0; iCont < 5; iCont++) {
            System.out.println("Introduce un número entero:");
            int iEntrada = Integer.parseInt(rdNum.readLine());
            if(iEntrada % 3 == 0){
                if(bFound){
                    sResultado = "Los múltiplos de tres encontrados son: ";
                    bFound = false;
                }
                sResultado += iEntrada + " ";
            }
        }

        System.out.println(sResultado);
    }
}