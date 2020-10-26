package MyStore;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class OrderProduct {

    private WebDriver driver;

    @Before
    public void SetUp() {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication&back=my-account");
    }

    @Test
    public void searchProduct() {
    SignIn("summer@gmail.com", "summer");
    chooseCategoryProduct("Men");

    }

    private void SignIn(String userName, String password){
        driver.findElement(By.name("email")).sendKeys(userName);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.id("submit-login")).click();
    }

    private void chooseCategoryProduct(String category){
        driver.findElement(By.xpath("//li/a[contains(text(), '"+ category +"')]")).click();
    }
    @After
    public void tearDown(){
        //driver.quit();
    }
}
