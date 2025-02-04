// Write a method with following method header. 
//public static int gcd(int num1, int num2) 
//Write a program that prompts the user to enter two integers and compute the gcd of two integers.

public class P2 {

    static int gcd = 1;
    public static int GCD(int num1,int num2)
    {
        for(int i=1; i<=num1 && i<=num2; i++)
        {
            if(num1%i == 0 && num2%i == 0)
            {
                gcd = i;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        int ans = GCD(50,10);
        System.out.println(ans);
    }
}
