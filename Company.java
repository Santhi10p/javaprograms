import java.util.*;

public class Company {
    String name;
    double sal;

    public Company(String name, double sal) {
        this.name = name;
        this.sal = sal;

    }

    public String toString() {
        return name + " : " + sal;
    }

    public static void main(String[] args) {
        List l1 = new ArrayList();
        l1.add(new Company("santhi", 100000));
        l1.add(new Company("Dinga", 1000));
        l1.add(new Company("Dingi", 2000));
        l1.add(new Company("Sanga", 50000));

        for (int i = 0; i < l1.size(); i++) {
            Object o = l1.get(i);
            Company s = (Company) o;
            if (s.sal >= 35000) {
                System.out.println(s);
            }
        }
    }
}
