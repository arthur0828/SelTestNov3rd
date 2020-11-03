package AllTest;

import org.testng.annotations.Test;

public class FirstTest {
    @Test(priority = 0)
    public void setup(){
        System.out.println("This is setup");
    }
    @Test(priority = 3)
    public void testLogic(){
        System.out.println("This is setup");
    }
    @Test(priority = 2)
    public void tearDown(){
        System.out.println("This is setup");
    }
}
