package parametrization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassB {
   @Parameters({"URL"})
    @Test
    public void TestThree(String a) {
        System.out.println("Parametrization--->ClassB---->TestThree method");
        System.out.println(a);
    }
    @Parameters({"Site"})
    @Test
    public void TestFour(String a) {
        System.out.println("Parametrization--->ClassB----->TestFour method");
        System.out.println(a);
    }
}
