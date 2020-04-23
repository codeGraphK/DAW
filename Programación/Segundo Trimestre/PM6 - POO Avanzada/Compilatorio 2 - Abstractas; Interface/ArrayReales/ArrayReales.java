/**
 * ArrayReales
 */
public class ArrayReales implements Estadisticas {

    private double[] listadoReales;

    public ArrayReales(double[] listadoReales) {
        this.listadoReales = listadoReales;
    }

    public double[] getListadoReales() {
        return listadoReales;
    }

    public double minimo() {
        double dResult = this.listadoReales[0];

        for (double d : listadoReales) {
            if (dResult >= d)
                dResult = d;
        }
        return dResult;
    }

    public double maximo() {
        double dResult = this.listadoReales[0];

        for (double d : listadoReales) {
            if (dResult <= d) {
                dResult = d;
            }
        }
        return dResult;
    }

    public double sumatorio() {
        double dResult = 0;

        for (double d : listadoReales) {
            dResult += d;
        }

        return dResult;
    }

}