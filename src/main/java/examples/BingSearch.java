package examples;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BingSearch {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.bing.com");
    }

    @Test
    public void testGoogleSearch() {
        WebElement searchElement  = driver.findElement(By.name("q"));
        searchElement.clear();
        searchElement.sendKeys("Mistrzostwa Świata w piłce nożnej 2018");
        searchElement.submit();
    }
    @After
    public void tearDown() {

        driver.quit();
    }
}

