public class Triangulo {
    
    private double dLadoA;
    private double dLadoB;
    private double dLadoC;

    // Constructor

    public Triangulo(double ladoA, double ladoB, double ladoC){

        dLadoA = ladoA;
        dLadoB = ladoB;
        dLadoC = ladoC;

    }

    // Lado A get - set

    public double getLadoA() {
        return dLadoA;
    }

    public void setLadoA(double mLadoA) {

        dLadoA = mLadoA;

    }

    // Lado B get - set

    public double getLadoB() {
        return dLadoB;
    }

    public void setLadoB(double mLadoB) {

        dLadoB = mLadoB;

    }

    // Lado C get - set

    public double getLadoC() {
        return dLadoC;
    }

    public void setLadoC(double mLadoC) {

        dLadoC = mLadoC;

    }

    // Tipo Triángulo

    public String getTipoTriangulo() {
        
        String sTipo = "";

        if(dLadoA == dLadoB && dLadoB == dLadoC) {
            sTipo = "El triángulo es equilátero";
        }else {
            if(dLadoA == dLadoB || dLadoA == dLadoC || dLadoB == dLadoC){
                sTipo = "El triángulo es isósceles";
            }else {
                sTipo = "El triángulo es escaleno";
            }
        }

        return sTipo;

    }

    // Perímetro

    public double getPerimetro() {

        double dPeri = 0;

        dPeri = dLadoA + dLadoB + dLadoC;

        return dPeri;

    }

    // Area

    public double getArea() {

        double dArea = 0, dSemiP;

        dSemiP = getPerimetro()/2;

        dArea = Math.sqrt(Math.abs(dSemiP * (dSemiP - dLadoA) * (dSemiP - dLadoB) * (dSemiP - dLadoC)));

        if(String.valueOf(dArea).length() > 5) {
            dArea = Math.rint(dArea);
        }
        
        return dArea;

    }
}