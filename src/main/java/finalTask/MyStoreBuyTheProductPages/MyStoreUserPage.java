package finalTask.MyStoreBuyTheProductPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStoreUserPage {

    private static WebDriver driver;

    public MyStoreUserPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "history-link")
    WebElement ordersHistoryAndDetailsButton;

    public void goToOrderHistoryAndDetails() {

        ordersHistoryAndDetailsButton.click();
    }


}

