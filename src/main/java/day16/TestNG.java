package day16;

import org.testng.annotations.*;

public class TestNG {
    @BeforeSuite
    void t1() {
        System.out.println("This is BeforeSuite");
    }
    @BeforeTest
    void t2() {
        System.out.println("This is BeforeTest");
    }
    @BeforeClass
    void t3() {
        System.out.println("This is BeforeClass");
    }
    @BeforeMethod
    void t4() {
        System.out.println("This is BeforeMethod");
    }
    @Test(priority = 1)
    void t5() {
        System.out.println("This is Script1");
    }
    @AfterMethod
    void t6() {
        System.out.println("This is AfterMethod");
    }
    @BeforeMethod
    void t7() {
        System.out.println("This is BeforeMethod");
    }
    @Test(priority = 2)
    void t8() {
        System.out.println("This is Script2");
    }
    @AfterMethod
    void t9() {
        System.out.println("This is AfterMethod");
    }
    @BeforeMethod
    void t10() {
        System.out.println("This is BeforeMethod");
    }
    @Test(priority = 3)
    void t11() {
        System.out.println("This is Script3");
    }
    @AfterMethod
    void t12() {
        System.out.println("This is AfterMethod");
    }
    @AfterClass
    void t13() {
        System.out.println("This is AfterClass");
    }
    @AfterTest
    void t14() {
        System.out.println("This is AfterTest");
    }
    @AfterSuite
    void t15() {
        System.out.println("This is AfterSuite");
    }
}

