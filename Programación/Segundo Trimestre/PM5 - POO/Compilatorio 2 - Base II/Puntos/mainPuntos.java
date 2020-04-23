public class mainPuntos {
    public static void main(String[] args) {
        Puntos Punto1 = new Puntos(25, 35);
        Puntos Punto2 = new Puntos(15, 25);
        Puntos Punto3 = new Puntos(45, 55);

        System.out.println(Punto1.getYValue());
        System.out.println(Punto2.getYValue());
        System.out.println(Punto3.getYValue());
        System.out.println(Puntos.getCantidad());
    }
}