package factory;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Pagefactory {

	private WebDriver driver;
	private Actions actions;
	private WebDriverWait wait;
	
	@FindBy(xpath = "(//*[@class='hidden-xs hidden-sm hidden-md'])[1]")
	private WebElement costcoNextTab;
	
	@FindBy(xpath = "(//*[@class='hidden-xs hidden-sm hidden-md'])[2]")
	private WebElement whileSuppliesLastTab;
	
	@FindBy(xpath = "(//*[@class='hidden-xs hidden-sm hidden-md hidden-lg'])[1]")
	private WebElement onlineOnlyTab;
	
	@FindBy(xpath = "(//*[@class='hidden-xs hidden-sm hidden-md hidden-lg'])[2]")
	private WebElement treasureHuntTab;
	
	@FindBy(xpath = "(//*[@class='hidden-xs hidden-sm hidden-md hidden-lg'])[3]")
	private WebElement whatsNewTab;
	
	@FindBy(xpath = "(//*[@class='hidden-xs hidden-sm hidden-md hidden-lg'])[4]")
	private WebElement newLowerPricesTab;
	
	@FindBy(id = "email-signup-link")
	private WebElement getEmailOffersTab;
	
	@FindBy(id = "customer-service-link")
	private WebElement customerServiceTab;
	
	@FindBy(id = "country-select")
	private WebElement countryDropTab;
	
	@FindBy(id = "navigation-dropdown")
	private WebElement shopTab;
	
	@FindBy(id = "Home_Ancillary_0")
	private WebElement groceryTab;
	
	@FindBy(id = "Home_Ancillary_1")
	private WebElement sameDayTab;
	
	@FindBy(id = "Home_Ancillary_2")
	private WebElement dealsTab;
	
	@FindBy(id = "Home_Ancillary_3")
	private WebElement businessDeliveryTab;
	
	@FindBy(id = "Home_Ancillary_4")
	private WebElement opticalTab;
	
	@FindBy(id = "Home_Ancillary_5")
	private WebElement pharmacyTab;
	
	@FindBy(id = "Home_Ancillary_6")
	private WebElement servicesTab;
	
	@FindBy(xpath = "(//*[@class='nav-flyout'])[5]")
	private WebElement photoTab;
	
	@FindBy(id = "Home_Ancillary_8")
	private WebElement travelTab;
	
	@FindBy(id = "Home_Ancillary_9")
	private WebElement membershipTab;
	
	@FindBy(xpath = "(//*[@class='nav-flyout'])[8]")
	private WebElement locationsTab;
	
	@FindBy(id = "search-field")
	private WebElement searchBox;
	
	@FindBy(xpath = "(//*[@type='button'])[1]")
	private WebElement searchButton;
	
	public Pagefactory(WebDriver driver) {
		this.driver = driver;
		this.actions = new Actions(driver);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		PageFactory.initElements(driver, this);
	}
	
	public void Click() throws InterruptedException {
		Thread.sleep(1000);
		costcoNextTab.click();
		Thread.sleep(1000);
		driver.get("https://www.costco.com/");
		Thread.sleep(1000);
		whileSuppliesLastTab.click();
		Thread.sleep(1000);
		onlineOnlyTab.click();
		Thread.sleep(1000);
		treasureHuntTab.click();
		Thread.sleep(1000);
		whatsNewTab.click();
		Thread.sleep(1000);
		newLowerPricesTab.click();
		Thread.sleep(1000);
		getEmailOffersTab.click();
		Thread.sleep(1000);
		customerServiceTab.click();
		Thread.sleep(1000);
		driver.get("https://www.costco.com/");
		Thread.sleep(1000);
	}
	
	public void Hover() throws InterruptedException {
		actions.moveToElement(countryDropTab).perform();
		Thread.sleep(1000);
		countryDropTab.click();
		Thread.sleep(1000);
		driver.get("https://www.costco.com/CheckoutCartDisplayView");
		wait.until(ExpectedConditions.visibilityOf(shopTab));
		Thread.sleep(1000);
		actions.moveToElement(shopTab).perform();
		Thread.sleep(1000);
		actions.moveToElement(groceryTab).perform();
		Thread.sleep(1000);
		actions.moveToElement(sameDayTab).perform();
		Thread.sleep(1000);
		actions.moveToElement(dealsTab).perform();
		Thread.sleep(1000);
		actions.moveToElement(businessDeliveryTab).perform();
		Thread.sleep(1000);
		actions.moveToElement(opticalTab).perform();
		Thread.sleep(1000);
		actions.moveToElement(pharmacyTab).perform();
		Thread.sleep(1000);
		actions.moveToElement(servicesTab).perform();
		Thread.sleep(1000);
		photoTab.click();
		Thread.sleep(1000);
		actions.moveToElement(travelTab).perform();
		Thread.sleep(1000);
		actions.moveToElement(membershipTab).perform();
		Thread.sleep(1000);
		locationsTab.click();
		Thread.sleep(1000);
	}
	
	public void Search(String search) throws InterruptedException {
		searchBox.sendKeys(search);
		Thread.sleep(1000);
		searchButton.click();
		Thread.sleep(1000);
		actions.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		actions.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		actions.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		actions.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		actions.sendKeys(Keys.PAGE_DOWN).perform();
	}
	
	public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
	
}
