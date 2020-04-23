import java.util.*;
import java.io.*;

public class Index {
    public static void main(String[] args) {
        //
        System.out.println("Arriba \nAbajo");
        System.out.println("Inicio \tTabulado");
        System.out.println("Afuera \"Dentro de comillas comentadas\"");
        System.out.println("------------------------------------");
        //
        String sArray[] = {"Una", "Dos", "Tres"};
        System.out.println(sArray[0]);
        String sArrays[][] = {{"Una", "Dos", "Tres"}, {"Cuatro", "Cinco", "Seis"}};
        System.out.println(sArrays[1][1]);
        System.out.println("------------------------------------");
        //
        Scanner rdAny = new Scanner(System.in);
        String sAny = rdAny.next(), sAny2 =rdAny.next();
        System.out.println(sAny2);
        System.out.println("------------------------------------");
        rdAny.close();
        //
        int iArray[] = {1,2,3,4,5,6,7,8,9}, sum = 0;
        for(int x : iArray){
            sum += x;
        }
        System.out.println(sum);
        System.out.println("------------------------------------");
        //
        int numero;
        String cadena = "hola";
        try {
            numero = Integer.parseInt(cadena);
        }catch(NumberFormatException exception){
            System.out.println("EEEEEEEEEEEEEEEE");
        }
        System.out.println("------------------------------------");
        //
        Random random = new Random();
        double num;

        for(int i = 0; i<=10; i++){
            num = random.nextDouble();
            System.out.println(num);
        }
        System.out.println("------------------------------------");
        //
        File archivo = new File("C://Users//Alumno//Documents//archivo.txt");
        final Formatter crear;

        if(archivo.exists()){
            System.out.print("Y");
            if(archivo.canWrite()){
                System.out.print("Y");
            }else{
                System.out.print("N");
            }
        }else {
            System.out.print("N");
            try{
                crear = new Formatter("C://Users//Alumno//Documents//archivo.txt");
                System.out.print("\t created");
                crear.format("%s", "Hola");
                crear.close();
            }catch(Exception e){
                System.out.println("Error: " + e);
            }
        }
    }
}