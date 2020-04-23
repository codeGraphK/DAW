/**
 * Círculo
 */
public class Círculo extends Figura {
    private double dRadio;

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return Math.pow(dRadio, 2) * Math.PI;
    }

    @Override
    public double getPerimetro() {
        // TODO Auto-generated method stub
        return 2 * Math.PI * dRadio;
    }

    public Círculo(double dRadio) {
        this.dRadio = dRadio;
    }
}