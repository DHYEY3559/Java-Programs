import java.util.Random;
import java.util.Scanner;

public class Num_guess {
    public static void main(String[] args) {
        Random rand = new Random();
        int rand_int = rand.nextInt(10);
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess a number (1-10):");
        int s = sc.nextInt();
        if(s==rand_int){
            System.out.println("won");
        }
        else{
            System.out.println("lose");
        }
        sc.close();
    }
}
