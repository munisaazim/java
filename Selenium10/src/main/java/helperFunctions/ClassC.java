package helperFunctions;

import org.testng.annotations.Test;

public class ClassC {
    public void TestFive(){
        System.out.println("HelperFunctions--->ClassC---->TestOne method");
    }
    @Test(timeOut = 10)
    public void TestSix(){
        System.out.println("HelperFunctions--->ClassC---->TestTwo method");
    }
}
