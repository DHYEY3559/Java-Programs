import java.util.Stack;

public class P1 {
    public static void stack(Stack<Integer> a){
        System.out.println(a);
        a.pop();
    }
    public static void main(String[] args) {
        Stack<Integer> x = new Stack<>();
        x.push(1);
        x.push(2);
        x.push(3);
        x.push(4);
        x.push(5);
        x.push(6);
        while(!x.isEmpty()){
            stack(x);
        }
    }
}
