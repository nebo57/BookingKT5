package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\NebojsaMilovic\\Desktop\\KT's QA Automation\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://www.automationpractice.pl/index.php");

        //Click on Login button
        driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a")).click();
        Thread.sleep(2000);

        //Enter email address
        driver.findElement(By.cssSelector("#email_create")).sendKeys("test5@test.zcom");
        Thread.sleep(2000);

        //Click on Create button
        driver.findElement(By.id("SubmitCreate")).click();
        Thread.sleep(2000);

        //Select gender of a customer
        driver.findElement(By.id("id_gender1")).click();
        Thread.sleep(2000);

        //Enter the name of a customer
        driver.findElement(By.cssSelector("#customer_firstname")).sendKeys("Rocky");
        Thread.sleep(2000);

        //Enter the surname of a customer
        driver.findElement(By.cssSelector("#customer_lastname")).sendKeys("Marciani");
        Thread.sleep(2000);

        //Clear the email input field and input a new email address
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("test3@testig.zcom");
        Thread.sleep(2000);

        //Enter password
        driver.findElement(By.id("passwd")).sendKeys("Pass1word");
        Thread.sleep(2000);

        //Select values for DOB from dropdowns
        Select selectD = new Select(driver.findElement(By.id("days")));
        selectD.selectByIndex(14);
        Thread.sleep(2000);
        Select selectM = new Select(driver.findElement(By.id("months")));
        selectM.selectByIndex(6);
        Thread.sleep(2000);
        Select selectY = new Select(driver.findElement(By.id("years")));
        selectY.selectByValue("1977");
        Thread.sleep(2000);

        //Submit the customer's account
        driver.findElement(By.id("submitAccount")).click();
        Thread.sleep(10000);

        driver.quit();
    }
}

