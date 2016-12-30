import java.util.Arrays;

/**
 * Created by User on 27.11.2016.
 */
public class Main {
    public static void main(String[] args) throws Exception {

        DemoArray iArray = new DemoArray();
        Integer [] iarray = {2, 234, 45, 455, 667, 398, 22, 0};

        iArray.creat(iarray);

        iArray.print();

        iArray.addElem(34);
        iArray.addElem(15);

        iArray.deleteElement(3);
        iArray.deleteElement(22);

        iArray.max();
        iArray.min();
        iArray.avg();

//        String sarray [] = {"sd", "asdas", "asd", "asd"};
//        DemoArray<String> stringDemoArray = new DemoArray<>(sarray);
//        System.out.println(Arrays.toString(sarray));




    }
}

