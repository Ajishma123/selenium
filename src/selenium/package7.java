package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class package7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.Driver","\"C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/column-3/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user_email")).sendKeys("jock123@gmail.com");
		driver.findElement(By.id("user_login")).sendKeys("jock");
		driver.findElement(By.id("user_pass")).sendKeys("Amu123#");
		driver.findElement(By.id("first_name")).sendKeys("jack");
		driver.findElement(By.id("last_name")).sendKeys("U");
		driver.findElement(By.id("nickname")).sendKeys("jac");
		driver.findElement(By.id("user_url")).sendKeys("https://en.wikipedia.org/wiki/Human");
		driver.findElement(By.id("textarea_1530101155")).sendKeys("doing good");
		driver.findElement(By.xpath("//*[@id=\"date_box_1530101157_field\"]/span/input[1]")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/div/input")).sendKeys("00002024");
		WebElement testDropDown = driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/select"));
		Select dropdown=new Select(testDropDown);
		dropdown.selectByVisibleText("March");
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[2]/div/span[16]")).click();
    	driver.findElement(By.xpath("//*[@id=\"user-registration-form-32\"]/form/div[4]/button")).click();
		

	}

}
