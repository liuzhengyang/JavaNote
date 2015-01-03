import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by liuzhengyang on 2015/1/1.
 */
public class StudentTest {

    private List<Student> studentList = new ArrayList<Student>();

    @Before
    public void setUp(){
        studentList.add(new Student(4, "liuzhengyang", 24));
        studentList.add(new Student(2, "liuzheng34yang", 24));
        studentList.add(new Student(35, "liuzhe3ngyang", 234));
        studentList.add(new Student(5, "liuzhengya46ng", 24));
    }

    @Test
    public void testSortByComparator(){
        new StudentService().sortByComparator(studentList);
        System.out.println(studentList);
    }
    @Test
    public void testSortByLambdaExpression(){
        Collections.sort(studentList, (s1, s2) -> s1.getRollNumber().compareTo(s2.getRollNumber()));
        System.out.println(studentList);
    }
    @Test
    public void testSortByLambdaExpression2(){
        studentList.sort(Comparator.comparing(Student::getRollNumber));
        System.out.println(studentList);
    }
}
