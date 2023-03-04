package selenium.intermediate;

		import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.WebElement;

		public class FindElementsConcept {
		    public static void main(String[] args) throws InterruptedException {
		        // Step 4: Set the path for the chrome driver
		        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
		        // Step 5: Create an instance of the chrome driver
		        WebDriver driver = new ChromeDriver();
		        // Step 6: Maximize the window
		        driver.manage().window().maximize();
		        // Step 7: Go to the Retail application
		        driver.get("https://www.retailapplication.com");
		        // Step 8: Click on the All icon
		        driver.findElement(By.cssSelector("[data-test='all-icon']")).click();
		        // Step 9: Click on Electronics
		        driver.findElement(By.cssSelector("[data-test='electronics-link']")).click();
		        // Step 10: Click on Video Games
		        driver.findElement(By.cssSelector("[data-test='video-games-link']")).click();
		        // Step 11: Wait for 2 seconds
		        Thread.sleep(2000);
		        // Step 12: Find all the elements of the page using the 'findElements()' method
		        List<WebElement> elements = driver.findElements(By.xpath("//*"));
		        // Step 13: Print the number of elements found
		        System.out.println("Number of elements found: " + elements.size());
		        // Step 14: Iterate through the list of elements and print their text and tag name
		        for (WebElement element : elements) {
		            System.out.println("Text: " + element.getText() + " Tag: " + element.getTagName());
		        }
		        // Step 15: Close the browser
		        driver.close();
		    }
		

	}

