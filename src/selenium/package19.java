package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class package19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\User\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/simple-registration-form/");
		driver.findElement(By.id("first_name")).sendKeys("ithal");
		driver.findElement(By.id("last_name")).sendKeys("S");
		driver.findElement(By.id("user_login")).sendKeys("ithalmolu");
		driver.findElement(By.id("user_email")).sendKeys("ithalmolu123@gmail.com");
		driver.findElement(By.id("user_pass")).sendKeys("Agvdvj45%");
		driver.findElement(By.id("user_confirm_password")).sendKeys("Agvdvj45%");
		driver.findElement(By.id("description")).sendKeys("ashsdbvhdb");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		

	}

}
