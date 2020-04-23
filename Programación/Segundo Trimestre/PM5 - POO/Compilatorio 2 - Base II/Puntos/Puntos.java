public class Puntos {

    private long x, y;
    private static int num = 0;

    public Puntos(long xValue, long yValue){
        x = xValue;
        y = yValue;
        num++;
    }

    public long getXValue() {
        return x;
    }

    public void setXValue(long SetX){
        SetX =  this.x;
    }
    
    public long getYValue() {
        return y;
    }
    
    public void setYValue(long SetY){
        SetY =  this.y;
    }
    
    public static int getCantidad() {
        return num;
    }
}