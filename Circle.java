
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
        System.out.println(distance + " <= " + this.radius +" + " + other.radius);
    
        double smallerCircle;
        if (this.radius > other.radius){
            biggerCircle = this.radius;
            smallerCircle = other.radius;
        }else{
            biggerCircle = other.radius;
            smallerCircle = this.radius;
        }
        if (distance <= this.radius && other.radius >= this.radius){
            return false;
        }else{
            return (distance <= this.radius + other.radius);
        } 
    }



    public static void main(String[] args){
        Point2D p = new Point2D(1, 1);
        Point2D p2 = new Point2D(0,0);
        Circle c1 = new Circle(p, 3);
        Circle c2 = new Circle(p2, 5);
        System.out.println(c1.getArea());
        System.out.println(c1.getCircumference());
        System.out.println(c1.intersects(c2));
    }
}
