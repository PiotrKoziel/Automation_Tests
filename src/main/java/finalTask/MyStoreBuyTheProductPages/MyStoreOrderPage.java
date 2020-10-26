package finalTask.MyStoreBuyTheProductPages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.File;


public class MyStoreOrderPage {


    private static WebDriver driver;


    @FindBy(name = "address1")
    WebElement addressIn;

    @FindBy(name = "city")
    WebElement cityIn;

    @FindBy(name = "postcode")
    WebElement postCodeIn;

    @FindBy(name = "id_country")
    WebElement countryIn;

    @FindBy(name = "confirm-addresses")
    WebElement confirmAddress;

    @FindBy(id = "delivery_option_1")
    WebElement pickUpInStoreRadio;

    @FindBy(xpath = "//*[@id=\"checkout-payment-step\"]")
    WebElement forPayment;

    @FindBy(id = "payment-option-1")
    WebElement payByCheckRadio;

    @FindBy(id = "conditions_to_approve[terms-and-conditions]")
    WebElement termsOfServiceCheckbox;

    @FindBy(css = "div.ps-shown-by-js > button")
    WebElement paymentConfirmationButton;

    @FindBy(xpath = "//div/a[2]")
    WebElement loginUserLink;

    @FindBy(css = "#content-hook_payment_return > div > div > div > p > span > strong")
    WebElement totalPriceOrder;


    public MyStoreOrderPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillTheAddress(String address, String city, String postcode) {
        addressIn.clear();
        addressIn.sendKeys(address);
        cityIn.clear();
        cityIn.sendKeys(city);
        postCodeIn.clear();
        postCodeIn.sendKeys(postcode);

        Select selectUK = new Select(countryIn);
        selectUK.selectByValue("17");

        confirmAddress.click();

    }

    public void choosePickUpInStore() {
        if (!pickUpInStoreRadio.isSelected()) {
            pickUpInStoreRadio.click();
        }
    }

    public void choosePaymentMethod() {
        forPayment.click();

        if (!payByCheckRadio.isSelected()) {
            payByCheckRadio.click();
        }
    }

    public void selectTermOfServiceBox() {
        if (!termsOfServiceCheckbox.isSelected()) {
            termsOfServiceCheckbox.click();
        }
    }

    public void selectPaymentConfirmation() {
        paymentConfirmationButton.click();
    }

    public void orderConfirmationScreenShoot(WebDriver driver, String fileName) throws Exception {

        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        File destFile = new File(fileName);

        FileUtils.copyFile(file, destFile);
    }

    public String getPriceFromOrder() {

        return totalPriceOrder.getText();
    }


    public void goToUserHomePage() {

        loginUserLink.click();
    }


}