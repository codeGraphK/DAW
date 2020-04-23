public class Arrays {
    public static void main(String[] args) {
        
        String[] sAWords = new String[5];
        int[][] iANums = new int [4][4];

        Persona per1 = new Persona(9,1);
        Persona per2 = new Persona(8,1);
        Persona per3 = new Persona(10,10);
        Persona per4 = new Persona(12,12);


        Persona[] listado = new Persona[4];

        listado[0] = per1;
        listado[1] = per2;

        listado[0].getX();
        listado[0].setX(7);

        listado[0] = listado[1];

        System.out.println(listado[0].getX());

        sAWords[0] = "Monda";

    }
}