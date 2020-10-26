package examples;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
    }
    @Test
    public void testGoogleSearch() {
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.clear();
        searchInput.sendKeys("Testowanie Selenium WebDriver");
        searchInput.submit();
    }
    @After
    public void tearDown() {

        driver.quit();
    }
}