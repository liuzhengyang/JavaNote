import java.util.Arrays;

/**
 * Created by liuzhengyang on 2015/1/2.
 */
public class QuickSort {

    public void quickSort(int[] array, int startInclude, int end){
        checkArray(array);

        int i,j,k;
        i = startInclude;
        j = end;

        int temp = array[startInclude];
        while(i<j){
            while(i<j){
                if(array[j] < temp){
                    array[i] = array[j];
                    i++;
                    break;
                }
                j--;
            }
            if(i == j)break;
            while(i< j){
                if(array[i] > temp){
                    array[j] = array[i];
                    j--;
                    break;
                }
                i++;
            }
            if(j == i)break;
        }
        array[i] = temp;

        // recursive
        if(i > startInclude){
            quickSort(array, startInclude, i-1);
        }
        if(i < end){
            quickSort(array, i+1, end);
        }
    }

    private void checkArray(int[] array) {
        if(array == null || array.length == 0){
            System.out.println("array is empty");
        }
    }
}
