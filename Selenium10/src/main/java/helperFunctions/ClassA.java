package helperFunctions;

import org.testng.annotations.Test;

public class ClassA {
    @Test
    public void TestOne(){
        System.out.println("HelperFunctions--->ClassA---->TestOne method");
    }
    @Test(dependsOnMethods = {"TestOne"})
    public void TestTwo(){
        System.out.println("HelperFunctions--->ClassA---->TestTwo method");
    }
}
