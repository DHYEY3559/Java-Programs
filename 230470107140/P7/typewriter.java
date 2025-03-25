public class typewriter {
    public static void main(String[] args) {
        String text = "Hello world";
        System.out.println(text);
        int delay = 500;

        for (char c : text.toCharArray()){
            System.out.print(c);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        
    }
}
