import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by liuzhengyang on 2015/1/15.
 */
public class SpliteratorTest {

    private static final Log log = LogFactory.getLog(SpliteratorTest.class);


    public static <E> void replace(List<E> list, E val, E newVal){
        for(ListIterator<E> it = list.listIterator(); it.hasNext(); ){
            if(val == null ? it.next() == null : val.equals(it.next())){
                it.set(newVal);
            }
        }
    }

    @Test
    public void testSpliterator(){
//        Set<String> set = new HashSet<>();
//        set.add("1");
//        set.add("2");
//        set.add("3");
//        set.add("4");
//        log.info(set.add("3"));
//        Spliterator<String> stringSpliterator = set.spliterator();
//        System.out.println(stringSpliterator.toString());
//
//        String[] arr = set.toArray(new String[0]);
//        for(String s : arr){
//            System.out.println(s);
//        }
//        System.out.println(arr[2]);
//        System.out.println(set.stream().collect(Collectors.joining()));
//
//
//        Collection<String> c = new ArrayList<>();
//        Set<String> sets = c.stream().collect(Collectors.toCollection(TreeSet::new));
//
//
//        Integer[] integers = new Integer[]{2,3,4,5,6};
////
//        List<Integer> integerList = Arrays.asList(integers);
//
//        integerList.set(0, 4);
//        try{
//            integerList.remove(0);
//        }catch (UnsupportedOperationException e){
//            e.printStackTrace();
//        }
//        for(int i : integers){
//            System.out.println(i);
//        }

        List<Integer> list = new LinkedList<>();
        list.add(7);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
//        list.subList(2,3).clear();
        list.sort(Comparator.<Integer>naturalOrder());

        log.info(Collections.binarySearch(list, 6));

        Collections.replaceAll(list, 3, 5);

//        Iterator<Integer> iterator = list.iterator();
//        while(iterator.hasNext()){
//            iterator.forEachRemaining(x -> System.out.println(x));
//        }
        ListIterator<Integer> listIterator = list.listIterator();
        while(listIterator.hasNext()){
            int temp = listIterator.next();
            log.info(temp);
            listIterator.remove();
            listIterator.add(temp*5);
            if(listIterator.hasNext()){
//                listIterator.next();
            }
        }

        list.forEach(System.out::println);

//        Integer[] integers = new Integer[]{1,2,3,4,5,6,7};
//        List<Integer> integerList = new ArrayList<>(Arrays.asList(integers));
//        integerList.remove(Integer.valueOf(2));
//        System.out.println(integerList);

    }
}
