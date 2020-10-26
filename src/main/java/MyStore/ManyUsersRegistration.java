package MyStore;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ManyUsersRegistration {

    private WebDriver driver;
    private final int numberOfUsersToCreate = 1;

    private String randomFirstName;
    private String randomLastName;
    private String randomEmail;
    private String randomBirthDate;


    private final static String[] socialTitles = {"Mr.", "Mrs."};
    private final static String[] firstNames = {"Piotr", "Jan", "Anna", "Nina"};
    private final static String[] lastNames = {"Nowak", "Per", "Porter", "Bąk"};
    private final static String[] birthdays = {"05/12/1966", "11/02/1999", "11/02/2003"};
    private final static String[] addresses = {"addres1", "addres2", "addres3"};
    private final static String[] zipCodes = {"00-110", "11-221", "12-022", "33-801"};
    private final static String[] cities = {"CityA", "CityB", "CityC", "CityD"};
    private final static String[] phoneNumbers = {"9122444232443", "4444421222", "1111556565"};

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication&back=addresses");
    }

    @Test
    public void registerNewUsers() {
        for (int i = 0; i < numberOfUsersToCreate; i++) {
            openNewUserRegistrationForm();
            fillInRegistrationForm();
            registerNewUser();
            openNewAddressForm();
            fillInNewAddressForm();
            saveAddressChanges();

            driver.findElement(By.xpath("//article[@data-alert='success']"));

            openPersonalInfo();
            verifyPersonalInfo();

            signOut();
        }
    }

    @After
    public void tearDown() {

        driver.quit();
    }

    private void openNewUserRegistrationForm() {

        driver.findElement(By.xpath("//div[@class='no-account']/a")).click();
    }

    private void fillInRegistrationForm() {
        WebElement socialTitle = driver.findElements(By.name("id_gender")).get(getRandomArrayIndex(socialTitles));
        socialTitle.click();

        randomFirstName = getRandomArrayElement(firstNames);
        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.clear();
        firstName.sendKeys(randomFirstName);

        randomLastName = getRandomArrayElement(lastNames);
        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.clear();
        lastName.sendKeys(randomLastName);

        randomEmail = "karol.kowalski" + System.currentTimeMillis() + "@mail.com";
        WebElement email = driver.findElement(By.name("email"));
        email.clear();
        email.sendKeys(randomEmail);


        WebElement password = driver.findElement(By.name("password"));
        password.clear();
        password.sendKeys("Pass123");

        randomBirthDate = getRandomArrayElement(birthdays);
        WebElement birthDate = driver.findElement(By.name("birthday"));
        birthDate.clear();
        birthDate.sendKeys(randomBirthDate);
    }

    private void openNewAddressForm() {
        driver.findElement(By.xpath("//a[@title='Addresses']")).click();
        driver.findElement(By.xpath("//span[text()='Create new address']")).click();
    }

    private void openPersonalInfo() {

        driver.findElement(By.xpath("//a[@title='Personal info']")).click();
    }

    private void registerNewUser() {

        driver.findElement(By.name("birthday")).submit();
    }

    private void fillInNewAddressForm() {
        WebElement address = driver.findElement(By.name("address1"));
        address.clear();
        address.sendKeys(getRandomArrayElement(addresses));

        WebElement zipCode = driver.findElement(By.name("postcode"));
        zipCode.clear();
        zipCode.sendKeys(getRandomArrayElement(zipCodes));

        WebElement city = driver.findElement(By.name("city"));
        city.clear();
        city.sendKeys(getRandomArrayElement(cities));

        WebElement phone = driver.findElement(By.name("phone"));
        phone.clear();
        phone.sendKeys(getRandomArrayElement(phoneNumbers));
    }
    private void saveAddressChanges() {

        driver.findElement(By.name("phone")).submit();
    }

    private void signOut() {

        driver.findElement(By.xpath("//a[contains(@class,'logout')]")).click();
    }

    public void verifyPersonalInfo() {
        String actualFirstName = driver.findElement(By.name("firstname")).getAttribute("value");
        Assert.assertEquals(actualFirstName, randomFirstName);

        String actualLastName = driver.findElement(By.name("lastname")).getAttribute("value");
        Assert.assertEquals(actualLastName, randomLastName);

        String actualEmail = driver.findElement(By.name("email")).getAttribute("value");
        Assert.assertEquals(actualEmail, randomEmail);

        String actualBirthDate =  driver.findElement(By.name("birthday")).getAttribute("value");
        Assert.assertEquals(actualBirthDate, randomBirthDate);
    }



    private int getRandomArrayIndex(String[] stringArray) {

        return new Random().nextInt(stringArray.length);
    }

    private String getRandomArrayElement(String[] stringArray) {
        Random random = new Random();
        int randomIndex = random.nextInt(stringArray.length);
        return stringArray[randomIndex];
    }

}
