package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class package4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","\"C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/bordered/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user_login")).sendKeys("kalesh");
		driver.findElement(By.id("user_email")).sendKeys("kalesh.456@gmail.com");
		driver.findElement(By.id("user_pass")).sendKeys("Athullll123");
		driver.findElement(By.id("user_confirm_password")).sendKeys("Athullll123");
		driver.findElement(By.cssSelector("#user-registration-form-43 > form > div.ur-button-container > button")).click();

	}

}
