import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * Created by liuzhengyang on 2015/1/8.
 */
public class PathTest {

    private static final Log log = LogFactory.getLog(PathTest.class);

    @Test
    public void testFileSystem() throws IOException {
        FileSystem fileSystem = FileSystems.getDefault();
        Iterable<Path> paths = fileSystem.getRootDirectories();
        paths.forEach(x -> System.out.println(x));

//        log.info(fileSystem);
//        Path path = fileSystem.getPath("","");
//        log.info(path.getRoot());
//        log.info(path.getFileName());
//        log.info(path.getName(0));
//        Stream<String> lines = Files.lines(path);
//        lines.forEach(System.out::println);
    }

    @Test
    public void testGetPath() {
        Path p1 = Paths.get("C:\\Program Files (x86)\\Google\\Chrome\\Application/debug.log");
        System.out.println(p1.getFileName());
        System.out.println(Files.isReadable(p1));
        System.out.println(Files.isWritable(p1));
        System.out.println(Files.isRegularFile(p1));

        try {
            Stream<String> lines = Files.lines(p1);
            Stream<String> words = lines.flatMap(line -> Stream.of(line.split(" "))).filter(s -> !"".equals(s.trim()));

//            String joined = words.collect(Collectors.joining(" ,"));
//            System.out.println(joined);
//
//            List<String> asList = words.collect(Collectors.toList());
//            System.out.println(asList);
//
//            Set<String> asSet = words.collect(Collectors.toSet());
//            System.out.println(asSet);
//
//            int totay = words.collect(Collectors.summingInt(String::length));
//            System.out.println(totay);
//
//            Map<Integer, List<String>> byLength = words.collect(Collectors.groupingBy(String::length));
//            byLength.entrySet().stream().forEach(System.out::println);
//
//            Map<Integer, String> byLengthDestinct = words.collect(Collectors.groupingBy(String::length, Collectors.joining()));
//            System.out.println(byLengthDestinct);
//
//            Map<Integer, Set<String>> wordCount = words.collect(Collectors.groupingBy(String::length, LinkedHashMap::new, Collectors.mapping(x->x, Collectors.toSet())));
//            wordCount.entrySet().forEach(System.out::println);
//
//            List<String> asList = words.collect(Collectors.toList());
//            Set<String> set = words.collect(Collectors.toCollection(LinkedHashSet::new));
//
//
//            Map<Integer, List<String>> wordsByLenth = words.collect(Collectors.groupingBy(x -> x.length()));
//            List<String> asList = words.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
//            System.out.println(asList);
//
//
//            wordsByLenth.entrySet().stream().forEach(System.out::println);
//
//
//            System.out.println(set);
//            words.forEach(System.out::println);
//            HashSet<String> wordSet = words.collect(HashSet::new, HashSet::add, HashSet::addAll);
//            System.out.println(wordSet);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testWordCount() {
        Path novel = Paths.get("C:/01.txt");
        System.out.println(Files.isReadable(novel));
        System.out.println(Files.exists(novel));


        try {


            Stream<String> lines = Files.lines(novel);

            Stream<String> words = lines
                    .flatMap(x -> Stream.of(x.split(" ")))
                    .filter(x -> !x.isEmpty());


//            Set<String> wordDistinct = words.collect(Collectors.toSet());
//            String joined = words.collect(StringBuilder::new, (a,b) -> a.append(",").append(b), StringBuilder::append).toString();

//            Map<Integer, Set<String>> wordByLength = words.collect(Collectors.groupingBy(x -> x.length(), TreeMap::new, Collectors.toSet()));


            Map<String, Integer> wordCount = words.collect(Collectors.groupingBy(x -> x, Collectors.summingInt( x-> 1)));
            wordCount.entrySet()
                    .stream()
//                    .sorted(Map.Entry.comparingByKey())
                    .forEach(System.out::println);

//            System.out.println(joined);


        } catch (IOException e) {
            e.printStackTrace();
        }


        File file = new File("C:/01.txt");

        try(
                BufferedReader br = new BufferedReader(new FileReader(file))
        ){
            String line = null;
            List<String> words = new ArrayList<>();
            Map<String, Integer> wordCount = new HashMap<>();
            while((line = br.readLine())!=null){
                for(String word : line.split(" ")){
                    if(!word.isEmpty()){
                        if(wordCount.containsKey(word)){
                            wordCount.put(word, wordCount.get(word) + 1);
                        }else{
                            wordCount.put(word, 1);
                        }
                    }
                }
            }
            System.out.println(wordCount);

        }catch(IOException e){
            e.printStackTrace();
        }

//        Path path = file.toPath();
//        try {
//            Stream<String> lines = Files.lines(path);
//            lines.forEach(System.out::println);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//

//
//        Stream<String> lines = Files.lines(novel);
//        lines.forEach(x -> System.out.println(x));
    }
}
