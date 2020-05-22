package utilities.selenium;





import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;




public class Utilities {
	
	static WebDriver driver;
	
	public static WebDriver drivers(String browserFromFile)
	{

	//String browserFromFile="Chrome";
	
	if(browserFromFile.equals("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver_win32 (1)\\chromedriver.exe ");
	 driver= new ChromeDriver();
	}
	else if (browserFromFile=="FireFox")
	{
		System.setProperty("webdriver.gecko.driver", "C:\\ChromeDriver\\chromedriver_win32 (1)\\geckodriver.exe");
	 driver= new FirefoxDriver();
	}
	else if(browserFromFile=="IE")
	{
		System.setProperty("webdriver.ie.driver", "C:\\ChromeDriver\\chromedriver_win32 (1)\\IEDriverServer.exe");
		 driver= new InternetExplorerDriver();
	}
	
	
	
		return driver;
		
	}
	
}
