import java.util.Scanner;
public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int martrixA[][] = new int[3][3];
        int martrixB[][] = new int[3][3];
        int result[][] = new int[3][3];
        System.out.println("Enter Matrix A:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                martrixA[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Matrix B:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                martrixB[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                result[i][j] = 0;
                for(int k=0;k<3;k++){
                    result[i][j] += martrixA[i][k] * martrixB[k][j];
                }
            }
        }
        System.out.println("result is");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println(" ");
        }
        sc.close();
    }
}