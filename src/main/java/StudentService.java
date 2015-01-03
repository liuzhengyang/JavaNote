import java.util.Collections;
import java.util.List;

/**
 * Created by liuzhengyang on 2015/1/1.
 */
public class StudentService {

    public void sortByComparator(List<Student> studentList){
        Collections.sort(studentList, new StudentRollNumberComparator());
    }
}
