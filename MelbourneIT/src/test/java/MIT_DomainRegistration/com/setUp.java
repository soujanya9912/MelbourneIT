package MIT_DomainRegistration.com;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class setUp {
	
	WebDriver driver;
	Properties prop=new Properties();
	
	@BeforeClass
	public void Createacct() throws InterruptedException, IOException
	{
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\properties\\config.properties");
	prop.load(fis);
	
		driver=new ChromeDriver();
	driver.get(prop.getProperty("QA_URL"));
	driver.manage().window().maximize();
	}
	
@AfterClass
public void cleanUP()
{
	driver.quit();
}

}
