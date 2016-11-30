import java.util.Arrays;

/**
 * Created by User on 27.11.2016.
 */
public class Main {
    public static void main(String[] args) throws Exception {

        Integer iarray [] = {2, 234, 45, 455, 667, 398, 22, 0};
        DemoArray<Integer> iArray=new DemoArray<>(iarray);
        System.out.println(Arrays.toString(iarray));

        System.out.println(iArray.avg());
        System.out.println(iArray.max());
        System.out.println(iArray.min());
        iArray.add(4);
        System.out.println(Arrays.toString(iarray));



    }
}

