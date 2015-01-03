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
            for(k = j; k > i; k--){
                if(array[k] < temp){
                    array[i] = array[k];
                    i++;
                    j = k;
                    break;
                }
            }
            if(i == k)break;
            for(k = i; k < j; k++){
                if(array[k] > temp){
                    array[j] = array[k];
                    i = k;
                    j--;
                    break;
                }
            }
            if(j == k)break;
        }
//        System.out.println(i);
//        System.out.println(j);
        array[i] = temp;
//        Arrays.asList(array).forEach(System.out::println);


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
