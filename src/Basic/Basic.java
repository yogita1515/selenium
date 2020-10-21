package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {
	WebDriver driver;
	public void invoke() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\codetoart07\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	
	public static void main(String[] args) {
		
      Basic basic=new Basic();
      basic.invoke();
	}

}
