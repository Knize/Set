/**
 * Created by Gin on 22.02.2017.
 */
public class SetAlgebra {

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

    public static SetOfIntegers intersect(SetOfIntegers a, SetOfIntegers b){
        SetOfIntegers res = new SetOfIntegers();
        SetOfIntegers union = union(a, b);
        int[] aArray = a.toIntegerArray();
        int[] bArray = b.toIntegerArray();
        for (int i = 0; i < ; i++) {

        }
    }
}