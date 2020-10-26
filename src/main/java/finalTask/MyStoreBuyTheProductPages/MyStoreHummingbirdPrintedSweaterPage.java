package finalTask.MyStoreBuyTheProductPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MyStoreHummingbirdPrintedSweaterPage {

    private static WebDriver driver;

    @FindBy(name = "group[1]")
    WebElement sizeBox;
    @FindBy(id = "quantity_wanted")
    WebElement quantityBox;
    @FindBy(css = "section form div [type='submit']")
    WebElement addToCartButton;
    @FindBy(xpath = "//*[@id='blockcart-modal']/div//a")
    WebElement proceedToCheckoutButton;

    @FindBy(css = ".discount.discount-percentage")
    WebElement productDiscountRate;

    @FindBy(css = ".regular-price")
    WebElement regularPrice;

    @FindBy(css = ".current-price span")
    WebElement discountPrice;


    public MyStoreHummingbirdPrintedSweaterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setTheSize(String setSize) {
//        Select select = new Select(size);
//        select.selectByVisibleText("M");
        sizeBox.sendKeys(setSize);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void setTheQuantity(String setQuantity) {
        quantityBox.click();
        quantityBox.clear();

        quantityBox.sendKeys(setQuantity);
    }

    public void addToCart() {

        addToCartButton.click();
    }

    public void proceedToCheckout() {
        proceedToCheckoutButton.click();

    }

    public String getProductDiscountRate() {

        return productDiscountRate.getText().substring(5, 7);
    }

    public String getRegularPrice() {

        return regularPrice.getText().substring(1);
    }


    public String getDiscountPrice() {

        return discountPrice.getText().substring(1);
    }

}
