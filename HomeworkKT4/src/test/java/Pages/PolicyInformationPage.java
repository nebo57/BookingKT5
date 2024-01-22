package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PolicyInformationPage extends BasePage{

    public PolicyInformationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[text()='Policy Number']/../../../..//input")
    WebElement policyNumberInput;
    @FindBy(xpath = "//div[text()='Term Length']/../../../..//input")
    WebElement termLengthInput;
    @FindBy(xpath = "//span[text()='Save']")
    WebElement saveButton1;
    @FindBy(xpath = "//span[text()='Next']")
    WebElement nextButton;
    @FindBy(xpath = "//div[text()='Premium']/../../../..//input")
    WebElement premiumInput;
    @FindBy(xpath = "//div[text()='Transaction Type']/../../../..//input")
    WebElement  transactionTypeInput;
    @FindBy(xpath = "//div[text()='Effective Date']/../../../..//input")
    WebElement effectiveDateInput;
//    @FindBy(xpath = "//div[text()='Expiration Date']/../../../..//input")
//    WebElement expirationDateInput;
    @FindBy(xpath = "//div[text()='Bodily Injury Amount']/../../../..//input")
    WebElement bodilyInjuryAmountInput;
    @FindBy(xpath = "//div[text()='Bodily Injury Deductible']/../../../..//input")
    WebElement bodilyInjuryDeductibleInput;
    @FindBy(xpath = "//span[text()='Save']")
    WebElement saveButton2;
    @FindBy(xpath = "//span[text()='Driver']")
    WebElement driverButton;

    public void fillPolicyInfoDetails() throws InterruptedException {
        policyNumberInput.clear();
        policyNumberInput.sendKeys("PN12390");
        termLengthInput.clear();
        termLengthInput.sendKeys("12");
        saveButton1.click();
        Thread.sleep(2000);
        nextButton.click();
        premiumInput.clear();
        premiumInput.sendKeys("15,000");
        transactionTypeInput.clear();
        transactionTypeInput.sendKeys("PA-2");
        effectiveDateInput.sendKeys("01/02/2024");
        bodilyInjuryAmountInput.clear();
        bodilyInjuryAmountInput.sendKeys("25,000");
        bodilyInjuryDeductibleInput.clear();
        bodilyInjuryDeductibleInput.sendKeys("1,000");
        saveButton2.click();
        Thread.sleep(2000);
        driverButton.click();
    }
}
