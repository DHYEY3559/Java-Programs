import java.util.Scanner;

interface A {
    void findInterest(double p, double r, double n);
}

class SimpleInterest implements A {
    public void findInterest(double p, double r, double n) {
        double SI = (p * r * n) / 100;
        System.out.println("Simple Interest: " + SI);
    }
}

class CompoundInterest implements A {
    public void findInterest(double p, double r, double n) {
        double CI = p * (Math.pow((1 + (r / 100)), n) - 1);
        System.out.println("Compound Interest: " + CI);
    }
}

public class Prog3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Principal Amount (P): ");
        double p = sc.nextDouble();

        System.out.println("Enter Rate of Interest (%): ");
        double r = sc.nextDouble();

        System.out.println("Enter Number of Years (N): ");
        double n = sc.nextDouble();

        System.out.println("Choose: 1 for Simple Interest, 2 for Compound Interest");
        int choice = sc.nextInt();

        A interestCalculator;

        switch (choice) {
            case 1:
                interestCalculator = new SimpleInterest();
                break;
            case 2:
                interestCalculator = new CompoundInterest();
                break;
            default:
                System.out.println("Invalid choice! Please enter 1 or 2.");
                sc.close();
                return;
        }
        
        interestCalculator.findInterest(p, r, n);
        sc.close();
    }
}