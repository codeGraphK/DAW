public class EDomesticoM {

    private String sTipo;
    private int iPotencia;
    private boolean bEncendido;
    private static int iPotSum;

    //Constructor base

    public EDomesticoM(String type, int potencia){

        sTipo = type;
        iPotencia = potencia;
        bEncendido = false;
        
    }

    // Tipo get

    public String getTipo() {
        return this.sTipo;
    }

    // Potencia get

    public int getPotencia() {
        return this.iPotencia;
    }

    // Encendido get - set
    
    public String getEncendido() {

        String sResult = "";

        if(this.bEncendido == true) {
            sResult = "Encendido";
        }

        if(this.bEncendido == false) {
            sResult = "Apagado";
        }

        return sResult;
    }

    public void setEncender(String sIn) {

        if (sIn == "Encender" && !this.bEncendido){
            this.bEncendido = true;
            iPotSum += this.iPotencia;
        }

    }

    public void setApagar(String sIn) {

        if (sIn == "Apagar" && this.bEncendido){

            this.bEncendido = false;
            iPotSum -= this.iPotencia;

        }

    }

    public static int getSumPot() {
        return iPotSum;
    }

}