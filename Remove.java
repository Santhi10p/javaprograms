import java.util.ArrayList;
import java.util.List;

public class Remove {
    public static void main(String[] args) {
        List bag=new ArrayList();
        bag.add(10);
        bag.add(20.3);
        bag.add("Santhi");
        bag.add(10);
        bag.add(null);
        bag.add(null);
        System.out.println(bag);
        bag.remove(1);
        System.out.println("After remove : "+bag);
    }
}
