package parallelRunning;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassC {
    @Test
    public void TestFive(){
        System.out.println("ParallelRunning--->ClassC---->TestOne method");
    }
    @Test
    public void TestSix(){
        System.out.println("ParallelRunning--->ClassC---->TestTwo method");
    }
}
