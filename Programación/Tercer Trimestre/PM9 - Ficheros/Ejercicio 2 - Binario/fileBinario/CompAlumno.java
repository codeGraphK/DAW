import java.util.Comparator;

public class CompAlumno implements Comparator <Alumno> {

    @Override
    public int compare(Alumno o1, Alumno o2) {
        int iResult = 0;
        if (!o1.getsDni().equals(o2.getsDni())) {
            iResult = (int) Math.ceil(o1.getdNota() - o2.getdNota()) + 1;
        }
        return iResult;
    }
    
}