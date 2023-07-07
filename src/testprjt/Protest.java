package testprjt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageprjt.Propage;

public class Protest 
{
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://bandidospitstop.com/");
		
	}
	@Test
	public void testing() throws InterruptedException
	{
		Propage ob=new Propage(driver);
		driver.manage().window().maximize();
		ob.sign();
		Thread.sleep(3000);
		ob.setvalues("mohammedsha776@gmail.com", "943099");
		Thread.sleep(3000);
		ob.click1();
		Thread.sleep(3000);
		ob.click2();
		Thread.sleep(3000);
		ob.click3();
		Thread.sleep(3000);
		ob.click4();
		Thread.sleep(3000);
		ob.click5();
		Thread.sleep(3000);
		ob.click6();
		Thread.sleep(3000);
		ob.scrolldown();
		Thread.sleep(3000);
		ob.click7();
		Thread.sleep(3000);
		ob.click8();
		Thread.sleep(3000);
		ob.click9();
		Thread.sleep(3000);
		ob.setvalues("KYT SKYHAWK GLOWING BLUE ORANGE FLUO");
		Thread.sleep(3000);
		ob.click10();
		Thread.sleep(3000);
		ob.click11();
		Thread.sleep(3000);
		ob.click12();
		Thread.sleep(3000);
		ob.scrolldown2();
		Thread.sleep(3000);
		ob.click13();
		Thread.sleep(3000);
	}
	

}


