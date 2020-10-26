package finalTask.MyStoreAddressPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStoreLoginPage {

    private static WebDriver driver;

    @FindBy(name = "email")
    WebElement userEmailInput;
    @FindBy(name = "password")
    WebElement passwordInput;
    @FindBy(id = "submit-login")
    WebElement signInButton;

    public MyStoreLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void loginAs(String userId, String password) {
        userEmailInput.clear();
        userEmailInput.sendKeys(userId);

        passwordInput.clear();
        passwordInput.sendKeys(password);

        signInButton.click();
    }

}
