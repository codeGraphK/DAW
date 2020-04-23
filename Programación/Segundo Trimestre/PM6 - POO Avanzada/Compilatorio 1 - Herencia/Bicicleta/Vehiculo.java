public abstract class Vehiculo {
    int velocidadActual;

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public abstract void acelerar();

    public abstract void frenar();

    @Override
    public String toString() {
        return "Vehiculo [velocidadActual=" + velocidadActual + "]";
    }

    public Vehiculo(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public Vehiculo() {
    }

}