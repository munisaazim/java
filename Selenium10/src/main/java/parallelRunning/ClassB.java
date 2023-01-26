package parallelRunning;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassB {
    @Test
    public void TestThree() {
        System.out.println("ParallelRunning--->ClassB---->TestThree method");
    }
    @Test
    public void TestFour() {
        System.out.println("ParallelRunning--->ClassB----->TestFour method");
    }
}
