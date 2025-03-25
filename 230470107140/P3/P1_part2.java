    import java.util.Scanner;
    public class P1_part2 {
        static int top = -1;
        static int size = 5;
        static int stack[] = new int[5];
        public static void push(){
            Scanner sc = new Scanner(System.in);
            if(top == size-1){
                System.out.println("Stack overflow");
            }
            else{
                top++;
                System.out.println("Enter Element");
                stack[top] = sc.nextInt();
            }
        }
        public static void pop(){
            if(top == -1){
                System.out.println("Stack underflow");
            }
            else{
                top--;
                System.out.println("Element Popped");
            }
        }

        public static void display(){
            if(top == -1){
                System.out.println("Stack underflow");
            }
            else{
                for(int i=top;i>=0;i--){
                    System.out.println(stack[i]);
                }
            }
        }
        public static void main(String[] args) {
            int v;
            Scanner ch = new Scanner(System.in);
            do{
                System.out.println("Enter Choice");
                System.out.println("1.push 2.pop 3.display 4.exit");
                v = ch.nextInt();
                switch(v) {
                    case 1:
                        push();
                        break;
                    case 2:
                        pop();
                        break;
                    case 3:
                        display();
                        break;
                    case 4:
                        System.out.println("Exiting ...");
                        v=0;
                        break;
                    default:
                        System.out.println("Not valid choice");
                }
            }while(v != 0);
            ch.close();
        }
    }
