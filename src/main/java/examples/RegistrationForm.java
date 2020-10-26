package examples;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RegistrationForm {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
    }

    @Test
    public void fillInUserForm() {
        WebElement firstNameInput = driver.findElement(By.id("first-name"));
        if (firstNameInput.isEnabled()) {
            System.out.println("id :" + firstNameInput.getAttribute("id"));
            firstNameInput.clear();
            firstNameInput.sendKeys("Karol");
        } else {
            Assert.fail();
        }

        WebElement lastNameInput = driver.findElement(By.name("lastName"));
        if (lastNameInput.isDisplayed()) {
            System.out.println("name: " + lastNameInput.getAttribute("name"));
            lastNameInput.clear();
            lastNameInput.sendKeys("Kowalski");
        } else {
            Assert.fail();
        }

        // WebElement genderButton = driver.findElement(By.xpath("//label[text() = 'Male']/input"));

        List<WebElement> genderButton = driver.findElements(By.name("gender"));
        if (!genderButton.get(0).isSelected()) {
            System.out.println("name: " + genderButton.get(0).getAttribute("name"));
            genderButton.get(0).click();
        } else {
            Assert.fail();
        }

        WebElement dateInput = driver.findElement(By.id("dob"));
        if (dateInput.isDisplayed()) {
            System.out.println("id : " + dateInput.getAttribute("id"));
            dateInput.clear();
            dateInput.sendKeys("09/23/2020" + Keys.ESCAPE);

        } else {
            Assert.fail();
        }

        WebElement addressInput = driver.findElement(By.name("address"));

        if (addressInput.isEnabled()) {
            System.out.println("name: " + addressInput.getAttribute("name"));
            addressInput.clear();
            addressInput.sendKeys("Prosta 51");

        } else {
            Assert.fail();
        }

        WebElement emailInput = driver.findElement(By.id("email"));

        if (emailInput.isDisplayed()) {
            System.out.println("id: " + emailInput.getAttribute("id"));
            emailInput.clear();
            emailInput.sendKeys("karol.kowalski@mailinator.com");

        } else {
            Assert.fail();
        }

        WebElement passInput = driver.findElement(By.id("password"));
        if (passInput.isEnabled()) {
            System.out.println("id: " + passInput.getAttribute("id"));
            passInput.clear();
            passInput.sendKeys("Pass123");
        } else {
            Assert.fail();
        }

        WebElement companyInput = driver.findElement(By.id("company"));
        if (companyInput.isEnabled()) {
            System.out.println("id: " + companyInput.getAttribute("id"));
            companyInput.clear();
            companyInput.sendKeys("Coders Lab");
        } else {
            Assert.fail();
        }

        Select roleList = new Select(driver.findElement(By.id("role")));
        if (roleList.getFirstSelectedOption().isSelected()) {
            roleList.selectByIndex(2);
            System.out.println("id: " + roleList.getFirstSelectedOption().getAttribute("role"));

        } else {
            Assert.fail();
        }

        List<WebElement> expList = driver.findElements(By.cssSelector("#expectation > option"));
        if (!expList.get(3).isSelected()) {
            expList.get(3).click();
        }


        //        for (WebElement expItem : expList) {
        //        expList - array to loop through, every element of array assigned to expItem
        //            if ("Challenging".equals(selectExp.getText())) {
        //                selectExp.click();


        else {
            Assert.fail();
        }

        List<WebElement> waysOfDevOpt = driver.findElements(By.cssSelector("input[type='checkbox']"));
        if (!waysOfDevOpt.get(2).isSelected() && !waysOfDevOpt.get(4).isSelected()) {
            System.out.println("cssSelector: " + waysOfDevOpt.get(2).getAttribute("cssSelector"));
            waysOfDevOpt.get(2).click();
            waysOfDevOpt.get(4).click();
        } else {
            Assert.fail();
        }

        WebElement commentInput = driver.findElement(By.id("comment"));
        if (commentInput.isEnabled()) {
            System.out.println("id: " + commentInput.getAttribute("id"));
            commentInput.clear();
            commentInput.sendKeys("To jest mój pierwszy automat testowy");
        } else {
            Assert.fail();
        }

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
    }

    @After
    public void tearDown() {
             driver.quit();
    }

}

