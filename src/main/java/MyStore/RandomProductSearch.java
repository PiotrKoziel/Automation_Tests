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
import java.util.Random;

public class RandomProductSearch {

    private WebDriver driver;
    private static final String[] products = {"HUMMINGBIRD PRINTED T-SHIRT","HUMMINGBIRD PRINTED SWEATER",
            "MOUNTAIN FOX NOTEBOOK","BROWN BEAR NOTEBOOK","HUMMINGBIRD NOTEBOOK",
            "MUG THE BEST IS YET TO COME","MUG THE ADVENTURE BEGINS","MUG TODAY IS A GOOD DAY",
            "MOUNTAIN FOX CUSHION","BROWN BEAR CUSHION","BROWN BEAR CUSHION","HUMMINGBIRD CUSHION",
            "CUSTOMIZABLE MUG","PACK MUG + FRAMED POSTER","THE BEST IS YET TO COME' FRAMED POSTER",
            "THE ADVENTURE BEGINS FRAMED POSTER","TODAY IS A GOOD DAY FRAMED POSTER",
            "MOUNTAIN FOX - VECTOR GRAPHICS","BROWN BEAR - VECTOR GRAPHICS","HUMMINGBIRD - VECTOR GRAPHICS"};

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://prod-kurs.coderslab.pl/index.php");
    }

    @Test
    public void searchRandomProduct() {
        String randomProduct = getRandomArrayElement(products);
        System.out.println("Search product " + randomProduct);

        WebElement element = driver.findElement(By.name("s"));
        element.clear();
        element.sendKeys(randomProduct);
        element.submit();

//        driver.findElements(By.id("products"));
//        List<WebElement> productList = driver.findElements(By.xpath("//div[@class='product-description']"));

//        for(WebElement product : productList) {
//            Assert.assertTrue(product.getText().toLowerCase().contains(randomProduct.toLowerCase()));
//        }

    }
    @After
    public void tearDown() {
        driver.quit();
    }

    private String getRandomArrayElement(String[] stringArray) {
        Random random = new Random();
        int randomIndex = random.nextInt(stringArray.length);

        return stringArray[randomIndex];
    }
}
