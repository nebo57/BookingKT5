import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoogleMessagesForWeb {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void automationTest() {
        driver.get("http://www.automationpractice.pl/index.php");
        driver.findElement(By.cssSelector("#contact-link > a")).click();
        Select selectSubjectHeading = new Select(driver.findElement(By.cssSelector("#id_contact")));
        selectSubjectHeading.selectByVisibleText("Customer service");

        driver.findElement(By.cssSelector("#email")).sendKeys("test@email.com");
        driver.findElement(By.cssSelector("#id_order")).sendKeys("14556");
        driver.findElement(By.cssSelector("#fileUpload")).sendKeys("C:\\Users\\NebojsaMilovic\\Desktop\\image.png");
        driver.findElement(By.cssSelector("#message")).sendKeys("Cao");
        driver.findElement(By.cssSelector("#submitMessage")).click();

        Assert.assertEquals(driver.findElement(By.cssSelector(".alert.alert-success")).getText(), "Your message has been successfully sent to our team.");
    }
}
