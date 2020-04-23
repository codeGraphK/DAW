import java.lang.reflect.Array;

public class SumaInt {

    public SumaInt (){
    }

    public static int sumaEnteros(int iEntero) {

        int iSum = 0;
        String sEntero = String.valueOf(iEntero);

        for(int iPos = 0; iPos < sEntero.length(); iPos++) {
            iSum += Integer.parseInt(String.valueOf(sEntero.charAt(iPos)));
        }

        return iSum;
    }

    public static int sumaParesArray(int [] ArrayIn) {
        
        int iSum = 0;

        for(int iPos = 0; iPos < ArrayIn.length; iPos++){
            if(ArrayIn[iPos]%2 == 0 || ArrayIn[iPos] == 2){
                iSum += ArrayIn[iPos];
            }
        }
        
        return iSum;
    }

    public static String [] strContain(String [] ArrayIn) {
        
        int iCont = 0, iPosOut = 0;
        boolean flag1 = true, flag2 = true;

        for(int iPos = 0;iPos < ArrayIn.length;iPos++) {
            flag1 = true;
            for(int iChar = 0; iChar < ArrayIn[iPos].length() && flag1 == true;iChar++){
                if(ArrayIn[iPos].charAt(iChar) == 'a'){
                    iCont++;
                    flag1 = false;
                }
            }
        }

        String [] ArrayOut = new String[iCont];

        for(int iPos = 0;iPos < ArrayIn.length&&ArrayOut[ArrayOut.length - 1] == null;iPos++) {
            flag2 = true;
            for(int iChar = 0; iChar < ArrayIn[iPos].length() && flag2 == true;iChar++){
                if(ArrayIn[iPos].charAt(iChar) == 'a'){
                    ArrayOut[iPosOut] = ArrayIn[iPos];
                    iPosOut++;
                    flag2 = false;
                }
            }
        }
        
        return ArrayOut;
    }

    public static String toString(String [] ArrayIn) {

        String sResult = "";
        
        for(int iPos = 0;iPos < ArrayIn.length;iPos++) {
            sResult += ArrayIn[iPos] + "\n";
        }
        return sResult;
    }

    public static String valdtString(String palabra) {

        String sResult = "Es válida", sSumInv = "";
        /* boolean monda = false; */

        for(int iCont = 0;iCont < palabra.length(); iCont++) {

            // Primero si está fuera de lo comprendido entre el 0 y la z minúscula
            //luego que si está comprendido entre el 0 y la A como límites
            //luego que si está comprendido entre la Z y la a como límites
            if((palabra.charAt(iCont) < 48 || palabra.charAt(iCont) > 122)||((palabra.charAt(iCont) > 57 && palabra.charAt(iCont) < 65) ||(palabra.charAt(iCont) > 90 && palabra.charAt(iCont) < 97))){
                sResult = "Es inválida";
                sSumInv += palabra.charAt(iCont) + " "; 
            }
        }

        return sResult + "\n" + sSumInv;

    }

}