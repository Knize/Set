/**
 * Created by Gin on 11.02.2017.
 */
public class Main {

    public static void main(String[] args) {
        SetOfIntegers set = new SetOfIntegers();
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(8);
        set.add(5);
        System.out.println("Set 'set':");
        set.print();
        SetOfIntegers set1 = new SetOfIntegers();
        set1.add(1);
        set1.add(2);
        set1.add(4);
        set1.add(18);
        set1.add(15);
        System.out.println("Set 'set1':");
        set1.print();

        SetOfIntegers union = SetAlgebra.union(set, set1);
        System.out.println("Set 'union':");
        union.print();

        SetOfIntegers dif = SetAlgebra.minus(set, set1);
        System.out.println("Set 'dif':");
        dif.print();


    }
}