package basePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.*;

public class BasePage {
	
	// TO ADHERE TO ENCAPSULATION PRINCIPLES, DECLARE THE SCANNER AND VARIABL INSIDE THE METHOD INSTEAD
	public static Scanner scanner = new Scanner(System.in);
	public static String browserChoice;
	public static String search;
	
	public static WebDriver getDriver() {
		WebDriver driver = null;
		System.out.println("\nHello, welcome to your QA Testing environment, please enter a broswer.\n"
						 + "Your choices are: 1 for (chrome), 2 for (edge), and 3 for (firefox), please enter as specified:\n");
		do {
		    browserChoice = scanner.nextLine().toLowerCase();
		    if (!browserChoice.equals("1") && !browserChoice.equals("2") && !browserChoice.equals("3")) {
		        System.out.println("Entered browser choice isn't supported or is spelled incorrectly. Please try again:\n");
		    }
		} while (!browserChoice.equals("1") && !browserChoice.equals("2") && !browserChoice.equals("3"));
		System.out.println("\nNext, please enter your desired Costco item search:\n");
		do {
			search = scanner.nextLine();
			if (search.isEmpty() || search.isBlank()) {
				System.out.println("Please enter a valid search:\n");
			}
		} while (search.isEmpty() || search.isBlank());
		System.out.println();
		// CAN ALSO PUT "browser.toLowerCase()" IN SWITCH PARENTHESES
		switch (browserChoice) {
			case "1":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			case "2":
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;
			case "3":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			// DEFAULT CASE IS FOR AN INCORRECT BROWSER CASE
			//default:
				//throw new IllegalArgumentException("Entered browser isn't supported or is spelled incorrectly.");
		}
		return driver;
	}
	
}
