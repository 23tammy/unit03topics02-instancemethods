
public class Circle {

    private double radius;
    private Point2D center;

    public Circle (Point2D center, double radius){
        this.radius = radius;
        this.center = center;
    }

    public double getArea(){
        return ((Math.PI)*Math.pow(radius, 2));
    }

    public double getCircumference(){
        return (2 * (Math.PI) * radius);
    }

    public boolean intersects(Circle other){

    }

    public static void main(String[] args){
        Point2D p = new Point2D(1, 1);
        Point2D p2 = new Point2D(3,3);
        Circle c1 = new Circle(p, 3);
        Circle c2 = new Circle(p2, 5);
        System.out.println(c1.getArea());
        System.out.println(c1.getCircumference());
    }
}
