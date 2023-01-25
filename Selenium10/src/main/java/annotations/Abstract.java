package annotations;

import org.testng.annotations.*;

public abstract class Abstract {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite\n");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("BeforeTest\n");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass\n\n");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("AfterTest\n");
    }
    @AfterSuite
    public void afterSuie(){
        System.out.println("AfterSuite");
    }
}
