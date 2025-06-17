import java.util.*;
public class Addall{
    public static void main(String[] args) {
        List bag1=new ArrayList();
        List bag2=new ArrayList();
        List bag3=new ArrayList();
        bag1.add("Maths");
        bag1.add("Science");
        bag1.add("History");
        bag2.add("Tamil");
        bag2.add("French");
        bag2.add("English");
        System.out.println("Bag-1 : "+bag1);
        System.out.println("Bag-2 : "+bag2);
        /*bag3.addAll(bag1);
        bag3.addAll(bag2);
        */
        bag2.addAll(bag1);
        System.out.println("Addall : "+bag2);
    }
}