package finalTask.MyStoreBuyTheProductPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStoreHomePage {

    private static WebDriver driver;

    @FindBy(id = "category-3")
    WebElement clothesButton;


    public MyStoreHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clothesPage () {
        clothesButton.click();

    }

}



