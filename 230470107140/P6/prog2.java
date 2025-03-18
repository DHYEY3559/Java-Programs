import java.util.HashMap;
import java.util.Scanner;

public class prog2 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("dhyey",25);
        hashMap.put("vismay",45);
        hashMap.put("yug",35);
        int a;
        Scanner v =new Scanner(System.in);
        do{
            System.out.println("Enter 1 continue search or 0 for exiting");
            a = v.nextInt();
            switch (a) {
                case 1:
                    Scanner sc =new Scanner(System.in);
                    System.out.println("Enter name for search to get number:");
                    String name = sc.nextLine();
                    if(hashMap.containsKey(name)){
                        System.out.println(hashMap.get(name));
                    }
                    else{
                        System.out.println("not present");
                    }
                    break;
    
                default:
                    System.out.println("Exiting....");
                    break;
            }
        }
        while(a!=0); 
        v.close();
    }
}
