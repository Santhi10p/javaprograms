import java.util.*;
public class RetainAll{
    public static void main(String[] args) {
        List bag1=new ArrayList();
        List bag2=new ArrayList();
        bag1.add("Mango");
        bag1.add("Apple");
        bag1.add("Kiwi");
        bag1.add("Pomogranate");
        bag2.add("Jack fruit");
        bag2.add("Pine apple");
        bag2.add("Apple");
        bag2.add("Mango");
        bag1.retainAll(bag2);
        System.out.println(bag1);
        System.out.println(bag2);
        System.out.println(bag2.contains("Mango"));
        System.out.println(bag1.contains("Kiwi"));
        System.out.println(bag2.get(2));
    }
}