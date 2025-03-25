abstract class Shape {
    abstract void area();
}

class Triangle extends Shape {
    double base, height;

    void area() {
        base = 10; // Assigning values directly
        height = 5;
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}

class Circle extends Shape {
    double radius;

    void area() {
        radius = 7; // Assigning value directly
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Rectangle extends Shape {
    double length, breadth;

    void area() {
        length = 8;  // Assigning values directly
        breadth = 4;
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class pro1 {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        t.area();
        c.area();
        r.area();
    }
}
