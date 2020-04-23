/**
 * Figura
 */
public abstract class Figura {
    private String sColor;

    public abstract double getPerimetro();

    public abstract double getArea();

    public String getsColor() {
        return sColor;
    }

    public void setsColor(String sColor) {
        this.sColor = sColor;
    }
}