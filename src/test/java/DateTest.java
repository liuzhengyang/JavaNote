import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by liuzhengyang on 2015/1/17.
 */
public class DateTest {

    @Test
    public void testCompareDate() throws InterruptedException {

        Date date1 = new Date();

        Thread.sleep(1000*1);


        Date date2 = new Date();


        System.out.println(date1 .compareTo(date2));

    }


    @Test
    public void testParseDate() throws ParseException {
        String dateStr = "1992-12-18";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date thatDate = sdf.parse(dateStr);


        System.out.println(thatDate.compareTo(new Date()));
    }

}
