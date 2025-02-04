import java.util.Scanner;
class Calculator{
    public static void main(String args[]) {
        System.out.println("enter Value=");
        Scanner sc= new Scanner(System.in);
        int v = sc.nextInt();

        int a=10;
        int b=20;
        int sum;

        switch (v) {
            case 1 -> {
                sum=a+b;
                System.out.println("add = "+sum);
            }
            case 2 -> {
                sum=a-b;
                System.out.println("Sub = "+sum);
            }
            case 3 -> {
                sum=a*b;
                System.out.println("Mul = "+sum);
            }
            case 4 -> {
                sum=a/b;
                System.out.println("Div = "+sum);
            }
        
            default -> System.out.println("Error");
        }
        sc.close();
    }
}