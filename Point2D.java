public class Point2D {
    private double x;
    private double y;

    public Point2D (double x, double y){
        this.x = x;
        this.y = y;
    } 

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distanceTo(Point2D other) {
        return Math.sqrt(Math.pow((this.x-other.x),2)+Math.pow((this.y-other.y),2));
    }

    public String toString (){
        return ("(" + x + ", " + y + ")");
    }

    public static void main(String[] args){
        Point2D p1 = new Point2D(1, 1);
        Point2D p2 = new Point2D(-2,4);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.distanceTo(p2));
    }


}
