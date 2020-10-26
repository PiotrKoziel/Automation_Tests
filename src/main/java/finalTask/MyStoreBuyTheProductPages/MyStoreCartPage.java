package finalTask.MyStoreBuyTheProductPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStoreCartPage {


    private static WebDriver driver;

    @FindBy(xpath = "//div/div[2]/div[1]/div[2]/div/a")
    WebElement checkOutButton;


    public MyStoreCartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void toCheckout(){
        checkOutButton.click();


        }




}
