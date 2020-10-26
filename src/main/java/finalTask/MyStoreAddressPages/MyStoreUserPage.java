package finalTask.MyStoreAddressPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStoreUserPage {

        private static WebDriver driver;

        @FindBy(xpath = "//a[@title='Addresses']")
        WebElement addressButton;


        public MyStoreUserPage(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

        public void openAddressPage() {

            addressButton.click();
        }

}

