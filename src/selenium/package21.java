package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class package21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Chrome.Driver","C:\\\\Users\\\\User\\\\Downloads\\\\edgedriver_win64\\\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/rounded-edge/");
		driver.findElement(By.id("user_login")).sendKeys("yadavu");
		driver.findElement(By.id("user_email")).sendKeys("yadava123@gmail.com");
		driver.findElement(By.id("user_pass")).sendKeys("fgdhsgha");
		driver.findElement(By.id("user_confirm_password")).sendKeys("fgdhsgha");
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-46\"]/form/div[2]/button")).click();

	}

}
