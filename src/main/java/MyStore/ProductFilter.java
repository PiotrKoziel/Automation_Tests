package MyStore;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ProductFilter {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://prod-kurs.coderslab.pl/index.php?id_category=6&controller=category");
    }

    @Test
    public void searchProducts() throws InterruptedException {
        choosePriceRangeAndWaitForResults("11-14");
//    Thread.sleep(3000);
        checkFilterResultsByPrice(11, 19);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    private void choosePriceRangeAndWaitForResults(String priceRange) throws InterruptedException {
        WebElement priceRangeCheckbox = driver.findElement(By.cssSelector("input[data-search-url*='" +
                "" + priceRange + "']"));
        priceRangeCheckbox.click();

    }

    private void checkFilterResultsByPrice(double lowRange, double highRange) {
        List<WebElement> priceList = driver.findElements(By.cssSelector("span[class='price']"));

        for (WebElement priceElement : priceList) {
            double price = Double.parseDouble(priceElement.getText().substring(1));

            if (price >= lowRange && price <= highRange) {
                System.out.println("Price " + price + " is in range " + lowRange + "-" + highRange);
            } else {
                Assert.fail("Price " + price + " is NOT in range " + lowRange + "-" + highRange);
            }
        }
    }
}




