import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by User on 23.11.2016.
 */
 public class DemoArray<T extends Number> {

    protected Number[] array = new Number[10];

    protected void creat(Number[] newArray) {
        array = newArray;
    }

    protected void print() {
        System.out.println(Arrays.toString(array));
    }

    public void addElem(T value) {
        Number[] arrayN = new Number[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            arrayN[i] = array[i];
        }
        arrayN[array.length] = value;

        array = arrayN;
        System.out.println("Увеличенный массив" + Arrays.toString(array));
    }

    protected void deleteElement(int j) {
        for (int i = j; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        Number[] arrayD = new Number[array.length - 1];
        for (int i = 0; i < arrayD.length; i++) {
            arrayD[i] = array[i];
        }
        array = arrayD;
        System.out.println("Уменьшеный массив" + Arrays.toString(array));
    }

    protected int max() {
        int max = (int) array[0];
        for (int i = 0; i < array.length; i++)
            if (max < (int) array[i]) {
                max = (int) array[i];
            }
        System.out.println("max=" + max);
        return max;
    }

    protected int min() {
        int min = array[0].intValue();
        for (int i = 0; i < array.length; i++)
            if (min > array[i].intValue()) {
                min = array[i].intValue();
            }
        System.out.println("min=" + min);
        return min;
    }

    protected Number avg() {
        double avg = 0;
        int n = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i].intValue() != 0) {
                avg += array[i].intValue();
                n++;
            }
        avg = avg / n;
        System.out.println("avg=" + avg + "; n=" + n);
        return avg;
    }
}











