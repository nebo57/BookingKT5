import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sun.security.acl.AclEntryImpl;

import java.util.concurrent.TimeUnit;

public class AutomationPureTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver98.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://inforcedev.oneshield.com/splash.html");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void firstTest() throws InterruptedException {
        //Login into Dragon UI and opening of the Home page
        driver.findElement(By.className("whitebold-text")).click();
        driver.findElement(By.xpath("/html/body/div[4]/div/div/table/tbody/tr/td[1]/div/div/div/div/table/tbody/tr[3]/td/div/table/tbody/tr/td[1]/div/table/tbody/tr/td/div/div/div/div/div/div/div/div/div/input")).sendKeys("nmilovic");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[4]/div/div/table/tbody/tr/td[1]/div/div/div/div/table/tbody/tr[4]/td/div/table/tbody/tr/td[1]/div/table/tbody/tr/td/div/div/div/div/div/div/div/div/div/input")).sendKeys("oneshield");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[4]/div/div/table/tbody/tr/td[1]/div/div/div/div/table/tbody/tr[5]/td/div/table/tbody/tr/td[1]/div/table/tbody/tr/td/div/div/div/div/div/a/span/span/span[2]")).click();
        Thread.sleep(2000);
        //Going to Training Center page and from there directly to A23A11 Workflow
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/a[11]")).click();
        driver.findElement(By.xpath("//*[@id=\"fieldcontainer-2248-bodyEl\"]")).click();
        Thread.sleep(6000);

    }
}
