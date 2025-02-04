public class Prime { 
    public static void main(String[] args) {
        int n=50;
        int min = 0;

        for (int i = 2; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= n; j++) {
                if(i%j == 0){
                    count++;
                }
            }
            if (count==2) {
                min++;
                if(min<=10){
                    System.out.println(i+" is prime");
                }
            }
        }
    }
}
