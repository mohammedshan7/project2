package pageprjt;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Propage 
{
	WebDriver driver;
	By path1=By.xpath("/html/body/div[4]/div[1]/div[2]/header/div/div[2]/div/div[1]");
	By path2=By.xpath("/html/body/div[4]/div[1]/div[2]/header/div/div[2]/div/div[1]/div/div[2]/form/input[3]");
	By path3=By.xpath("/html/body/div[4]/div[1]/div[2]/header/div/div[2]/div/div[1]/div/div[2]/form/input[4]");
	By path4=By.xpath("/html/body/div[4]/div[1]/div[2]/header/div/div[2]/div/div[1]/div/div[2]/form/div[1]/input");
	By path5=By.xpath("//*[@id=\"SiteNav\"]/li[1]/button/span");
	By himalayan=By.xpath("//*[@id=\"SiteNavLabel-shop-by-bike\"]/div/ul/li[1]/ul/li[3]/a/span");
    By crashgard=By.xpath("//*[@id=\"usf_container\"]/div/ul/li[3]/div/div[2]/div[2]/a[2]");
    By addcart=By.xpath("//*[@id=\"product_form_6564452106419\"]/div[1]/div/button/span[1]");
    By viewcart=By.xpath("/html/body/div[4]/div/a");
    By plus=By.xpath("//*[@id=\"shopify-section-cart-template\"]/div/div[1]/form/div[1]/div/table/tbody/tr/td[3]/div[1]/div/div[2]");
    By update=By.xpath("//*[@id=\"shopify-section-cart-template\"]/div/div[1]/form/div[1]/div/div[2]/input");
    By clear=By.xpath("//*[@id=\"shopify-section-cart-template\"]/div/div[1]/form/div[1]/div/div[2]/a");
    By search=By.xpath("//*[@id=\"shopify-section-bottom-bar-section\"]/div/div/div[1]/div/div/form/div/input[1]");
    By searchbutton=By.xpath("//*[@id=\"shopify-section-bottom-bar-section\"]/div/div/div[1]/div/div/form/button");
    By home=By.xpath("//*[@id=\"shopify-section-header\"]/div[2]/header/div/div[1]");
    By account=By.xpath("//*[@id=\"shopify-section-header\"]/div[2]/header/div/div[2]/div/div[1]");
    By logout=By.xpath("//*[@id=\"customer_logout_link\"]");
	public Propage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void sign()
	{
		WebElement s=driver.findElement(path1);
		Actions act=new Actions(driver);
		act.moveToElement(s).perform();
		
	}
	//public void click()
	//{
	//	driver.findElement(path2).click();
	//}
	 public void setvalues(String email, String pass)
	{
		driver.findElement(path2).sendKeys(email);
		driver.findElement(path3).sendKeys(pass);
	}
	public void click1()
	{
		driver.findElement(path4).click();
	}
	
	public void click2()
	{
		driver.findElement(path5).click();
	}
	public void click3()
	{
		driver.findElement(himalayan).click();
	}
	public void click4()
	{
		driver.findElement(crashgard).click();
	}
	public void click5()
	{
		driver.findElement(addcart).click();
	}
	public void click6()
	{
		driver.findElement(viewcart).click();
	}
	public void scrolldown()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
	    js.executeScript("window.scrollTo(0,400)");
	}
	public void click7()
	{
		driver.findElement(plus).click();
	}
	public void click8()
	{
		driver.findElement(update).click();
	}
	public void click9()
	{
		driver.findElement(clear).click();	
	}
	public void setvalues(String j)
	{
		driver.findElement(search).sendKeys( j);
	}
	public void click10()
	{
		driver.findElement(searchbutton).click();
	}
	public void click11()
	{
		driver.findElement(home).click();
	}
	public void click12()
	{
		driver.findElement(account).click();
	}
	public void scrolldown2()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
	    js.executeScript("window.scrollTo(0,400)");
	}
	public void click13()
	{
		driver.findElement(logout).click();
	}
}



