package MIT_DomainRegistration.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class End_to_End_DomainRegistration_ExistingCU extends setUp
{
		
			
	@Test
	public void domainregistration_ExistingCU() throws InterruptedException
	{
		Thread.sleep(9000);
		String  allowall=prop.getProperty("ALLOW_ALL");
		String  cuurencydropdown=prop.getProperty("USD_Dropdown");
		String  selectaud=prop.getProperty("Select_AUD");
		String  Registrantname=prop.getProperty("Registrant_Name");
		String  Registrantname_Data=prop.getProperty("Registrant_Name_Data");
		String  RegistrantOrg=prop.getProperty("Registrant_Organisation");
		String  RegistrantOrg_Data=prop.getProperty("Registrant_Organisation_Data");
		String  RegistrantEmail=prop.getProperty("Registrant_Email");
		String  RegistrantEmailData=prop.getProperty("Registrant_Email_Data");
		String  RegistrantPhone=prop.getProperty("Registrant_Phone");
		String  RegistrantPhonedata=prop.getProperty("Registrant_Phone_Data");
		String  Regsitrantaddress=prop.getProperty("Regsitrant_address");
		String  Regsitrantaddressdata=prop.getProperty("Regsitrant_address_data");
		String  RegistrantCity=prop.getProperty("Registrant_City");
		String  RegistrantCityData=prop.getProperty("Registrant_City_Data");
		String  RegistrantState=prop.getProperty("Registrant_State");
		String  RegistrantStatedata=prop.getProperty("Registrant_State_Data");
		String  RegistrantPostcode=prop.getProperty("Registrant_Postcode");
		String  RegistrantPostcodedata=prop.getProperty("Registrant_Postcode_Data");
		String  RegistrantCountry=prop.getProperty("Registrant_Country");
		String  addtocart=prop.getProperty("Add_to_Basket");
		String  ContinuetoCart=prop.getProperty("Continue_to_Cart");
		String  Existingcu=prop.getProperty("Existing_CU");
		String  ExistingUsername=prop.getProperty("Existing_Username");
		String  ExistingUsernameData=prop.getProperty("Existing_Username_Data");
		String  ExistingUserPassword=prop.getProperty("Existing_User_Password");
		String  ExistingUserPasswordData=prop.getProperty("Existing_User_Password_Data");
		String  Logintomyaccount=prop.getProperty("Login_to_my_account");
		String  RadiobuttonCreditDebitCard=prop.getProperty("Radio_button_Credit_Debit_Card");
		String 	CreditCardNumber=prop.getProperty("Credit_Card_Number");
		String 	CreditCardNumberdata=prop.getProperty("Credit_Card_Number_Data");
		String 	CreditCardExpiryDate=prop.getProperty("Credit_Card_Expiry_Date");
		String 	CreditCardExpiryDateData=prop.getProperty("Credit_Card_Expiry_Date_Data");
		String 	CreditCardCVV=prop.getProperty("Credit_Card_CVV");
		String 	CreditCardCVVData=prop.getProperty("Credit_Card_CVV_Data");
        String  Starttypingaddress=prop.getProperty("Start_typing_your_address");
		String  Starttypingaddressdata=prop.getProperty("Start_typing_your_address_Data");
		String  Addnoteshere=prop.getProperty("Add_notes_here");
		String  Addnotesheredata=prop.getProperty("Add_notes_Data");
		String  placeorder=prop.getProperty("Place_order_pay");
		
		driver.findElement(By.xpath(allowall)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(cuurencydropdown)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(selectaud)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(Registrantname)).sendKeys(Registrantname_Data);
		driver.findElement(By.xpath(RegistrantOrg)).sendKeys(RegistrantOrg_Data);
		driver.findElement(By.xpath(RegistrantEmail)).sendKeys(RegistrantEmailData);
		driver.findElement(By.xpath(RegistrantPhone)).sendKeys(RegistrantPhonedata);
		Thread.sleep(1000);
		driver.findElement(By.xpath(Regsitrantaddress)).sendKeys(Regsitrantaddressdata);
		driver.findElement(By.xpath(RegistrantCity)).sendKeys(RegistrantCityData);
	    driver.findElement(By.xpath(RegistrantState)).sendKeys(RegistrantStatedata);
		driver.findElement(By.xpath(RegistrantPostcode)).sendKeys(RegistrantPostcodedata);
		Thread.sleep(1000);
		WebElement country=driver.findElement(By.xpath(RegistrantCountry));
	    Select coun=new Select(country);
        coun.selectByIndex(9);
		Thread.sleep(3000);
		driver.findElement(By.xpath(addtocart)).click();
		Thread.sleep(13000);
		driver.findElement(By.xpath(ContinuetoCart)).click();
		Thread.sleep(11000);
		driver.findElement(By.xpath(Existingcu)).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(ExistingUsername)).sendKeys(ExistingUsernameData);
		driver.findElement(By.xpath(ExistingUserPassword)).sendKeys(ExistingUserPasswordData);
        driver.findElement(By.xpath(Logintomyaccount)).click();
		Thread.sleep(11000);
		driver.findElement(By.xpath(RadiobuttonCreditDebitCard)).click();
		Thread.sleep(11000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath(CreditCardNumber)).sendKeys(CreditCardNumberdata);
		driver.findElement(By.xpath(CreditCardExpiryDate)).sendKeys(CreditCardExpiryDateData);
		driver.findElement(By.xpath(CreditCardCVV)).sendKeys(CreditCardCVVData);
	    WebElement dropd=	driver.findElement(By.xpath("//select[@id='Field-countryInput']"));
	    Select seld=new Select(dropd);
	    seld.selectByIndex(2);
	    driver.switchTo().defaultContent();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath(Starttypingaddress)).sendKeys(Starttypingaddressdata);
	    driver.findElement(By.xpath(Addnoteshere)).sendKeys(Addnotesheredata);
	    driver.findElement(By.xpath(placeorder)).click();
	    Thread.sleep(5000);
		}}



