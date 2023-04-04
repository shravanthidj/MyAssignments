package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		//EdgeDriver ed_Driver = new EdgeDriver();
		
		//To launch URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		//driver.get("https://login.salesforce.com/");
		//to maximize the screen
		driver.manage().window().maximize();
		//Java wait - it will wait for 2 seconds before closing the browser
		Thread.sleep(10000);
		//to close the driver
		//driver.close();

		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		//crmsfa
		WebElement password_ele=driver.findElement(By.id("password"));
		password_ele.sendKeys("Leaf@123");
		//classname
		driver.findElement(By.name("Login")).click();
		
		//linktext
		//driver.findElement(By.linkText("CRM/SFA")).click();
}
}
