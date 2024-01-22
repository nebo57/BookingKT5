package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\NebojsaMilovic\\Desktop\\KT's QA Automation\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://www.automationpractice.pl/index.php");

//        driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Batistuta");
//        driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).click();
//       Thread.sleep(5000);
//        driver.close();

        //Click on contact us button link
        driver.findElement(By.cssSelector("#contact-link > a")).click();

        //Select value
        Select select = new Select(driver.findElement(By.cssSelector("#id_contact")));
        select.selectByVisibleText("Webmaster");
//        select.selectByIndex(2);
        Thread.sleep(3000);

        //Enter email address
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("test@test.zcom");
        Thread.sleep(2000);

        //Enter order
        driver.findElement(By.cssSelector("#id_order")).sendKeys("1314848");
        Thread.sleep(2000);

        //Upload file-a
        driver.findElement(By.cssSelector("#fileUpload")).sendKeys("C:\\Users\\NebojsaMilovic\\Desktop\\Post Scriptum.pdf");
        Thread.sleep(2000);

        //Enter message
        driver.findElement(By.xpath("//*[@id=\"message\"]")).sendKeys("Poruka");
        Thread.sleep(2000);

        //Text clear
//        driver.findElement(By.xpath("//*[@id=\"message\"]")).clear();
//        Thread.sleep(2000);

        //Click send
        driver.findElement(By.cssSelector("#submitMessage")).click();


        driver.quit();
    }
}
