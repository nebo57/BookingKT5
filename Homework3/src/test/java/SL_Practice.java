import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class SL_Practice {
    WebDriver driver;


    @BeforeMethod


    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void tearDown (){
    driver.quit();

    }
    @Test
    @Parameters({"username", "password","elementMessage","expectedResult","elementError", "expectedResultError"})
    public void automationTest(@Optional String username,@Optional String password,
                               @Optional String elementMessage,@Optional String expectedResult,
                               @Optional String elementError,@Optional String expectedResultError ) {

        driver.get("https://www.saucedemo.com/v1/");

        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.cssSelector("#login-button")).click();

        if (elementMessage != null && expectedResult != null) {
            Assert.assertEquals(driver.findElement(By.xpath(elementMessage)).getText(),expectedResult );
        }
        if (elementError != null && expectedResultError != null) {
            Assert.assertEquals(driver.findElement(By.xpath(elementError)).getText(), expectedResultError);
        }

    }
}