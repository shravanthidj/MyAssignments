package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAndUpdateCompanyName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Chrome driver
		ChromeDriver driver = new ChromeDriver();
		
		//EdgeDriver ed_Driver = new EdgeDriver();
		
		//To launch URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		//driver.get("https://login.salesforce.com/");
		
		//to maximize the screen
		driver.manage().window().maximize();
		//Java wait - it will wait for 10 seconds before closing the browser
		Thread.sleep(10000);

		driver.findElement(By.id("username")).sendKeys("DemoCsr");
		//crmsfa
		WebElement password_ele=driver.findElement(By.id("password"));
		password_ele.sendKeys("crmsfa");
		//classname
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//linktext
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(6000);
		//Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();
		
		//Click on create Lead Button
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(6000);
		//Enter CompanyName using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("NewCompanyTets");
		
		//Enter FirstName using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("FirstName Comp");
		
		//Enter LastName using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("LastNamr Comp");
		
		//Enter your mail-id
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test@tes.com");
		
		//phone number 
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("09439282823");
		
		//Click on create Lead Button Using name Locator
		driver.findElement(By.name("submitButton")).click();
		
		
		//to click on Edit button
		driver.findElement(By.linkText("Edit")).click();
		
		//update the company name
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Updatedd Name");
		
		//to click on update button
		driver.findElement(By.name("submitButton")).click();
		
		Thread.sleep(6000);
		//to close the driver
		//driver.close();

	}

}
