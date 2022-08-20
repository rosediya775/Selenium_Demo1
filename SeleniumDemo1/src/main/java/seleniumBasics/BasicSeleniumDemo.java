package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicSeleniumDemo {

	public static void main(String[] args) {
		
		// Launching chrOme
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\diyar\\eclipse-workspace\\SeleniumDemo\\driver\\chromedriver.exe");	
			
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();// instantiating driver
		driver.get("https://www.google.com");// get String method
		
			
			// Entering URL with navigate method
			driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
        driver.manage().window().fullscreen();//manage method
        
		String title = driver.getTitle(); // get title method
		System.out.println("title is .." + title);
		
		String url = driver.getCurrentUrl();// getcurrentUrl method
		System.out.println(url);
        
		// equals method
		if (title.equals("OrangeHRM")) {
		System.out.println("correct title");}
		
		else {
		System.out.println("incorrect title");
		}
		
		// find userName : findElement method
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.name("login")).click();
		
		driver.close();// close method
		driver.quit();// quit method
		
		
		
			
		
	}

}
