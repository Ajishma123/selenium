package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class package20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Chrome.Driver","C:\\\\Users\\\\User\\\\Downloads\\\\edgedriver_win64\\\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/rounded/https://demo.wpeverest.com/user-registration/rounded/");
		driver.findElement(By.id("user_login")).sendKeys("mideva");
		driver.findElement(By.id("user_email")).sendKeys("midevav234@gmail.com");
		driver.findElement(By.id("user_pass")).sendKeys("gvwfhi");
		driver.findElement(By.id("user_confirm_password")).sendKeys("gvwfhi");
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-45\"]/form/div[2]/button")).click();
		

	}

}
