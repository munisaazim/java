package groups;

import org.testng.annotations.Test;

public class ClassA extends AbstractClass {
    @Test(groups = {"Smoke"})
    public void TestOne(){
        System.out.println("Groups--->ClassA---->TestOne method");
    }
    @Test(groups = {"Smoke"})
    public void TestTwo(){
        System.out.println("Groups--->ClassA---->TestTwo method");
    }
}
