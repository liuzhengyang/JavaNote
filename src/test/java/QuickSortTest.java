import org.junit.*;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by liuzhengyang on 2015/1/1 .
 */
public class QuickSortTest {

    private static  int[] arr = new int[1000];

    QuickSort quickSort = new QuickSort();
    BuddleSort buddleSort = new BuddleSort();
//    private static  int[] arr = new int[]{2,1,3,4,8,5,24,5,5,9};

    @Before
    public void prepareArray(){
        System.out.println("--------------------------------------------");
        Arrays.parallelSetAll(arr, x -> new Random().nextInt(500));
        for(int x : arr){
            System.out.println(x);
        }
    }


    @Test
    public void testQuickSort(){
        int[] arr2 = Arrays.copyOf(arr,arr.length);
        System.out.println("--------------------------------------------");
        long startTime = System.currentTimeMillis();
        quickSort.quickSort(arr, 0, arr.length-1);
        long endTime = System.currentTimeMillis();

        System.out.println("Quick take " + (endTime - startTime));
        Arrays.sort(arr2);
        Assert.assertArrayEquals("Sort Fail", arr, arr2);
    }

    @Test
    public void testBuddleSort(){
        System.out.println("--------------------------------------------");
        long startTime = System.currentTimeMillis();
        buddleSort.buddleSort(arr);
        long endTime = System.currentTimeMillis();
        System.out.println("BuddleSort take " + (endTime - startTime));



    }


    @After
    public void showResult(){
        for(int x : arr){
            System.out.println(x);
        }
    }
}
