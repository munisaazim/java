package parallelRunning;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassA {
    @Test
    public void TestOne(){
        System.out.println("ParallelRunning--->ClassA---->TestOne method");
    }
    @Test
    public void TestTwo(){
        System.out.println("ParallelRunning--->ClassA---->TestTwo method");
    }
}
