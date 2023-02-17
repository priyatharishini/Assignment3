package week2day;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Aparna");
		driver.findElement(By.name("lastname")).sendKeys("S");
		driver.findElement(By.name("reg_email__")).sendKeys("9984507760");
		driver.findElement(By.id("password_step_input")).sendKeys("siva");
		WebElement  web = driver.findElement(By.name("birthday_day"));
		Select ss=new Select(web);
		ss.selectByValue("22");
		WebElement web1 = driver.findElement(By.name("birthday_month"));
		Select ss1=new Select(web1);
		ss1.selectByValue("7");
		WebElement web2 = driver.findElement(By.name("birthday_year"));
		Select ss2=new Select(web2);
		ss2.selectByValue("1994");
 driver.findElement(By.name("sex")).click();

	}

}
