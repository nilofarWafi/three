package testChromDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {

	public static void main(String[] args) {
		WebDriver driver=null;
	String browserType="firefox";
	
	
	String url="https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/";
	if(browserType.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}else if(browserType.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}else if(browserType.equalsIgnoreCase("firefox")){
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	driver.get(url);

	}

}
