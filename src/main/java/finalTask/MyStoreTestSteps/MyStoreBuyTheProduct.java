package finalTask.MyStoreTestSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import finalTask.MyStoreBuyTheProductPages.*;
import finalTask.MyStoreAddressPages.MyStoreLoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MyStoreBuyTheProduct {
    private static WebDriver driver;
    private static MyStoreHomePage homePage;
    private static MyStoreClothesPage clothesPage;
    private static MyStoreHummingbirdPrintedSweaterPage productPage;
    private static MyStoreCartPage cartPage;
    private static MyStoreOrderPage orderPage;
    private static MyStoreUserPage userPage;
    private static MyStoreHistoryAndDetailsPage historyAndDetailsPage;

    @Given("user logs in to CodersLab shop")
    public void userOpensAppPage() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication");


        MyStoreLoginPage myStoreLoginPage = new MyStoreLoginPage(driver);
        myStoreLoginPage.loginAs("summer@gmail.com", "summer");

    }

    @Given("^user goes to Clothes category$")
    public void userGoesToClothesCategoryPage() {

        homePage = new MyStoreHomePage(driver);
        homePage.clothesPage();
    }

    @Given("^user goes to Hummingbird printed sweater page$")
    public void userGoesToTheProductPage() {
        clothesPage = new MyStoreClothesPage(driver);
        clothesPage.selectTheProduct();
    }

    @And("^user verifies discount rate$")
    public void userVerifiesTheDiscountRate() {
        productPage = new MyStoreHummingbirdPrintedSweaterPage(driver);

        double regPrice = Double.parseDouble(productPage.getRegularPrice());

        double discPrice = Double.parseDouble(productPage.getDiscountPrice());

        double priceDiscount = Math.round((1 - discPrice / regPrice) * 100);

        String discount = Double.toString(priceDiscount).substring(0, 2);

        assert discount.equals(productPage.getProductDiscountRate());
    }


    @And("^user selects the size (.*)$")
    public void userSelectsTheSize(String newSize) {

        productPage.setTheSize(newSize);
    }

    @And("^user sets the quantity (.*)$")
    public void userSetsTheQuantity(String newQuantity) {

        productPage.setTheQuantity(newQuantity);
    }

    @And("^user adds the product to cart$")
    public void userAddsTheProductToCart() {

        productPage.addToCart();
    }

    @Then("^user goes to order page$")
    public void userGoesToCheckout() {
        productPage.proceedToCheckout();

        cartPage = new MyStoreCartPage(driver);
        cartPage.toCheckout();
    }

    @And("^user fills in the address (.*),(.*),(.*)$")
    public void userFillsInTheAddress(String address, String city, String postcode) {

        orderPage = new MyStoreOrderPage(driver);
        orderPage.fillTheAddress(address, city, postcode);
    }

    @And("^user selects the shipping method$")
    public void userSelectsShippingMethod() {

        orderPage.choosePickUpInStore();
    }

    @And("^user selects the payment method$")
    public void userSelectsPaymentMethod() {

        orderPage.choosePaymentMethod();
    }

    @And("^user orders the product with obligation to pay$")
    public void userOrdersTheProduct() {
        orderPage.selectTermOfServiceBox();
        orderPage.selectPaymentConfirmation();
    }

    @And("^user generates screenshot with order confirmation$")
    public void screenShotWithOrderConfirmation() throws Exception {

        orderPage.orderConfirmationScreenShoot(driver, "./screenshot/order.png");
    }

    @Then("^user goes to orders history and details page$")
    public void userGoesToOrdersHistoryAndDetails() {

        orderPage.goToUserHomePage();

        userPage = new MyStoreUserPage(driver);
        userPage.goToOrderHistoryAndDetails();
    }

    @And("^user sees the following order status message (.*)")
    public void userVerifiesOrderStatus(String message) {

        historyAndDetailsPage = new MyStoreHistoryAndDetailsPage(driver);

        System.out.println("Status message: " + historyAndDetailsPage.getMessageStatus());

        assert message.equals(historyAndDetailsPage.getMessageStatus());
        Assert.assertEquals(message, historyAndDetailsPage.getMessageStatus());
    }


    @And("^user compares total prices from status page and order confirmation$")
    public void userComparesTotalPrices() {

        String priceFromStatus = historyAndDetailsPage.getPriceFromStatus();
        System.out.println("Price from status: " + priceFromStatus);

        driver.navigate().back();
        driver.navigate().back();

        String priceFromOrder = orderPage.getPriceFromOrder();
        System.out.println("Price from order: " + orderPage.getPriceFromOrder());

        assert priceFromOrder.equals(priceFromStatus);
    }


    @And("^closes the browser$")
    public void closesTheBrowser() {

        driver.quit();
    }

}


