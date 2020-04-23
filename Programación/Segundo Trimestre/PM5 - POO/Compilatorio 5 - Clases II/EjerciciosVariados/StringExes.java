public class StringExes {

    public static void cantSimbols(String sIn) {
        int iNum = 0, iSpc = 0, iLetra = 0;
        for(int iCont = 0; iCont < sIn.length();iCont++){
            if((sIn.charAt(iCont)>64 && sIn.charAt(iCont) < 91) || (sIn.charAt(iCont) > 96 && sIn.charAt(iCont) <  123)) {
                iLetra++;
            } else {
                if(sIn.charAt(iCont) > 47 && sIn.charAt(iCont) < 58){
                    iNum++;
                }else {
                    if(sIn.charAt(iCont) == 32){
                        iSpc++;
                    }
                }
            }
        }
        System.out.println("Cantidad de Letras: " + iLetra);
        System.out.println("Cantidad de Numeros: " + iNum);
        System.out.println("Cantidad de Espacios: " + iSpc);
    }

    public static String rtrnNoSpaces(String sIn) {
        
        String sResult = "";
        
        for(int iCont = 0; iCont < sIn.length();iCont++){
            if(sIn.charAt(iCont) != 32){
                sResult += sIn.charAt(iCont);
            }
        }

        return sResult;
    }

    public static int numVocals(String sIn) {
        
        int iResult = 0;

        for(int iCont = 0; iCont < sIn.length();iCont++){
            switch(sIn.toLowerCase().charAt(iCont)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    iResult++;
                    break;
                default:
                    break;
            }
        }
        
        return iResult;
    }

    public static String rtrnInvert(String sIn) {
        String sResult = "";

        for(int iCont = (sIn.length() - 1);iCont >= 0;iCont--){
            sResult += sIn.charAt(iCont);
        }

        return sResult;
    }

    public static void maxString(String sIn){
        String sResult = "", sParcial = "";
        int iParcial = 0;

        for(int iCont = 0;iCont<sIn.length();iCont++) {
            if(sIn.charAt(iCont) == 32){
                if(sParcial.length() > iParcial) {
                    iParcial = sParcial.length();
                    sResult = sParcial;
                }
                sParcial = "";
            }else {
                sParcial += sIn.charAt(iCont);
                if(iCont == (sIn.length()-1)) {
                    if(sParcial.length() > iParcial) {
                        iParcial = sParcial.length();
                        sResult = sParcial;
                    }
                    sParcial = "";
                }
            }
        }

        System.out.println(sResult);
    }

    public static int numPalabras(String sIn) {
        String trimsIn = sIn.trim();
        int iResult = 0;
        
        for(int iCont = 0;iCont < trimsIn.length();iCont++){            
            if(trimsIn.charAt(iCont) == 32 && 
                ((trimsIn.charAt(iCont-1)>64 && trimsIn.charAt(iCont-1) < 91) || 
                (trimsIn.charAt(iCont-1) > 96 && trimsIn.charAt(iCont-1) <  123)) || 
                (iCont == (trimsIn.length()-1) && (trimsIn.charAt(iCont-1) > 96 && trimsIn.charAt(iCont-1) <  123))){
                iResult++;
            }
        }

        return iResult;
    }

    public static String interString(String sInPri, String sInSeg) {
        String sResult = "";
        
        for(int iCont = 0;iCont < sInPri.length() || iCont < sInSeg.length();iCont++) {
            if(iCont >= (sInPri.length()-1)){
                sResult += String.valueOf(sInSeg.charAt(iCont));
            }else {
                if(iCont >= (sInSeg.length()-1)){
                    sResult += String.valueOf(sInPri.charAt(iCont));
                } else {
                    sResult += String.valueOf(sInPri.charAt(iCont))+String.valueOf(sInSeg.charAt(iCont));
                }
            }
        }
        
        return sResult;
    }

}