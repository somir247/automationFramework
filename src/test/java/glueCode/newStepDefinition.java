package glueCode;

import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.security.util.PendingException;

public class newStepDefinition {
    public static WebDriver driver;

    @Given("^i open \"([^\"]*)\" page$")
    public void i_open_page(String page) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
      // throw new PendingException();
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(page);
        driver.close();
    }
}
