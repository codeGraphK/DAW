public class mainSeleccion {

    public static void main(String[] args) {
        SeleccionFutbol f1 = new Futbolista(1, "Luis", "Ruiz", 18, 10, "Delantero"),
                f2 = new Futbolista(2, "Lesinho", "Pepirris", 20, 9, "Volante"),
                e1 = new Entrenador(3, "Rofer", "Fede", 30, "1234"),
                m1 = new Masajista(4, "Ricardo", "Ruiz", 40, "Fisio", 10);

        SeleccionFutbol[] lista = new SeleccionFutbol[4];
        lista[0] = f1;
        lista[1] = f2;
        lista[2] = e1;
        lista[3] = m1;
        // Una clase padre no puede acceder a los métodos de sus clases hijas,
        // sólo en el caso de que estén sobreescritas.
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i].toString());

            lista[i].Viajar();
            lista[i].Concentrarse();

            if (lista[i] instanceof Futbolista) {

                ((Futbolista) lista[i]).entrenar();
                ((Futbolista) lista[i]).jugarPartido();

            } else if (lista[i] instanceof Entrenador) {

                ((Entrenador) lista[i]).dirigirPartido();
                ((Entrenador) lista[i]).dirigirEntrenamiento();

            } else if (lista[i] instanceof Masajista) {

                ((Masajista) lista[i]).darMasaje();

            }
        }
    }
}