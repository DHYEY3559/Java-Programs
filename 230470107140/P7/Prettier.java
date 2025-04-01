public class Prettier extends Thread {
    public static void main(String[] args) {
        Prettier Thread = new Prettier();
        Prettier Thread1 = new Prettier();
        Prettier Thread2 = new Prettier();
        Thread.start();
        Thread1.start();
        Thread2.start();
    }

    static Object lock = new Object();
    
    @Override
    public void run() {
        synchronized(lock){
            for(int i = 1 ; i<=2 ; i++){
                System.out.println(Thread.currentThread().getName()+" Threat is running");
            }
        }
    }
}