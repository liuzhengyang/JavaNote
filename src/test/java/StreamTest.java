import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by liuzhengyang on 2015/1/8.
 */
public class StreamTest {

    @Test
    public void testFlat(){
        // Stream.flat 变平， 如将多维数据变为一维
        Stream<List<Integer>> stream = Stream.of(Arrays.asList(3,2,1), Arrays.asList(43,23,52), Arrays.asList(9, 23, 23));
        Stream<Integer> integerStream = stream.flatMap(list -> list.stream());
        Long sum = integerStream
                .filter(x -> x > 2)
                .distinct()
                .sorted((a, b) -> b.compareTo(a))
//                .reduce(0, (a,b) ->a+b);
//                .reduce(0, Integer::sum)
                .parallel()
                        .peek(x -> System.out.println(x))
//                .mapToDouble(x -> x + 0.1)
                .map(x -> x + "")
                .peek(x -> System.out.println("map" + x))
                .map(Integer::parseInt)
                .mapToLong(e -> 1L)
                .reduce(0L, (a,b) -> a+b);
        System.out.println(sum);
//                .forEach(System.out::println);
    }

    @Test
    public void testIterate() throws Exception {
        Stream<String> stringStream = Stream.of("2", "s", "c");
//        String joined = stringStream.collect(Collectors.joining(","));
        Optional<String> joined = stringStream.reduce((a, b) -> a + "," + b);
        System.out.println(joined.orElseThrow(Exception::new));
    }

}
