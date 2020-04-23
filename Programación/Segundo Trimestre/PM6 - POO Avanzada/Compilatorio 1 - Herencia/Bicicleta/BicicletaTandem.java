public class BicicletaTandem extends Bicicleta {
    private int numAsientos;

    public BicicletaTandem() {
        super();
    }

    public BicicletaTandem(int numAsientos) {
        super();
        this.numAsientos = numAsientos;
    }

    public BicicletaTandem(int velocidadActual, int platoActual, int pinonActual, int numAsientos) {
        super(velocidadActual, platoActual, pinonActual);
        this.numAsientos = numAsientos;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    @Override
    public void acelerar() {
        this.setVelocidadActual(this.getVelocidadActual() * 4);
    }

    @Override
    public String toString() {
        return super.toString() + "BicicletaTandem [numAsientos=" + numAsientos + "]";
    }

}