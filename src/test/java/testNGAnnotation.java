import org.testng.annotations.*;

/**
 * Created by Sanath on 5/18/2018.
 */
public class testNGAnnotation {

    @BeforeMethod
    public void beforeMethod1(){

        System.out.println("beforeMethod1");
    }

    @Test
    public  void testAction1(){

        System.out.println("testAction1");
    }

    @Test
    public  void testAction2(){

        System.out.println("testAction2");
    }

    @AfterMethod

    public void afterMethod1(){

        System.out.println("afterMethod1");
    }

    @BeforeClass

    public void beforeClass(){

        System.out.println("beforeClass");
    }

    @AfterClass

    public void afterClass(){

        System.out.println("afterClass");
    }

    @BeforeTest

    public  void beforeTest(){

        System.out.println("beforeTest");

    }

        @AfterTest
    public void afterTest(){

            System.out.println("afterTest");
        }

        @BeforeSuite

    public void beforeSuite(){

            System.out.println("beforeSuite");

        }
    @AfterSuite

    public void afterSuite(){

        System.out.println("afterSuite");
    }

        @BeforeGroups

    public void beforeGroup(){

            System.out.println("beforeGroup");
        }

        @AfterGroups
        public void AfterGroups(){

            System.out.println("AfterGroups");
        }
}
