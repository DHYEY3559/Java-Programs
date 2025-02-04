import java.util.Arrays;
import java.util.Scanner;
public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String 1 = ");
        String str = sc.next();

        System.out.println("Enter String 2 = ");
        String str1 = sc.next();

        if (str.length() == str1.length()){
            str = str.toLowerCase();
            str1 = str1.toLowerCase();

            char s1[] = str.toCharArray();
            char s2[] = str1.toCharArray();

            Arrays.sort(s1);
            Arrays.sort(s2);

            if(Arrays.equals(s1,s2)){
                System.out.println("String is anagram");
            }else{
                System.out.println("String is not anagram");
            }
            
        }
        else {
            System.out.println("String is not anagram");
        }
        sc.close();
    }
}
