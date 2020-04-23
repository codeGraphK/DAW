public class EDomestico {

    private String sTipo;
    private int iPotencia;
    private boolean bEncendido;

    //Constructor base

    public EDomestico(String type, int potencia){

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

        if (sIn == "Encender"){
            this.bEncendido = true;
        }

    }

    public void setApagar(String sIn) {

        if (sIn == "Apagar"){

            this.bEncendido = false;

        }

    }

}