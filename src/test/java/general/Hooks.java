package general;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks extends Base{
    private Base base;

    public Hooks(WebDriver driver, Base base) {
        super(driver);
        this.base = base;
    }

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "drivers/90/chromedriver.exe");
        base.driver = new ChromeDriver();
        base.driver.manage().window().maximize();
        base.driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
    }

    @After
    public void tearDown(){
        base.driver.quit();
    }
}
