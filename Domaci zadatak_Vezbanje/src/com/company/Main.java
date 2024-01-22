package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.NoSuchElementException;

public class Main {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\NebojsaMilovic\\Desktop\\KT's QA Automation\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Initializing WebDriverWait with a timeout of 10 seconds
        WebDriverWait wait = new WebDriverWait(driver, 10);

        boolean testPassed = false;

        //Try statement allows you to define a block of code to be tested for errors while it is being executed
        try {
            driver.manage().window().maximize();
            driver.get("http://www.automationpractice.pl/index.php");

            //Wait for the "login" element to be clickable
            wait.until(ExpectedConditions.elementToBeClickable(By.className("login")));
            driver.findElement(By.className("login")).click();

            //Wait for the email input field to be visible
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#email_create")));
            driver.findElement(By.cssSelector("#email_create")).sendKeys("dani3@test.zcom");

            //Click on Create button
            driver.findElement(By.id("SubmitCreate")).click();

            //Select gender of a customer
            driver.findElement(By.id("id_gender1")).click();
            //driver.findElement(By.xpath("//*[@id=\"id_gender1\"]")).click();

            //Enter the name and surname of a customer
            driver.findElement(By.cssSelector("#customer_firstname")).sendKeys("Daniel");
            driver.findElement(By.cssSelector("#customer_lastname")).sendKeys("Deffoe");

            //Clear the email input field and input a new email address
            driver.findElement(By.id("email")).clear();
            driver.findElement(By.id("email")).sendKeys("deffoe12@test.zcom");

            driver.findElement(By.id("passwd")).sendKeys("PaSsw0rd");

            //Select values for DOB from dropdowns
            Select selectD = new Select(driver.findElement(By.id("days")));
            selectD.selectByVisibleText("18");

            Select selectM = new Select(driver.findElement(By.id("months")));
            selectM.selectByVisibleText("09");

            Select selectY = new Select(driver.findElement(By.id("years")));
            selectY.selectByVisibleText("1967");

            //Submit the customer's account
            driver.findElement(By.id("submitAccount")).click();

            //If execution reaches this point without exceptions, set testPassed to true
            testPassed = true;

        } catch (NoSuchElementException e) { //Catch statement allows you to define a block of code to be executed, if an error occurs in the try block
            System.out.println("Element not found: " + e.getMessage()); //Show element not found exception
        } catch (TimeoutException e) {
            System.out.println("Timeout occurred: " + e.getMessage()); //Show the timeout exception
        } finally { //Finally statement lets you execute code, after try/catch, regardless of the result
            if (testPassed) {
                System.out.println("Test executed successfully!"); //Test success message
            } else {
                System.out.println("Test failed!"); //Test failure message
            }


            //Ensures the WebDriver session is closed
            driver.quit();
        }
    }
}

