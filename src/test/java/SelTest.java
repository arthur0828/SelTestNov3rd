import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelTest {

    WebDriver driver;




    @BeforeMethod
    void setup(){

        System.setProperty("webdriver.chrome.driver", "/opt/WebDriver/bin/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }
    @Test
    public void testSite(){System.out.println(driver.getCurrentUrl());
    }


}
