package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class package9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.Driver","\"C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/conditional-registration-form/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"radio_1569481639_field\"]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"radio_1569481639_field\"]/ul/li[2]/label")).click();
		driver.findElement(By.name("phone_1569482700")).sendKeys("(701)276-6762");
		driver.findElement(By.id("user_url")).sendKeys("https://en.wikipedia.org/wiki/Bird");
		driver.findElement(By.id("user_email")).sendKeys("achu123@gmail.com");
		driver.findElement(By.id("user_pass")).sendKeys("Ammuz823@");
		driver.findElement(By.id("country_1569483038")).click();
		driver.findElement(By.id("country_1569483038")).sendKeys("Indian");
		driver.findElement(By.xpath("//*[@id=\"check_box_1569483464_field\"]/ul/li/label")).click();
		driver.findElement(By.id("textarea_1569483045")).sendKeys("hello");
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-116\"]/form/div[5]/button")).click();
	}

}
