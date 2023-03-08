
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
        double biggerCircle;
        double smallerCircle;
    
        if (this.radius > other.radius){
            biggerCircle = this.radius;
            smallerCircle = other.radius;
        }else{
            biggerCircle = other.radius;
            smallerCircle = this.radius;
        }
        if (distance <= Math.abs(biggerCircle- smallerCircle)){
            return false;
        }else{
            return (distance <= this.radius + other.radius);
        } 
    }

    public boolean contains(Circle other){
        double distance = this.center.distanceTo(other.center);
     
        return(distance <= Math.abs(this.radius- other.radius));

    }



    public static void main(String[] args){
        Point2D p = new Point2D(6, 8);
        Point2D p2 = new Point2D(1,1);
        Circle c1 = new Circle(p, 5);
        Circle c2 = new Circle(p2, 3);
        System.out.println(c1.getArea());
        System.out.println(c1.getCircumference());
        System.out.println(c1.intersects(c2));
        System.out.println(c1.contains(c2));
    }
}
