package parametrization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassA {
    @Parameters({"URL"})
    @Test
    public void TestOne(String a){
        System.out.println("Parametrization--->ClassA---->TestOne method");
        System.out.println(a);
    }
    @Parameters({"Site"})
    @Test
    public void TestTwo(String b){
        System.out.println("Parametrization--->ClassA---->TestTwo method");
        System.out.println(b);
    }
}
