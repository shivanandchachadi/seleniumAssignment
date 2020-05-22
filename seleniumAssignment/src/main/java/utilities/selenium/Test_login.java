package utilities.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test_login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
		String browser="FireFox";
		driver=Utilities.drivers(browser);
		driver.get("https://www.espncricinfo.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(10);
		 List<WebElement> list = driver.findElements(By.tagName("a"));
		int noOfLinks=list.size();

		System.out.println("THE TITLE IS  " +  driver.getTitle());
		System.out.println("THE CURRENT URL IS" +  driver.getCurrentUrl());
		System.out.println("number of links in the page are " +  noOfLinks);

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id='navbarSupportedContent']/ul/li[1]/a"))).build().perform();
		 List<WebElement> elementList = driver.findElements(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[1]/div/div/ul/li/a"));
		System.out.println("size is " + elementList.size());
		Thread.sleep(5000);
		System.out.println("texttttt " + elementList.get(3).getText());
		String month="Month view";
		String week="Week view";
		String innertitle=null;
		for ( int i=1;i<=elementList.size();i++)
		{
			String gr=driver.findElement(By.xpath("//*[@id='navbarSupportedContent']/ul/li[1]/div/div/ul/li["+i+"]/a")).getText();
			System.out.println(gr);
			if (month.equals(gr))
			{
				driver.findElement(By.xpath("//*[@id='navbarSupportedContent']/ul/li[1]/div/div/ul/li["+i+"]/a")).click();
				Thread.sleep(4000);
				innertitle=driver.getTitle();
				break;
			}
		}
		
		
		//driver.findElement(By.xpath("//*[@id='navbarSupportedContent']/ul/li[1]/a")).sendKeys(Keys.ARROW_DOWN);
		//driver.findElement(By.xpath("//*[@id='navbarSupportedContent']/ul/li[1]/a")).sendKeys(Keys.ARROW_DOWN);
		//driver.findElement(By.xpath("//*[@id='navbarSupportedContent']/ul/li[1]/a")).sendKeys(Keys.ENTER);

		
	
	

		
		//String sss = driver.findElement(By.xpath("//*[@id='navbarSupportedContent']/ul/li[1]/div/div/ul/li[3]/a")).getText();
			
		System.out.println("the inner inner title  is "+  innertitle);
		driver.close();
		

		


	}

}
