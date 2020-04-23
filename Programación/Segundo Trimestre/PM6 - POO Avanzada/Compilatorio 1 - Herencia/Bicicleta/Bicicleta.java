public class Bicicleta extends Vehiculo implements Imprimible {
    private int codObject, platoActual, pinonActual;
    private static int codCont;

    public Bicicleta(int velocidadActual, int platoActual, int pinonActual) {
        super(velocidadActual);
        this.velocidadActual = velocidadActual;
        this.platoActual = platoActual;
        this.pinonActual = pinonActual;
        this.codObject = ++codCont;
    }

    public Bicicleta() {
        super();
        platoActual = 1;
        pinonActual = 1;
    }

    public int getPlatoActual() {
        return platoActual;
    }

    public int getPinonActual() {
        return pinonActual;
    }

    public int getCodObject() {
        return codObject;
    }

    public void acelerar() {
        velocidadActual *= 2;
    }

    public void frenar() {
        velocidadActual /= 2;
    }

    public void cambiarPlato() {
        // Sobrecarga del método
        platoActual = 1;
    }

    public void cambiarPinon() {
        // Sobrecarga del método
        pinonActual = 1;
    }

    public void cambiarPlato(int plato) {
        platoActual = plato;
    }

    public void cambiarPinon(int pinon) {
        pinonActual = pinon;
    }

    @Override
    public String toString() {
        return "Bicicleta [codObject=" + codObject + ", pinonActual=" + pinonActual + ", platoActual=" + platoActual
                + "]";
    }

    @Override
    public void imprime() {
        // TODO Auto-generated method stub
        System.out.println(this.velocidadActual + this.pinonActual + this.platoActual);
    }

}