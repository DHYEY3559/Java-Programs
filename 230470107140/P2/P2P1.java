import java.util.Scanner;
public class P2P1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String mail;
        System.out.println("Enter Mail: ");
        mail = x.next();
        if (mail.length() <= 15){
            if (mail.contains("@") && mail.contains(".com") && !mail.contains(" ")) {
                System.out.println("Valid");
            }
            else{
                System.out.println("Invalid");
            }
        }
        else{
            System.out.println("Invalid");
        }
        x.close();
    }
}