package eProcessify;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class LocatorConcept {

	public  void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
	            "C:\\Users\\codetoart07\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://localhost:8080/dashboard");
		
		//1. xpath == not useful if it comes in a hierarchical form
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("yogita@codetoart.com");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("123456");
		
		//2. id
		/*driver.findElement(By.id("email")).sendKeys("zuber@codetoart.com");;
		driver.findElement(By.id("password")).sendKeys("123456");*/
		
		//3. name - Will not work coz name is not there
		/*driver.findElement(By.name("email")).sendKeys("zuber@codetoart.com");;
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.cssSelector("#password")).sendKeys("123456");*/ //we can also use
		
		//4. linkText (this is only for links) Seems works only by anchor tag
	//	driver.findElement(By.linkText("Sign up")).click();
		
		//5. cssSelector
		//Two ways to create cssSelector 
		//1. if did is there then #id e.x driver.findElement(By.cssSelector("#password")).sendKeys("123456");
		//2. class is there then .classname
		driver.findElement(By.cssSelector("div.form-group:nth-child(5) > button:nth-child(1)")).click();
		//*[@id="app"]/div[1]/div/div/div/form/div[5]/button
		//6. className == not useful coz class name can be duplicate
	//	driver.findElement(By.className("app-theme__a font-weight-bold pointer")).click();
		
		//7. partialLinkText == not useful

	
	}	
	
}
