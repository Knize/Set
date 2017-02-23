/**
 * Created by Gin on 22.02.2017.
 */
public class SetAlgebra {

    public static final int MAX_VALUE = 200;
    public static final int MIN_VALUE = -200;


    public static SetOfIntegers union(SetOfIntegers a, SetOfIntegers b) {
        SetOfIntegers res = new SetOfIntegers();
        int[] aArray = a.toIntegerArray();
        for (int i = 0; i < aArray.length; i++) {
            res.add(aArray[i]);
        }
        int[] bArray = b.toIntegerArray();
        for (int i = 0; i < bArray.length; i++) {
            res.add(bArray[i]);
        }
        return res;
    }

    public static SetOfIntegers minus(SetOfIntegers a, SetOfIntegers b) {
        SetOfIntegers res = new SetOfIntegers();
        int[] aArray = a.toIntegerArray();
        for (int i = 0; i < aArray.length; i++) {
            res.add(aArray[i]);
        }
        int[] bArray = b.toIntegerArray();
        for (int i = 0; i < bArray.length; i++) {
            res.remove(bArray[i]);
        }
        return res;
    }

    public static SetOfIntegers intersectNaive(SetOfIntegers a, SetOfIntegers b) {
        SetOfIntegers bMinusA = minus(b, a);
        return minus(b, bMinusA);
    }

    public static SetOfIntegers intersectOptimized(SetOfIntegers a, SetOfIntegers b) {
        SetOfIntegers res = new SetOfIntegers();
        SetOfIntegers minSet;
        SetOfIntegers maxSet;
        if (a.size() < b.size()) {
            minSet = a;
            maxSet = b;
        } else {
            minSet = b;
            maxSet = a;
        }
        int[] minArray = minSet.toIntegerArray();
        for (int i = 0; i < minArray.length; i++) {
            if (maxSet.contains(minArray[i])) {
                res.add(minArray[i]);
            }
        }
        return res;
    }

    public static SetOfIntegers symmetricDifference(SetOfIntegers a, SetOfIntegers b) {
        return minus(union(a, b), intersectOptimized(a, b));
    }


    public static SetOfIntegers addition(SetOfIntegers a) {
        SetOfIntegers res = getUniversalSet();
        int[] aArray = a.toIntegerArray();
        for (Integer i : aArray){
            res.remove(i);
        }
        return res;
    }

    private static SetOfIntegers getUniversalSet() {
        SetOfIntegers set = new SetOfIntegers();
        for (int i = MIN_VALUE; i < MAX_VALUE; i++) {
            set.add(i);
        }
        return set;
    }
}