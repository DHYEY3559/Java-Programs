//  Write a program to calculate area of circle, triangle and square using the concept of method overloading.

public class T4p1{

    public static void area(double r)
    {
        double area = 3.14 * r * r;
        System.out.println("Area of circle is: "+area);
    }
    public static void area(double h,double b)
    {
        double area = 0.5 * b * h;
        System.out.println("Area of triangle is: "+area);
    }
    public static void area(float s)
    {
        double area = s*s;
        System.out.println("Area or Square is: "+area);
    }
    public static void main(String[] args) {
        area(0.5f);
    }
}