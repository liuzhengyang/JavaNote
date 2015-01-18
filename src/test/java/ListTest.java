import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by liuzhengyang on 2015/1/14.
 */
public class ListTest {

    private static final Log log = LogFactory.getLog(ListTest.class);
    @Test
    public void testAdd(){
        List<String> strList = new ArrayList<>();
        strList.add("liuzhengyang");
        log.info(strList);
        strList.add("hello world");
        log.info(strList);
        log.info(strList.get(1));
        strList.add(1, "china");
        log.info(strList);
        strList.set(0, "list");
        log.info(strList);
        strList.remove(0);
        log.info(strList);

        log.info(strList.indexOf("hello world"));
        log.info(strList.lastIndexOf("hello world"));

        strList.clear();
        log.info(strList);


        strList.addAll(Arrays.asList("1","2","3","4","5","6"));
        log.info(strList);

        List<String> subList = strList.subList(1,4);
        log.info(subList);

        strList.add("7");
        strList.add("7");
        log.info(strList);
        log.info(subList);

    }


    @Test
    public void testIterator(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);

        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }

        System.out.println(list);
    }
}
