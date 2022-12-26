package Stepdef;

import SauceDemo.SwaglabsDemo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepdefSwaglab {
    SwaglabsDemo test = new SwaglabsDemo();
    @Given("i am an existing user")
    public void iAmAnExistingUser() {
        test.openbrowser();
    }

    @When("i open browser to {string}: www.saucedemo.com")
    public void iOpenBrowserToWwwSaucedemoCom(String url) {
        test.urlPage(url);
    }

    @And("fill correct username as {string} and password as {string}")
    public void fillCorrectUsernameAsAndPasswordAs(String username, String password) {
        test.login(username, password);
    }

    @And("press login button")
    public void pressLoginButton() {
        test.loginSubmit();
    }

    @Then("i see my application dashboard")
    public void iSeeMyApplicationDashboard() {
        
    }

    @Given("Check all the products")
    public void checkAllTheProducts() {
        
    }

    @And("Select the product that you want to order")
    public void selectTheProductThatYouWantToOrder() {
        
    }

    @When("Click on Add to cart")
    public void clickOnAddToCart() {
        test.AddToCart();
    }

    @And("it will add all your products in shopping cart")
    public void itWillAddAllYourProductsInShoppingCart() {

    }

    @Then("Click on shopping cart icon")
    public void clickOnShoppingCartIcon() {
        test.Cart();
    }

    @Given("Add another item")
    public void addAnotherItem() {
        
    }

    @Then("Checkout the product")
    public void checkoutTheProduct() {
        test.CheckOut();
    }

    @And("remove Item from cart")
    public void removeItemFromCart() {
        
    }

    @Given("Enter address information")
    public void enterAddressInformation() {
        test.Information();
    }

    @Then("Click Finish")
    public void clickFinish() {
        test.Overview();
    }

    @Given("goto react button")
    public void gotoReactButton() throws InterruptedException {
        test.BackToHome();
    }

    @Then("click logout")
    public void clickLogout() throws InterruptedException {
        test.Logout();
    }

    @And("Close Browser")
    public void closeBrowser() throws InterruptedException {
        test.Quit();
    }
}
