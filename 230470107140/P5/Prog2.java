interface P {
    int var1=10;
    void m();
}

interface P1 extends P {
    int var2=20;
    void m1();
}

interface P2 extends P{
    int var3=30;
    void m2();
}

interface P12 extends P1,P2 {
    int var4=10;
    void m3();
}

class Q implements P12{
    public void m(){
        System.out.println(var1);
    }   
    public void m1() {
        System.out.println(var2);
    }
    public void m2(){
        System.out.println(var3);
    }
    public void m3(){
        System.out.println(var4);
    } 
}

public class Prog2 {
    public static void main(String[] args) {
        Q q = new Q();
        q.m();
        q.m1();
        q.m2();
        q.m3();
    }
}
