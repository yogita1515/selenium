package Basic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;

public class Utility {

	public static void captureScrrenshot(WebDriver driver,String scrrenshotname) throws IOException {
		
TakesScreenshot ts=(TakesScreenshot)driver;
File source=ts.getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(source,new File("./Scrrenshots"+scrrenshotname+".png"));
System.out.print("Scrrenshit taken");
	} 

}
