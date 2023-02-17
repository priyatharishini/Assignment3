package Assignment3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(22));
	WebElement f1= driver.findElement(By.xpath("//label[text()='Chrome']"));
	f1.click();
	System.out.println(f1.isEnabled());
	driver.findElement(By.xpath("//label[text()='Chennai']")).click();
System.out.println(driver.findElement(By.xpath("//label[text()='Chennai']")).isEnabled());
driver.findElement(By.xpath("(//label[text()='Safari'])[2]"));
System.out.println(driver.findElement(By.xpath("(//label[text()='Safari'])[2]")).isEnabled());
WebElement f2 = driver.findElement(By.xpath("(//label[text()='1-20 Years'])"));
	f2.click();
	System.out.println(f2.isEnabled());
	}
}