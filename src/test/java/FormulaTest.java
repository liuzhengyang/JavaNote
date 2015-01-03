import org.junit.Test;

/**
 * Created by liuzhengyang on 2015/1/1.
 */
public class FormulaTest {
    Formula formula = Math::sqrt;

    @Test
    public void testDefaultMethod(){
        System.out.println(formula.calculate(5));
        System.out.println(formula.sqrt(5));
    }

    @Test
    public void testOverrideDefaultMethod(){
        FormulaImpl formula1 = new FormulaImpl();
        System.out.println(formula1.sqrt(4));
    }
}
