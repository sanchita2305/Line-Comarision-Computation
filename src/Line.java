public class Line implements Comparable<Line>{
    private Point startPoint;
    private Point endPoint;
    public Line(Point startPoint,Point endPoint){
        this.startPoint=startPoint;
        this.endPoint=endPoint;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }
    public double calculateLength(){
        double x1=startPoint.getX();
        double y1=startPoint.getY();
        double x2=endPoint.getX();
        double y2=endPoint.getY();
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Line line=(Line) obj;
        return startPoint.equals(line.startPoint) && endPoint.equals(line.endPoint);

    }
    @Override
    public int compareTo(Line otherLine) {
        double thisLength = this.calculateLength();
        double otherLength = otherLine.calculateLength();
        return Double.compare(thisLength, otherLength);
    }
}
