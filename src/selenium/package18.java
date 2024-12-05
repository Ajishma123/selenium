package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class package18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\User\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/recaptcha-registration-form/");
//		driver.manage().window().minimize();
		driver.findElement(By.id("first_name")).sendKeys("lulu");
		driver.findElement(By.id("user_email")).sendKeys("lulu.ahjm@gmail.com");
		driver.findElement(By.id("display_name")).sendKeys("lulumm");
		driver.findElement(By.id("last_name")).sendKeys("V");
		driver.findElement(By.id("user_pass")).sendKeys("Afhb345#");
		driver.findElement(By.name("phone_1623134125")).sendKeys("(789) 056-7906");
		
		

	}

}
