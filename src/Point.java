public class Point {
    private double x;
    private double y;
    public Point(double x,double y){
        this.x=x;
        this.y=y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj)
            return true;
        if(obj==null || getClass()!=obj.getClass())
            return false;
        Point point=(Point) obj;
        return Double.compare(point.x,x)==0 && Double.compare(point.y,y)==0;

    }
}
