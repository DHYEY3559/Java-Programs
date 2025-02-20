abstract class shape{
    abstract void area();
}
class triangle extends shape{
    double base,height;
    void area(){
        double area = 0.5 * base * height;
        System.out.println("Area of triangle is: " +area);
    }
}

class Circle extends shape{
    double radius;
    void area(){
        double area = 3.14 * radius * radius;
        System.out.println("Area of circle is: " +area);
    }
}

class rectangle extends shape{
    double length,breadth;
    void area(){
        double area = length * breadth;
        System.out.println("Area of rectangle is: " +area);
    }
} 
public class p1 {
    triangle t = new triangle();
    Circle c = new Circle();
    rectangle r = new rectangle();   
}
