package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverObject {
	//caminho que encontra o chrome driver
	public WebDriver setup() {
		System.setProperty("webdriver.chrome.driver","\"C:\\Users\\User\\Desktop\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	
	

}
