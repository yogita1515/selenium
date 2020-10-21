package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {
	WebDriver driver;
	
	public void invoke()
	{
	System.setProperty("webdriver.chrome.driver", "G:\\Ajay Automation\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	driver.get("https://j2-qc.jibe.solutions/QC1/Account/Login.aspx");
	}
	public void loginApplication() {
	driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_LoginUser_UserName\"]")).sendKeys("AJay");
    driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_LoginUser_NextButton\"]")).click();
    driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_LoginUser_Password\"]")).sendKeys("Ajay@@22");
    driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_LoginUser_SignInBtn\"]")).click();
    driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
    MOC();
	}
	public void MOC() {
		Actions actions = new Actions(driver);
		WebElement quality = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[9]/a/span"));
		actions.moveToElement(quality).perform();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"nav\"]/li[9]/ul/li[21]/a/span")).click();
			
	}
	public void createJob() {
	driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//span[text()='Create New']")).click();
	}

public static void main(String[] args) {
	
	Test test =new Test();
	test.invoke();
	test.loginApplication();
	test.createJob();
}}