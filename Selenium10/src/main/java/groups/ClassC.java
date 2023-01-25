package groups;

import org.testng.annotations.Test;

public class ClassC {
    @Test
    public void TestOne(){
        System.out.println("Groups--->ClassC---->TestOne method");
    }
    @Test(groups = {"Smoke"})
    public void TestTwo(){
        System.out.println("Groups--->ClassC---->TestTwo method");
    }
}
