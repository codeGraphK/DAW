import java.io.*;

public class MainTriangulo {
    public static void main(String[] args) throws IOException {
        
        BufferedReader rdNum = new BufferedReader(new InputStreamReader(System.in));

        Triangulo tri1, tri2;

        tri1 = new Triangulo(0, 0, 0);
        tri2 = new Triangulo(0, 0, 0);
        
        //String sLadoA, sLadoB, sLadoC;
        
        System.out.println("Introduce los lados de un triángulo:");
        String[] sIn = rdNum.readLine().split(" ");

        tri1.setLadoA(Double.parseDouble(sIn[0]));
        tri1.setLadoB(Double.parseDouble(sIn[1]));
        tri1.setLadoC(Double.parseDouble(sIn[2]));
        
        System.out.println("Lado A: " + tri1.getLadoA());
        System.out.println("Lado B: " + tri1.getLadoB());
        System.out.println("Lado C: " + tri1.getLadoC());
        System.out.println("Tipo: " + tri1.getTipoTriangulo());
        System.out.println("El perimetro del triángulo es: " + tri1.getPerimetro());
        System.out.println("Y el área del triángulo es: " + tri1.getArea());

    }
}