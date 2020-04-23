/**
 * Math2
 */
public class Math2 implements Extremos {

    public Math2() {
    }

    @Override
    public int max(int[] arrayIn) {
        // TODO Auto-generated method stub
        int iResult = arrayIn[0];

        for (int d : arrayIn) {
            if (iResult <= d) {
                iResult = d;
            }
        }
        return iResult;
    }

    @Override
    public double max(double[] arrayIn) {
        // TODO Auto-generated method stub
        double dResult = arrayIn[0];

        for (double d : arrayIn) {
            if (dResult <= d) {
                dResult = d;
            }
        }
        return dResult;
    }

    @Override
    public int min(int[] arrayIn) {
        // TODO Auto-generated method stub
        int iResult = arrayIn[0];

        for (int d : arrayIn) {
            if (iResult >= d)
                iResult = d;
        }
        return iResult;
    }

    @Override
    public double min(double[] arrayIn) {
        // TODO Auto-generated method stub
        double dResult = arrayIn[0];

        for (double d : arrayIn) {
            if (dResult >= d)
                dResult = d;
        }
        return dResult;
    }

}