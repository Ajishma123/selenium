package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class package12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Chrome.driver","\"C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/file-upload-form/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user_email")).sendKeys("raamuj@gmail.com");
		driver.findElement(By.id("user_pass")).sendKeys("Rasdfg56@");
		driver.findElement(By.id("ur_file_1641275829")).click();
		driver.get("\"C:\\Users\\User\\Downloads\\Gutenberg_Bible,_Lenox_Copy,_New_York_Public_Library,_2009._Pic_01.jpg\"");
		
		

	}

}
