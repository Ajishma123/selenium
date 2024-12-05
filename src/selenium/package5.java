package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class package5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.Driver","\"C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/column-1/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user_login")).sendKeys("Tinttu");
		driver.findElement(By.id("user_email")).sendKeys("tinttu1236@gmail.com");
		driver.findElement(By.id("user_pass")).sendKeys("Rammu567");
		driver.findElement(By.id("user_confirm_password")).sendKeys("Rammu567");
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-47\"]/form/div[2]/button")).click();

	}

}
