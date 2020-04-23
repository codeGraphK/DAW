import java.io.*;

public class Mensaje {
    public static void main(String [] args) throws IOException{
        
        BufferedReader rdMess = new BufferedReader(new InputStreamReader(System.in));
        
        int i = 0;
        String cadena;
        System.out.println("Introduce un mensaje:");
        cadena = rdMess.readLine();
        while(i < cadena.length()){
            if(cadena.charAt(i) != 32){
                System.out.print(cadena.charAt(i));
            }else {
                System.out.print(" ");
            }
        i++;
        }
    }
}