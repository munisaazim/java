package helperFunctions;

import org.testng.annotations.Test;

public class ClassB {
    @Test(enabled = true)
    public void TestThree() {
        System.out.println("HelperFunctions--->ClassB---->TestThree method");
    }
    @Test(enabled = false)
    public void TestFour() {
        System.out.println("HelperFunctions--->ClassB----->TestFour method");
    }
}
