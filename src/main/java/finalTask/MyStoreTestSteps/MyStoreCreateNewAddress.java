package finalTask.MyStoreTestSteps;


import finalTask.MyStoreAddressPages.MyStoreAddressPage;
import finalTask.MyStoreAddressPages.MyStoreLoginPage;
import finalTask.MyStoreAddressPages.MyStoreUserPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class MyStoreCreateNewAddress {

    private static WebDriver driver;
    private static MyStoreUserPage userPage;
    private static MyStoreAddressPage addressPage;


    @Given("^user is logged in to CodersLab shop$")
    public void userOpensAppPage() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication");

        MyStoreLoginPage myStoreLoginPage = new MyStoreLoginPage(driver);
        myStoreLoginPage.loginAs("summer@gmail.com", "summer");
    }

    @When("^user goes to Your Address page$")
    public void userGoesToAddressInfoPage() {

        userPage = new MyStoreUserPage(driver);
        userPage.openAddressPage();
    }

    @And("^user adds new address$")
    public void userAddsNewAddress() {
        addressPage = new MyStoreAddressPage(driver);
        addressPage.createNewAddressPage();

    }

    @And("^user sets the following alias (.*)$")
    public void setUserAlias(String newAlias) {
        addressPage.setAliasInput(newAlias);

    }

    @And("^user sets the following address (.*)$")
    public void setsUserAddress(String newAddress) {

        addressPage.setAddress(newAddress);
    }

    @And("^user sets the following city (.*)$")
    public void setUserCity(String newCity) {

        addressPage.setCity(newCity);
    }

    @And("^user sets the following postal code (.*)$")
    public void setUserPostCode(String newPostCode) {

        addressPage.setPostCode(newPostCode);
    }

    @And("^user selects the following country (.*)$")
    public void setUserCountry(String newCountry) {

        addressPage.setCountry(newCountry);
    }

    @And("^user sets the following phone (.*)$")
    public void setUserPhone(String newPhone) {

        addressPage.setPhone(newPhone);
    }

    @And("^user submits form$")
    public void userSubmitsAddress() {

        addressPage.submitNewAddress();
    }

    @And("^filled information in address form is correct (.*), (.*), (.*), (.*), (.*), (.*)$")
    public void informationIsCorrect(String alias, String address, String city, String postalCode, String country,
                                     String phone) {

        assert addressPage.getAddress().contains(alias);
        assert addressPage.getAddress().contains(address);
        assert addressPage.getAddress().contains(city);
        assert addressPage.getAddress().contains(postalCode);
        assert addressPage.getAddress().contains(country);
        assert addressPage.getAddress().contains(phone);
    }


    @When("^user deletes the address$")
    public void userDeletesAddress() {

        addressPage.deleteAddress();
    }

    @Then("^user sees the following message (.*)$")
    public void deleteSuccess(String expMessage) {

        Assert.assertEquals(expMessage, addressPage.getDelMessage());
    }


    @And("^user closes the browser$")
    public void userClosesBrowser() {

        driver.quit();
    }

}

