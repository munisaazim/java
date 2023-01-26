package parametrization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassC {
    @Parameters({"URL"})
    @Test
    public void TestFive(String a){
        System.out.println("Parametrization--->ClassC---->TestOne method");
        System.out.println(a);
    }
    //@Parameters({"Site"})
    @Test
    public void TestSix(){
        System.out.println("Parametrization--->ClassC---->TestTwo method");
      //  System.out.println(a);
    }
    @DataProvider
    public Object[][] getData(){
        Object data[][]=new Object[3][2];
        data[0][0] = "1st username";
        data[0][1] = "1st lastname";
        data[1][0] = "2nd username";
        data[1][1] = "2nd lastname";
        data[2][0] = "2nd username";
        data[2][1] = "2nd lastname";
        return data;
    }
}
