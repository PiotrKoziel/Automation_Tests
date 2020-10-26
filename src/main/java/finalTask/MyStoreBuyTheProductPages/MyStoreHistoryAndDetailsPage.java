package finalTask.MyStoreBuyTheProductPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;


public class MyStoreHistoryAndDetailsPage {

    private static WebDriver driver;

    @FindBy(xpath = "/html/body/main/section/div/div/section/section/table/tbody/tr[1]/td[2]")
    WebElement totalPriceStatus;

//    @FindBy(className = " td.text-xs-right")
//    List<WebElement> priceStatus;


    @FindBy(css = "span.label.label-pill.bright")
    WebElement messageStatus;


    public MyStoreHistoryAndDetailsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getMessageStatus() {

        return messageStatus.getText();


    }
    public String getPriceFromStatus() {

        return totalPriceStatus.getText();
    }

}
