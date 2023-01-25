package annotations;

import groups.AbstractClass;
import org.testng.annotations.Test;

public class ClassB extends AbstractClass {
    @Test
    public void TestThree() {
        System.out.println("ClassB---->TestThree method");
    }

    @Test
    public void TestFour() {
        System.out.println("ClassB----->TestFour method");
    }
}
