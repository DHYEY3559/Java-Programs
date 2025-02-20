import java.util.Scanner;

interface P {
    void findinterest(double p,double r,double n);
    }

class simpleinterest implements P {
    public void findinterest(double p,double r,double n){
        double SI=(p*r*n)/100;
        System.out.println("Simple interest is"+SI);
    }
}
class compoubdinterest implements P {
    public void findinterest(double p,double r,double n){
        double CI=p+(Math.pow((1+(r/100)),n))-p;
        System.out.println("Compound interest is"+CI);
    }
}
public class Prog3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int v = sc.nextInt();
        switch (v) {
            case 1:
                System.out.println("enter p:");
                int p = sc.nextInt();
                break;
        
            default:
                break;
        }
    }
}
