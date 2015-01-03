/**
 * Created by liuzhengyang on 2015/1/1.
 */
@FunctionalInterface
public interface Formula {
    double calculate(int num);
    default double sqrt(int a){
        return Math.sqrt(a);
    }
}
