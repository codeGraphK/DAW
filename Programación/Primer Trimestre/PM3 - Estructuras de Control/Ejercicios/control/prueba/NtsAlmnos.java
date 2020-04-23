import java.io.*;

public class NtsAlmnos {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        BufferedReader rdNts = new BufferedReader(new InputStreamReader(System.in));

        String sNombre;
        float fNota1, fNota2, fNota3, fNotaF;

        System.out.println("Introduce el nombre del Alumno:");
        sNombre = rdNts.readLine();
            
        if(sNombre.length() == 0){
        
            System.out.println("Fin.");

        }else {

            do {System.out.println("Introduce la nota correspondiente a la parte practica:");
            fNota1 = Float.parseFloat(rdNts.readLine());
                
            System.out.println("Introduce la nota correspondiente a la parte de problemas:");
            fNota2 = Float.parseFloat(rdNts.readLine());

            System.out.println("Introduce la nota correspondiente a la parte teorica:");
            fNota3 = Float.parseFloat(rdNts.readLine());

            fNotaF = (float)((fNota1*0.1)+(fNota2*0.5)+(fNota3*0.4));

            if((fNota1 >= 0 && fNota1 <= 10)&&(fNota2 >= 0 && fNota2 <= 10)&&(fNota3 >= 0 && fNota3 <= 10)){
                System.out.println("-----------------------------------------------");
                System.out.println("La nota final de " + sNombre + " es: " + fNotaF);
                System.out.println("-----------------------------------------------");
            }else {
                System.out.println("-----------------------------------------------");
                System.out.println(" / Introduce valores validos para las notas. / ");
                System.out.println("-----------------------------------------------");
            }

            System.out.println("Introduce el nombre de otro Alumno:");
            sNombre = rdNts.readLine();

            }while(sNombre.length() != 0);

            System.out.println("Fin.");
        }

    }

}