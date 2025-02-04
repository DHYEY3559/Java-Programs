import java.util.Scanner;
public class Prime_Userdef {
    public static void prime(int a){
        int min=0;
        for (int i = 2; i <= a; i++) {
            int count = 0;
            for (int j = 1; j <= a; j++) {
                if(i%j == 0){
                    count++;
                }
            }
            if (count==2) {
                min++;
                if(min<=1000){
                    System.out.println(i+" is prime");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        System.out.println("Enter n to display first n prime numbers :");
        int a = x.nextInt();

        prime(a);
        x.close();
    }
}
