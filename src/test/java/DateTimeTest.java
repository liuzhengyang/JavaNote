import org.junit.Test;

import java.time.Clock;

/**
 * Created by liuzhengyang on 2015/1/1.
 */
public class DateTimeTest {

    @Test
    public void testClock(){
        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock.getZone());
        System.out.println(clock.millis());
//        System.out.println(clock.instant().);
    }
}
