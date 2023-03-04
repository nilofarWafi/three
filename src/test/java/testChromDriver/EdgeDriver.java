package testChromDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeDriver {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/");
		String title=driver.getTitle();
		System.out.println("the text title is: "+title);
		Thread.sleep(3000);
		driver.navigate().to("https://dvprogram.state.gov/");
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		driver.close();
		driver.quit();
	

	}

}
