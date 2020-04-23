import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * mainControlFecha
 */
public class mainControlFecha {

    public static void main(String[] args) throws IOException {
        BufferedReader rdSome = new BufferedReader(new InputStreamReader(System.in));

        String [] parametros = {"dia", "mes", "año"};
        int [] valores = new int [3];

        for (int i = 0; i < valores.length; i++) {
            System.out.println("Introduce el " + parametros[i]);
            valores[i] = Integer.parseInt(rdSome.readLine());
        }

        try {
            controlDatosFecha(valores[0], valores[1], valores[2]);   
        } catch (Exception e){
            //TODO: handle exception
            e.printStackTrace();
        }
    }

    public static void controlDatosFecha(int dia, int mes, int anio) throws DiaFueraDeRangoExcepcion, MesFueraDeRangoExcepcion, AnioFueraDeRangoExcepcion {
        if (dia < 1 || dia > 31) {
            throw new DiaFueraDeRangoExcepcion("Dia fuera de rango posible");
        } else if (mes < 1 || mes > 12) {
            throw new MesFueraDeRangoExcepcion("Mes fuera de rango posible");
        } else if (anio < 1900 || anio > 2500) {
            throw new AnioFueraDeRangoExcepcion("Año fuera de rango posible");
        }
    }

}