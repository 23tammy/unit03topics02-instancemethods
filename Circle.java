
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
        double distance = this.center.distanceTo(other.center);
     
        if (distance <= Math.abs(this.radius- other.radius)){
            return false;
        }else{
            return (distance <= this.radius + other.radius);
        } 
    }

    public boolean contains(Circle other){
        double distance = this.center.distanceTo(other.center);
     
        return(distance <= this.radius- other.radius);

    }



    public static void main(String[] args){
        Point2D p = new Point2D(1, 1);
        Point2D p2 = new Point2D(1,1);
        Circle c1 = new Circle(p, 3);
        Circle c2 = new Circle(p2, 5);
        System.out.println(c1.getArea());
        System.out.println(c1.getCircumference());
        System.out.println(c1.intersects(c2));
        System.out.println(c1.contains(c2));
    }
}
