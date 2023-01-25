package groups;

import org.testng.annotations.Test;

public class ClassB extends AbstractClass {
    @Test
    public void TestThree() {
        System.out.println("Groups--->ClassB---->TestThree method");
    }

    @Test(groups = {"Smoke"})
    public void TestFour() {
        System.out.println("Groups--->ClassB----->TestFour method");
    }
}
