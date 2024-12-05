package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class package15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","\"C:\\Users\\User\\Downloads\\chromedriver-win64\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/payment-with-stripe-form/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user_email")).sendKeys("reeja.anil189@gmail.com");
		driver.findElement(By.id("user_pass")).sendKeys("Ahgjklg@123");
		driver.findElement(By.xpath("//*[@id=\"multiple_choice_1641271687_CPU i5 8th Gen\"]")).click();
		driver.findElement(By.cssSelector("#user-registration-form-351 > form > div.ur-button-container > button")).click();
		

	}

}
