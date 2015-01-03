import java.util.Comparator;

/**
 * Created by liuzhengyang on 2015/1/1.
 */
public class StudentRollNumberComparator implements Comparator<Student>{

    @Override
    public int compare(Student student1, Student student2) {
        return student1.getRollNumber().compareTo(student2.getRollNumber());
    }
}
