import java.io.*;

public class Primo {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader rdNumb = new BufferedReader(new InputStreamReader(System.in));

        long iNum;
        boolean n = true;

        while(n){
            System.out.println("Introduce un numero natural:");
            iNum = Long.parseLong(rdNumb.readLine());

            if(iNum < 2){
                System.out.println("No es primo.");
            }else {
                if(iNum == 2 || iNum == 3 || iNum == 5 || iNum == 7){
                    System.out.println("Es primo");
                }else {
                    if((iNum%2 == 0)||(iNum%3 == 0)||(iNum%5 == 0)||(iNum%7 == 0)){
                        System.out.println("No es primo");
                    }else {
                        System.out.println("Es primo");
                    }
                }
            }
        }

        

    }

}