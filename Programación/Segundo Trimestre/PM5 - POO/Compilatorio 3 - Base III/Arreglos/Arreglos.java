public class Arreglos {

    public static int getEnterosSum(int[] Array) {
        int iSuma = 0;
        for(int i=0; i < Array.length;i++){
            iSuma += Array[i];
        }
        return iSuma;
    }
    
    public static double getDecisSum(double[] Array) {
        int dSuma = 0;
        for(int i=0; i < Array.length;i++){
            dSuma += Array[i];
        }
        return dSuma;      
    }
    
    public static int getEntMaxValue(int[] Array) {
        int iMax = 0;
        for(int i=0; i < Array.length;i++){
            if(Array[i] > iMax) {
                iMax = Array[i];
            }
        }
        return iMax;        
    }
    
    public static int getEntMinValue(int[] Array) {
        int iMin = 0;
        boolean primeraVez = true;
        for(int i=0; i < Array.length;i++){
            if(primeraVez){
                iMin = Array[i];
            }else{
                if(Array[i] <= iMin) {
                    iMin = Array[i];
                }
            }
            primeraVez = false;
        }
        return iMin;
    }
    
    public static int getNumPar(int[] Array) {
        int dSumPar = 0;
        for(int i=0; i < Array.length;i++){
            if(Array[i] % 2 == 0 || Array[i] == 2) {
                dSumPar++;
            }
        }
        return dSumPar;
    }
    
    public static int getNumImpar(int[] Array) {
        int dSumImpar = 0;
        for(int i=0; i < Array.length;i++){
            if(Array[i] % 2 != 0) {
                dSumImpar++;
            }
        }
        return dSumImpar;
    }

    public static String busquedaPersona(String DNI, Personas[] Array){
        String sResult = "No existe.";
        for(int i=0; i < Array.length;i++){
            if(Array[i].getDNI() == DNI){
                sResult = "(" + Array[i].getDNI() + ") " + Array[i].getNombre() + " " + Array[i].getApellido();
            }
        }
        return sResult;
    }

    public static int[][] SepararParImp(int[] ArrayIn){
        
        int[][] ArrayResult = new int[2][]; 
        // Serán dos filas con número de columnas indefinido aún.
        ArrayResult[0] = new int[getNumPar(ArrayIn)]; 
        //La fila del índice 0 será la de pares, su número de 
        //será la del método previamente hecho.
        ArrayResult[1] = new int[getNumImpar(ArrayIn)];
        //La fila del índice 1 será la de los impares. Se denomina
        //de igual manera la cantidad de columnas.

        int iPar = 0, iNotPar = 0;

        for(int i=0; i < ArrayIn.length;i++){
            int num = ArrayIn[i];
            if(num % 2 == 0 || num == 2){
                if(ArrayResult[0][iPar] == 0){
                    ArrayResult[0][iPar] = num;
                }
                iPar++;
            }else {
                if(ArrayResult[1][iNotPar] == 0){
                    ArrayResult[1][iNotPar] = num;
                }
                iNotPar++;
            }
        }
        return ArrayResult;
    }

    public static int[] VoltearDatos(int[] ArrayIn){
        int[] ArrayInt = new int[ArrayIn.length];
        int iPos = 0, iNeg = ArrayIn.length - 1;
        while(iPos < ArrayIn.length){
            ArrayInt[iPos] = ArrayIn[iNeg];
            iPos++;
            iNeg--;
        }
        return ArrayInt;
    }

    public static String aString(Object oGeneral, String sTipo){

        String Result = "";

        if(sTipo == "Array"){
            
        }

        return Result;
    }

}