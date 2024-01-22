import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
    public void sendMessages() throws InterruptedException {
        String[] numbers = {"0652542615", "0642629266", "0640080856"};
        driver.get("https://messages.google.com/web/authentication");
//        Thread.sleep(20000);
        for (int i =0; i<numbers.length; i++) {
            //Click on 'Start Chat' button
            driver.findElement(By.xpath("//div[contains(text(),' Start chat ')}/../..")).click();
            //Enter phone number of recipient
            driver.findElement(By.xpath("//input[@placeholder='Type a name, phone number, or email']")).sendKeys((numbers[i]));
            //Click Enter to confirm input of phone number
            driver.findElement(By.xpath("//input[@placeholder='Type a name, phone number, or email']")).sendKeys(Keys.ENTER);
            //Enter text in the message text area
            driver.findElement(By.xpath("//textarea")).sendKeys("Cao");
            //Click Enter to send message
            driver.findElement(By.xpath("//textarea")).sendKeys(Keys.ENTER);
        }
    }
}