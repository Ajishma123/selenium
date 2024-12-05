package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class package13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Chrome.driver","\"C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/flat/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user_login")).sendKeys("Ramju");
		driver.findElement(By.id("user_email")).sendKeys("eamju123@gmail.com");
		driver.findElement(By.id("user_pass")).sendKeys("Ahjmdn@34");
		driver.findElement(By.id("user_confirm_password")).sendKeys("Ahjmdn@34");
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-44\"]/form/div[2]/button")).click();
		
		

	}

}
