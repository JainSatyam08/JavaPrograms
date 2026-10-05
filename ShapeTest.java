abstract class Shape{
    abstract double findArea();
    public void displayArea(){
        System.out.println("Area = " + findArea());
    }
}
class Circle extends Shape{
    double radius;
    double area;
    public  Circle(double radius){
        this.radius=radius;
    }
    @Override 
    double  findArea(){
        area=(22/7)*radius*radius;
        return area;
    }
    
}
class Rectangle extends Shape{
    double length;
    double breadth;
    double area;
    public Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }

    @Override 
    double findArea(){
        area=length*breadth;
        return area;
    }

    

}

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 6.0);
        for (Shape s : shapes) {
            s.displayArea(); // must print correct area for each shape
        }
    }
}