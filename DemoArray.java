import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by User on 23.11.2016.
 */
 public class DemoArray<T extends Number> {
    T[] array;
   private int length = 0;

    DemoArray(T[] o) {
        array = o;
    }

    protected int max(){
        int max = array[0].intValue();
    for (int i = 0; i < array.length; i++)
        if (max < array[i].intValue()) {
            max = array[i].intValue();
        }
//    System.out.println("max=" + max);
    return max;
}
    protected int min(){
        int min = array[0].intValue();
        for (int i = 0; i < array.length; i++)
            if (min > array[i].intValue()) {
                min = array[i].intValue();
            }
//        System.out.println("min=" + min);
        return min;
    }
    protected double avg(){
        double sum = 0.0;
        for (int i = 0; i < array.length; i++)
            sum += array[i].doubleValue();

        return sum/array.length;
    }
    public void add(T i) { //добавить в конец

        array[array.length-1] = i;
            }




//    protected void addElement (T value){
//
//        T [] arrayN = new T [array.length+1];
//        for (int i = 0; i < array.length; i++){
//            arrayN[i]=array[i];}
//
//
//
//        for (int i = 0; i < array.length; i++){
//            arrayN[i]=array[i];}
//        for (int i = arrayN.length; i > j; i--) {
//            arrayN[i-1] = arrayN[i - 2];
//        }
//        arrayN[j]= value;
//        System.out.println("Увеличенный массив " + Arrays.toString(arrayN));
//    }
//
//    protected int [] deleteElement (int j) {
//        for (int i = j; i < array.length-1; i++) {
//            array[i] = array[i + 1];
//        }
//
//        int[] arrayD = new int[array.length - 1];
//        for (int i = 0; i < arrayD.length; i++) {
//            arrayD[i] = array[i];
//        }
//        int [] array = arrayD; //сделал вариант с перезаписыванием исходного массива
////        System.out.println("Уменьшенный массив " + Arrays.toString(arrayD));
//        System.out.println("Уменьшенный массив " + Arrays.toString(array));
//        return array;
//
//    }



}

