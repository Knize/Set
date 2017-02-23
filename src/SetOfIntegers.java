/**
 * Created by Gin on 21.02.2017.
 */
public class SetOfIntegers {

    private int[] data;

    public SetOfIntegers() {
        this.data = new int[0];
    }

    public boolean add(int value) {
        if (contains(value)) {
            return false;
        }
//data = getCopyLarger(data);
        inflateData();
        data[data.length - 1] = value;
        return true;
    }

    public void clear() {
        data = new int[0];
    }

    public boolean isEmpty() {
        return data.length == 0;
    }

    public int size() {
        return data.length;
    }

    public int[] toIntegerArray() {

        return data;
    }

    public boolean remove(int value) {
// если не содержит значение возвращаем false
        if (!contains(value)) {
            return false;
        }
//иначе ищем значение и пересоздаём массив, копируя все элементы кроме удаляемого и возвращаем true
//data = getCopySmaller(data, value);
        deflateData(value);
        return true;
    }

    public void print() {
        if (data.length == 0) {
            System.out.println("Set is empty!");
        }
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
        System.out.println("_________________________________");
    }

    public boolean contains(int value) {
        for (int i = 0; i < data.length; i++) {
            if (value == data[i]) {
                return true;
            }
        }
        return false;
    }

    private int[] getCopySmaller(int[] a, int value) {
        int[] copyData = new int[a.length - 1];
        for (int i = 0, j = 0; i < copyData.length; i++, j++) {
            if (a[j] != value) {
                copyData[i] = a[j];
            } else {
                i--;
            }
        }
        return copyData;
    }

    private int[] getCopyLarger(int[] a) {
        int[] copyData = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            copyData[i] = a[i];
        }
        a = copyData;
        return a;
    }

    private int[] getCopyOfData() {
        int[] copyData = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            copyData[i] = data[i];
        }
        return copyData;
    }


    private void inflateData() {
        int[] newData = new int[data.length + 1];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    private void deflateData(int value) {
        int[] newData = new int[data.length - 1];
        for (int i = 0, j = 0; i < newData.length; i++, j++) {
            if (data[j] != value) {
                newData[i] = data[j];
            } else {
                i--;
            }
        }
        data = newData;
    }
}