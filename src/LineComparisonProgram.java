public class LineComparisonProgram {
    public static void main(String[] args) {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(3, 4);
        Line line1 = new Line(point1, point2);
        Point point3 = new Point(0, 0);
        Point point4 = new Point(3, 4);
        Line line2 = new Line(point3, point4);

        double length1 = line1.calculateLength();
        System.out.println("Length of Line 1: " + length1);

        boolean areEqual = line1.equals(line2);
        System.out.println("Lines are equal: " + areEqual);

        int comparisonResult = line1.compareTo(line2);
        System.out.println("Comparison result: " + comparisonResult);
    }
}