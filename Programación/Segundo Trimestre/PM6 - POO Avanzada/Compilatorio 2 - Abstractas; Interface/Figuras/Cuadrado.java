/**
 * Cuadrado
 */
public class Cuadrado extends Figura {

    private double dLado;

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return Math.pow(this.dLado, 2);
    }

    @Override
    public double getPerimetro() {
        // TODO Auto-generated method stub
        return this.dLado * 4;
    }

    public Cuadrado(double dLado) {
        this.dLado = dLado;
    }

}