import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public abstract class BaseSeleniumTest {

    protected WebDriver driver;


        @BeforeTest
        public void setUp(){
            //driver.manage().window().maximize();
            System.out.println("przed klasa test");
            driver = new ChromeDriver();

        }

         @AfterClass
         public void tearDown(){

        System.out.println("po klasie Test");
        driver.quit();
    }



}