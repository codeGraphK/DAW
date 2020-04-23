public class Factura {
    private String sCodArticulo;
    private int iLitros;
    private double dPrecioLitro;
    static int iContadorFacturas = 0;

    public Factura(String sCodArticulo, int iLitros, double dPrecioLitro) {
        this.sCodArticulo = sCodArticulo;
        this.iLitros = iLitros;
        this.dPrecioLitro = dPrecioLitro;
        iContadorFacturas++;
    }

    public static int[] Operaciones(Factura[] ArrayIn) {
        int[] Resultado = new int[3];

        for(Factura x : ArrayIn){
            Resultado[0] += (x.iLitros * x.dPrecioLitro);
            if(x.sCodArticulo.equals("x001")){
                Resultado[1] += x.iLitros;
            }
            if((x.iLitros * x.dPrecioLitro) > 600) {
                Resultado[2]++;
            }
        }

        return Resultado;
    }

    public String getCodArticulo() {
        return this.sCodArticulo;
    }

    public int getLitros() {
        return this.iLitros;
    }

    public double getPrecioLitro() {
        return this.dPrecioLitro;
    }

    public void setCodArticulo(String sIn) {
        this.sCodArticulo = sIn;
    }

    public void setLitros(int iIn) {
        this.iLitros = iIn;
    }
    
    public void setPrecioLitro(double dIn) {
        this.dPrecioLitro = dIn;
    }

}