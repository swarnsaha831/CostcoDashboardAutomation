package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utilities.Screenshot;
import basePage.BasePage;
import factory.Pagefactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CostcoDashSteps {

	public static WebDriver driver;
	private Pagefactory costcoDashboard;
	
	@Given("User is directed to the Costco webpage")
	public void user_is_directed_to_the_costco_webpage() {
	    driver = BasePage.getDriver();
	    driver.get("https://www.costco.com/");
	    driver.manage().window().maximize();
	    costcoDashboard = new Pagefactory(driver);
	}

	@Then("User clicks on each tab of the homepage")
	public void user_clicks_on_each_tab_of_the_homepage() throws InterruptedException {
		costcoDashboard.Click();
		costcoDashboard.Hover();
	}
	
	@When("User enters a search")
	public void user_enters_a_search() throws InterruptedException {
	    costcoDashboard.Search(BasePage.search);
	}

	@Then("User is able to see the contents of that search")
	public void user_is_able_to_see_the_contents_of_that_search() throws InterruptedException {
		String expectedUrl = "https://www.costco.com/CatalogSearch?dept=All&keyword=" + BasePage.search.replace(" ", "+");;
        String actualUrl = costcoDashboard.getCurrentUrl();
        try {
            Assert.assertEquals(actualUrl, expectedUrl, "User is not on the expected costco page URL.");
        } catch (AssertionError e) {
            Screenshot.Capture(driver, "Screenshot/Error.png");
            throw e;  // Rethrow to allow Cucumber to handle the failure
        } finally {
		Thread.sleep(3000);
	    driver.quit();
        }
	    
	}
	
}