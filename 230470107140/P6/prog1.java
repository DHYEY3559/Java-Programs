import java.util.ArrayList;
public class prog1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("DAA");
        list.add("Maths-1");
        list.add("EME");
        list.add("Database");
        System.out.println("Available: "+list);

        String[] moveSubject = {"Java", "DAA"};
        ArrayList<String> list2 = new ArrayList<String>();

        for (String s : moveSubject){
            if(list.contains(s)){
                list2.add(s);
                list.remove(s);
            }
        }
        System.out.println("Selected: "+list2);
    }
}
