
import org.testng.annotations.Test;


public class GoogleSearchTest extends BaseSeleniumTest {
    @Test
    public void googleSearchTest() {

        driver.get("https://google.com");
        driver.manage().window().maximize();

    }
}
