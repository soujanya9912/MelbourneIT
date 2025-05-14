package MIT_DomainRegistration.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DomainRegistration_com {
	
	@Test
		public void Createacct() throws InterruptedException
		{
		WebDriver driver=new ChromeDriver();
		driver.get("https://melbourneit.au/domain-names/registration/");
		driver.manage().window().maximize();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//button[text()='Allow all']")).click();
	driver.findElement(By.xpath("//a[text()='Domains ']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//a[text()='Register My Domain'])[1]")).click();
	driver.findElement(By.xpath("(//input[@placeholder='findyourdomain.au'])[1]")).sendKeys("testdomain8989.com");
	driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
	Thread.sleep(4000);
	//driver.findElement(By.xpath("//strong[text()='USD']")).click();
	//driver.findElement(By.xpath("//span[text()='AUD']")).click();
	}

}
