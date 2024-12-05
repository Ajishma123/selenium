package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class package3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/simple-registration-form/");
		driver.manage().window().maximize();
		driver.findElement(By.id("first_name")).sendKeys("Ajishma");
		driver.findElement(By.id("last_name")).sendKeys("anil");
		driver.findElement(By.id("user_login")).sendKeys("futura5675");
		driver.findElement(By.id("user_email")).sendKeys("lulu.anil5998@gmail.com");
		driver.findElement(By.id("user_pass")).sendKeys("7012766762");
		driver.findElement(By.id("user_confirm_password")).sendKeys("7012766762");
		driver.findElement(By.id("description")).sendKeys("Lic");
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-105\"]/form/div[3]/button")).click();//		driver.findElement(By.xpat)
		

				
		

	}

}
