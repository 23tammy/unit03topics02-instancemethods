import java.util.ArrayList;
import java.util.Scanner;

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
        // Point2D p1 = new Point2D(1, 1);
        // Point2D p2 = new Point2D(-2,4);
        // System.out.println(p1);
        // System.out.println(p2);
        // System.out.println(p1.distanceTo(p2));

        ArrayList<Point2D> points = new ArrayList<>();
        // a - append to list
        // d - delete from list
        // r - replace in list
        // i - insert in list
        // q - quit

        Scanner usr = new Scanner(System.in);
        System.out.println("List is currently:" + points);
        System.out.println("Enter a command");
        
        String command = usr.nextLine();

        while (!command.equals("q")){
            if (command.equals("a")){
                System.out.println("Enter an X coordinate: ");
                double x = usr.nextDouble();
                System.out.println("Enter a Y coordinate: ");
                double y = usr.nextDouble();
                Point2D newPoint = new Point2D(x, y);
                points.add(newPoint);
                System.out.println("Added to list! \n" + points);
            }
            if (command.equals("d")){
                System.out.println("Which item would you like to delete? \n" + points);
                
            }

        }
        
        
        // if (command.equals("r")){

        // }
        // if (command.equals("i")){

        // }
        // if (command.equals("q")){
            
        // }

    }


}
