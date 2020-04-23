public class BicicletaMontana extends Bicicleta {
    private int suspension;

    public BicicletaMontana() {
        super();
    }

    public BicicletaMontana(int suspension) {
        super();
        this.suspension = suspension;
    }

    public BicicletaMontana(int velocidadActual, int platoActual, int pinonActual, int suspension) {
        super(velocidadActual, platoActual, pinonActual);
        this.suspension = suspension;
    }

    public void cambiarSuspension(int suspension) {
        this.suspension = suspension;
    }

    public int getSuspension() {
        return suspension;
    }

    @Override
    public void acelerar() {
        this.setVelocidadActual(this.getVelocidadActual() * 3);
    }

    @Override
    public String toString() {
        return super.toString() + "BicicletaMontana [suspension=" + suspension + "]";
    }

}