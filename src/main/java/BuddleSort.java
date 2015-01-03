import java.util.Arrays;

/**
 * Created by liuzhengyang on 2015/1/3.
 */
public class BuddleSort {
    public void buddleSort(int[] array){
        for(int i = 0; i < array.length; i ++){
            int temp = array[i];
            int pos = i;
            for(int j = i+1; j < array.length; j++){
                if(array[j]< temp){
                    temp = array[j];
                    pos = j;
                }
            }
            switchArrayPos(array, i, pos);
        }
        System.out.println(Arrays.asList(array));
    }

    private void switchArrayPos(int[] array, int firstIndex, int secondIndex){
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}
