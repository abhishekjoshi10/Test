package Testcaseexecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc001 {
	
	 public void login () throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\joshi\\OneDrive\\Desktop\\testing\\chromedriver_win32\\chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			driver .get("https://testing-assessment-foh15kew9-edvora.vercel.app/");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			
		WebElement userName = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div/div[1]/div/input"));
			userName.sendKeys("Test");
			  
			WebElement password = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div/div[2]/div/input"));
			password.sendKeys("12345");
			Thread.sleep(2000);
			 
			Thread.sleep(2000);
		WebElement btnLogin = driver.findElement(By.xpath("//*[@id=\\\"__next\\\"]/div/main/div/div/button"));
		btnLogin.click();

}
}
