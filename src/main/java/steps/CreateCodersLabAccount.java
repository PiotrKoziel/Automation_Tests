package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

public class CreateCodersLabAccount {
    private WebDriver driver;


    @Given("an open browser with coderslab web site")
        public void openCodersLabPage() {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.manage().window().maximize();

            driver.get("https://qloapps.coderslab.pl/");
        }

    @When("I go to sign in page")
        public void goToSignPage() {
            WebElement signInButton = driver.findElement(By.cssSelector("a[class*='login']"));
            signInButton.click();
        }

    @When("I type the following email address (.*) and create account")
        public void enterEmailAddress(String emailAddress){
            WebElement emailAddressInput = driver.findElement(By.id("email_create"));
            emailAddressInput.sendKeys(System.currentTimeMillis()+emailAddress);

            WebElement submitButton = driver.findElement(By.id("SubmitCreate"));
            submitButton.click();
        }

    @When("I choose title")
        public void chooseTitle(){
            WebElement titleButton = driver.findElement(By.id("id_gender1"));
            titleButton.click();
        }

    @When("I type first name (.*) and last name (.*)")
        public void typeFullName (String Firstname, String LastName) {
            WebElement firstNameInput = driver.findElement(By.id("customer_firstname"));
            firstNameInput.sendKeys(Firstname);

            WebElement lastNameInput = driver.findElement(By.id("customer_lastname"));
            lastNameInput.sendKeys(LastName);
        }

    @And("I confirm email address")
        public void confirmEmail() {
            WebElement emailAddressInput = driver.findElement(By.id("email"));
            emailAddressInput.click();
        }

    @And("I type following password (.*)")
        public void setPassword (String password) {
            WebElement passwordInput = driver.findElement(By.id("passwd"));
            passwordInput.sendKeys(password);
        }

    @And("I select day of birth")
        public void setDayOfBirth(){
            WebElement dayInput = driver.findElement(By.name("days"));
            Select selectDay = new Select(dayInput);
            selectDay.selectByIndex(6);
        }

    @And("I select month of birth")
        public void setMonthOfBirth(){
            WebElement monthInput = driver.findElement(By.id("months"));
            Select selectMonth = new Select(monthInput);
            selectMonth.selectByIndex(5);
        }

    @And("I select year of birth")
        public void setYearOfBirth(){
            WebElement yearInput = driver.findElement(By.id("years"));
            Select selectYear = new Select(yearInput);
            selectYear.selectByValue("1988");
        }

    @And("I have created new account")
        public void newAccountCreated (){
            WebElement registerButton = driver.findElement(By.id("submitAccount"));
            registerButton.click();
        }

    @Then("New user is registered and I see the following (.*)")
        public void confirmRemark(String expText) {
            WebElement success = driver.findElement(By.cssSelector("#center_column > p.alert.alert-success"));
            assert success.getText().equals(expText);
        }

    @And("close the browser")
        public void closeTheBrowser () {

        driver.quit();
        }

}

