import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        

        ArrayList<Integer> list = new ArrayList<>();

        list.add(20);
        System.out.println(list);
        list.add(30);
        list.add(40);
        System.out.println(list);
        list.set(0, 100);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list);



    }
}