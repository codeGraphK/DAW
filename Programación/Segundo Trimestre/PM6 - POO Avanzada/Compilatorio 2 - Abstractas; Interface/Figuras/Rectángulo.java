/**
 * Rectángulo
 */
public class Rectángulo extends Figura {
    private double dBase;
    private double dAltura;

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return this.dBase * dAltura;
    }

    @Override
    public double getPerimetro() {
        // TODO Auto-generated method stub
        return (this.dBase * 2) + (this.dAltura * 2);
    }

    public Rectángulo(double dBase, double dAltura) {
        this.dBase = dBase;
        this.dAltura = dAltura;
    }
}