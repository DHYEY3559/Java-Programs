public class Cal2 {
    public static void main(String[] args) {
        int n=2;

        int n1=1;
        int n2=10;

        for (int i = n1; i < n2; i++) {
            if(i%n == 0){
                System.out.println(n+" is divided by "+i);
            }
        }
    }
}