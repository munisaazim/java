package annotations;

import groups.AbstractClass;
import org.testng.annotations.Test;

public class ClassA extends AbstractClass {
    @Test
    public void TestOne(){
        System.out.println("ClassA---->TestOne method");
    }
    @Test
    public void TestTwo(){
        System.out.println("ClassB---->TestTwo method");
    }
}

