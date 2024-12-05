package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class package11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Chrome.Driver","\"C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.wpeverest.com/user-registration/donation-form/");
		driver.findElement(By.id("user_email")).sendKeys("raju78@gmail.com");
		driver.findElement(By.id("user_pass")).sendKeys("Avbnm356@");
		WebElement element=driver.findElement(By.xpath("//*[@id=\"user-registration-form-311\"]/form/div[1]/div/div[3]/div/div[2]/input"));
		element.clear();
		element.sendKeys("54");
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-311\"]/form/div[2]/button")).click();

	}

}
