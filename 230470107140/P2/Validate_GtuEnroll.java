import java.util.Scanner;
public class Validate_GtuEnroll {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        int flag = 0;
        String Enroll;
        System.out.print("Enter Enrollment: ");
        Enroll = x.next();
        
        if (Enroll.length() == 12 && Enroll != null && !Enroll.contains(" ")){
            for(char ch : Enroll.toCharArray()){
                if(Character.isDigit(ch)){
                    flag = 0;
                    break;
                }
                else{
                    flag = 1;
                }
            }
            if(flag==0){
                System.out.println("Valid");
            }
            else{
                System.out.println("Invalid");
            }
        }
        else{
            System.out.println("InValid");
        }
        x.close(); 
    }
}
