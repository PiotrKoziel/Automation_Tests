package finalTask.MyStoreBuyTheProductPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStoreClothesPage {


    private static WebDriver driver;

    @FindBy(xpath = "//div[1]/article[2]")
    WebElement productPage;



    public MyStoreClothesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectTheProduct(){
        productPage.click();

    }

}




