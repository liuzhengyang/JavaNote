/**
 * Created by liuzhengyang on 2015/1/1.
 */
public class Student {
    private Integer rollNumber;
    private String name;
    private Integer age;

    public Student(Integer rollNumber, String name, Integer age) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
    }

    public Integer getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(Integer rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
