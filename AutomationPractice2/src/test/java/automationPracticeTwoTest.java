import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class automationPracticeTwoTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


//    @Test
//    public void sauceDemo() {
//            driver.get("https://www.saucedemo.com/v1/");
//        driver.findElement(By.id("user-name")).sendKeys("standard_user");
//        driver.findElement(By.id("password")).sendKeys("secret_sauce");
//        driver.findElement(By.cssSelector("#login-button")).click();
//
//        Assert.assertEquals(driver.findElement(By.cssSelector(".product_label")).getText(), "Products");
//        Assert.assertEquals(driver.getTitle(), "Swag Labs");
//        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/v1/inventory.html");
//    }

//    @Test //Domaci Zadatak 1
//    public void loginWithLockedOutUser() {
//        driver.get("https://www.saucedemo.com/v1/");
//        driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
//        driver.findElement(By.id("password")).sendKeys("secret_sauce");
//        driver.findElement(By.cssSelector("#login-button")).click();
//
//        // Assert for error message when a user is locked out
//        String errorMessage = driver.findElement(By.cssSelector("#login_button_container > div > form > h3")).getText();
//        Assert.assertEquals(errorMessage, "Epic sadface: Sorry, this user has been locked out.");
//    }

//    @Test //Domaci Zadatak 2
//    public void loginWithMisspelledUsername() {
//        driver.get("https://www.saucedemo.com/v1/");
//        driver.findElement(By.id("user-name")).sendKeys("sdandart_user");
//        driver.findElement(By.id("password")).sendKeys("secret_sauce");
//        driver.findElement(By.cssSelector("#login-button")).click();
//
//        // Assert for error message when a misspelled username is entered
//        String errorMessage = driver.findElement(By.cssSelector("#login_button_container > div > form > h3")).getText();
//        Assert.assertEquals(errorMessage, "Epic sadface: Username and password do not match any user in this service");
//    }


//    @Test
//    public void buyProduct() throws InterruptedException {
//        driver.get("https://www.saucedemo.com/v1/");
//
//        String item1 = "Sauce Labs Bolt T-Shirt";
//        String item2 = "Sauce Labs Bike Light";
//
//        driver.findElement(By.id("user-name")).sendKeys("standard_user");
//        driver.findElement(By.id("password")).sendKeys("secret_sauce");
//        driver.findElement(By.cssSelector("#login-button")).click();
//
////        driver.findElements(By.cssSelector(".btn_primary.btn_inventory")).get(2).click();
////        driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[3]/div[3]/button")).click();
//        driver.findElement(By.xpath("//div[text()='"+ item1 +"']/../../../div[3]/button")).click();
////        driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[4]/div[3]/button")).click();
//        driver.findElement(By.xpath("//div[text()='"+ item2 +"']/../../../div[3]/button")).click();
//
//        String item1Price = driver.findElement(By.xpath("//div[text()='"+ item1 +"']/../../../div[3]/div")).getText();
//        String item2Price = driver.findElement(By.xpath("//div[text()='"+ item2 +"']/../../../div[3]/div")).getText();
//        String item1Name = driver.findElement(By.xpath("//div[text()='"+ item1 +"']")).getText();
//        String item2Name = driver.findElement(By.xpath("//div[text()='"+ item2 +"']")).getText();
//        String item1Description = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[3]/div[2]/div")).getText(); //Domaci Zadatak 3
//        String item2Description = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[2]/div")).getText(); //Domaci Zadatak 3
//
//        driver.findElement(By.cssSelector("#shopping_cart_container")).click();
//
//        String item1CartPrice = driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[2]/div[2]/div")).getText();
//        String item2CartPrice = driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[4]/div[2]/div[2]/div")).getText();
//        String item1CartName = driver.findElement(By.xpath("//*[@id=\"item_1_title_link\"]/div")).getText();
//        String item2CartName = driver.findElement(By.xpath("//*[@id=\"item_0_title_link\"]/div")).getText();
//        String expectedItem1Description = "Get your testing superhero on with the Sauce Labs bolt T-shirt. From American Apparel, 100% ringspun combed cotton, heather gray with red bolt."; //Domaci Zadatak 3
//        String expectedItem2Description = "A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included."; //Domaci Zadatak 3
//
//        Assert.assertEquals(item1Price, "$" + item1CartPrice);
//        Assert.assertEquals(item2Price, "$" + item2CartPrice);
//        Assert.assertEquals(item1Name, item1CartName);
//        Assert.assertEquals(item2Name, item2CartName);
//        Assert.assertEquals(item1Description, expectedItem1Description); //Domaci Zadatak 3
//        Assert.assertEquals(item2Description, expectedItem2Description); //Domaci Zadatak 3
//
//        Assert.assertEquals(driver.findElement(By.id("item_1_title_link")).getText(), item1);
//        Assert.assertEquals(driver.findElement(By.id("item_0_title_link")).getText(), item2);
//
//        driver.findElement(By.cssSelector("#cart_contents_container > div > div.cart_footer > a.btn_action.checkout_button")).click();
//
//        driver.findElement(By.id("first-name")).sendKeys("Daniel");
//        driver.findElement(By.id("last-name")).sendKeys("Deffoe");
//        driver.findElement(By.id("postal-code")).sendKeys("12345");
//
//        driver.findElement(By.cssSelector("#checkout_info_container > div > form > div.checkout_buttons > input")).click();
//
//        String item1CartPriceCheckout = driver.findElement(By.cssSelector("#checkout_summary_container > div > div.cart_list > div:nth-child(3) > div.cart_item_label > div.inventory_item_price")).getText();
//        String item2CartPriceCheckout = driver.findElement(By.cssSelector("#checkout_summary_container > div > div.cart_list > div:nth-child(4) > div.cart_item_label > div.inventory_item_price")).getText();
//        String item1CartNameCheckout = driver.findElement(By.xpath("//*[@id=\"item_1_title_link\"]/div")).getText();
//        String item2CartNameCheckout = driver.findElement(By.xpath("//*[@id=\"item_0_title_link\"]/div")).getText();
//
//        Assert.assertEquals(item1Price, item1CartPriceCheckout);
//        Assert.assertEquals(item2Price, item2CartPriceCheckout);
//        Assert.assertEquals(item1Name, item1CartNameCheckout);
//        Assert.assertEquals(item2Name, item2CartNameCheckout);
//
//        String itemTotalPrice = driver.findElement(By.cssSelector(".summary_subtotal_label")).getText().replace("Item total: $", "");
//        double itemTotalPriceCalc = Double.parseDouble(item1Price.replace("$","")) + Double.parseDouble(item2Price.replace("$", ""));
//
//        Assert.assertEquals(Double.parseDouble(itemTotalPrice),itemTotalPriceCalc);
//
//        driver.findElement(By.xpath("//div[@class='summary_info']/div[@class='cart_footer']/a[@class='btn_action cart_button']")).click();
//
//        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/v1/checkout-complete.html");
//
//        Thread.sleep(2000);
//    }

//    @Test
//    public void hoverExample() {
//        driver.get("https://www.tehnomanija.rs/");
//
//
//        Actions actions = new Actions(driver);
//        actions
//                .moveToElement(driver.findElement(By.cssSelector("#ammenu-header-container > div.headerWrapper > div > div > div > div > ul.header_custom_links > li:nth-child(4) > a")))
//                .moveToElement(driver.findElement(By.xpath("//*[@id=\"ammenu-header-container\"]/div[1]/div/div/div/div/ul[1]/li[4]/ul/div[1]/ul[1]/li[2]/a")))
//                .click()
//                .build()
//                .perform();
//
//    }

//    @Test
//    public void slideExample(){
//        driver.get("https://jqueryui.com/slider/");
//
//        driver.switchTo().frame(driver.findElement(By.cssSelector("[class=\"demo-frame\"]")));
//
//        Actions actions = new Actions(driver);
//        actions
//                .dragAndDropBy(driver.findElement(By.cssSelector(".ui-slider-handle.ui-corner-all.ui-state-default")), 50, 0)
//                .build()
//                .perform();
//            driver.switchTo().parentFrame();
//        driver.switchTo().defaultContent();
//    }


//    @Test
//    public void dragAndDropExample() {
//        driver.get("https://demo.guru99.com/test/drag_drop.html");
//
//        Actions actions2 = new Actions(driver);
//        actions2.dragAndDrop(driver.findElement(By.xpath("//a[contains(text(),'BANK')]")), driver.findElement(By.id("bank")))
//                .build()
//                .perform();
//
//    }
}

