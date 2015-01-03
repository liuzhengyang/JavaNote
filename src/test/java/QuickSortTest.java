import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by liuzhengyang on 2015/1/1 .
 */
public class QuickSortTest {

    private static  int[] arr = new int[]{1,4,5,24,3,8,5,1,2,5,9};
//    private static  int[] arr = new int[]{2,1,3,4,8,5,24,5,5,9};

    public void quickSort(int[] array){
        if(array.length <= 0) return ;

    }

    @Test
    public void testQuickSort(){
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(arr, 0, arr.length-1);
        for(int x : arr){
            System.out.println(x);
        }
    }

    @Test
    public void testArray(){

    }
}
