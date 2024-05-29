package utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.*;

public class Screenshot {
	
	// TO ADHERE TO ENCAPSULATION PRINCIPLES, DECLARE THE FILE INSIDE THE METHOD BY JUST
	// WRITING "File file" INSTEAD
	public static File file;
	Scanner scanner = new Scanner(System.in);
	
	public static void Capture(WebDriver driver, String filePath) {
		      // COPY FROM IMPORT                      // COPY FROM IMPORT
		file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			Files.createDirectories(Paths.get(filePath).getParent());
														// COPY FROM IMPORT
			Files.copy(file.toPath(), Paths.get(filePath), StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
}
