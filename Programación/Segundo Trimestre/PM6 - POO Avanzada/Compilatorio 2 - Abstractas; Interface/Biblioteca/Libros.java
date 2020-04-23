import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Libros extends Publicacion implements Prestable {

    private boolean sPrestado;
    private Calendar tiempoLimite;
    private static final int DIAS_PRESTAMO = 15;

    public Libros(String sIsbn, String sTítulo, String sAPublicacion) {
        super(sIsbn, sTítulo, sAPublicacion);
        sPrestado = false;
        tiempoLimite = null;
    }

    @Override
    public boolean devolver() {
        this.tiempoLimite = null;
        return sPrestado = false;
    }

    @Override
    public String prestado() {
        String sResult = "";
        if (sPrestado) {
            SimpleDateFormat formato = new SimpleDateFormat("EEE, MMM d, YYYY");
            sResult = "La fecha límite es el " + formato.format(this.tiempoLimite.getTime());
        } else {
            sResult = "No está prestado";
        }
        return sResult;
    }

    @Override
    public boolean prestar() {
        boolean done = true;
        if (sPrestado) {
            done = false;
        } else {
            this.tiempoLimite = Calendar.getInstance();
            this.tiempoLimite.add(Calendar.DATE, Libros.DIAS_PRESTAMO);
        }
        return done;
    }

    @Override
    public String toString() {
        return super.toString() + " Libros [sPrestado=" + sPrestado + "]";
    }

}