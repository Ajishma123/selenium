package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class package6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","\"C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/column-2/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user_email")).sendKeys("roseeey.234@gmail.com");
		driver.findElement(By.id("user_login")).sendKeys("Roseeey");
		driver.findElement(By.id("first_name")).sendKeys("Rosey");
		driver.findElement(By.id("last_name")).sendKeys("p");
		driver.findElement(By.id("user_pass")).sendKeys("Richu890@");
		driver.findElement(By.id("user_confirm_password")).sendKeys("Richu890@");
		driver.findElement(By.id("nickname")).sendKeys("rose");
		driver.findElement(By.id("user_url")).sendKeys("https://en.wikipedia.org/wiki/Sun");
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-16\"]/form/div[5]/button")).click();

	}

}
