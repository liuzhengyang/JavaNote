import org.junit.Test;

import java.util.Arrays;

/**
 * Created by liuzhengyang on 2014/12/23.
 */
public class BuddleSortTest {

    @Test
    public void buddleSort(){
        String[] array = new String[]{"8", "2", "4", "7,", "5"};
        for(int i = 0; i < array.length; i ++){
            String temp = array[i];
            int pos = i;
            for(int j = i+1; j < array.length; j++){
                if(array[j].compareTo(temp)<0){
                    temp = array[j];
                    pos = j;
                }
            }
            switchArrayPos(array, i, pos);
        }
        System.out.println(Arrays.asList(array));
    }

    private void switchArrayPos(Object[] array, int firstIndex, int secondIndex){
        Object temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}
