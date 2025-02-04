import java.util.Scanner;

public class Calulator_UserDef {
    public static void Sum(int a,int b){
        int sum = a+b;
        System.out.println(sum);
    }
    public static void Sub(int a,int b){
        int sub = a-b;
        System.out.println(sub);
    }
    public static void Mul(int a,int b){
        int mul = a*b;
        System.out.println(mul);
    }
    public static void Div(int a,int b){
        double div = (double)a/b;
        System.out.println(div);
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num1: ");
        int s1 = sc.nextInt();
        System.out.println("Enter Num2: ");
        int s2 = sc.nextInt();

        System.out.println("1:Add 2:Sub 3:Mul 4:Div");
        int v = sc.nextInt();

        switch (v) {
            case 1 -> Sum(s1,s2);
            case 2 -> Sub(s1,s2);
            case 3 -> Mul(s1,s2);
            case 4 -> Div(s1,s2);
            default -> System.out.println("Error");
        }
        sc.close();
    }
}
