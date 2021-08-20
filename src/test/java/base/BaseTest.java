package base;

import com.saucedemo.page.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    private WebDriver driver;
    private final String url="https://www.saucedemo.com";
    protected LoginPage loginPage;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        loginPage=new LoginPage(driver);
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }


}
