package finalTask.MyStoreAddressPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MyStoreAddressPage {


    private static WebDriver driver;

    @FindBy(xpath = "//div[2]/a/span")
    WebElement createNewAddressButton;

    @FindBy(name = "alias")
    WebElement aliasInput;

    @FindBy(name = "address1")
    WebElement addressInput;

    @FindBy(name = "city")
    WebElement cityInput;

    @FindBy(name = "postcode")
    WebElement postCodeInput;

    @FindBy(name = "id_country")
    WebElement countrySelect;

    @FindBy(name = "phone")
    WebElement phoneInput;

    @FindBy(xpath = "//footer/button[@*='submit']")
    WebElement submitAddress;

    @FindBy(xpath = "//div[2]/a[2]/span")
    WebElement delAddress;

    @FindBy(xpath = "//div/article/ul/li")
    WebElement delMessage;

    @FindBy(xpath = "//article[@*='address']")
    List<WebElement> infoAddress;


    public MyStoreAddressPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void createNewAddressPage() {

        createNewAddressButton.click();
    }

    public void setAliasInput(String alias) {
        aliasInput.clear();
        aliasInput.sendKeys((alias));
    }

    public void setAddress(String address) {
        addressInput.clear();
        addressInput.sendKeys(address);
    }

    public void setCity(String city) {
        cityInput.clear();
        cityInput.sendKeys(city);
    }


    public void setPostCode(String postCode) {
        postCodeInput.clear();
        postCodeInput.sendKeys(postCode);
    }


    public void setCountry(String country) {
        Select selectCountry = new Select(countrySelect);
        selectCountry.selectByVisibleText(country);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        WebDriverWait wait = new WebDriverWait(driver,5);
//        wait.until(ExpectedConditions.attributeToBe(countrySelect, "value", country));
    }

    public void setPhone(String phone) {
        phoneInput.clear();
        phoneInput.sendKeys(phone);
    }

    public void submitNewAddress() {

        submitAddress.click();
    }

    public String getAddress() {

        return infoAddress.get(0).getText();
    }


    public void deleteAddress() {

        delAddress.click();
    }


    public String getDelMessage() {

        return delMessage.getText();
    }


}





