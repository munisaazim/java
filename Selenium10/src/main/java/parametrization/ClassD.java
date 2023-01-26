package parametrization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ClassD{
    @Test(dataProvider="getData")
    public void call(String a, String b){
        System.out.println(a);
        System.out.println(b);
    }
}
