package Assignment3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		WebElement s2 = driver.findElement(By.id("j_idt88:j_idt90"));
		String text = s2.getText();
		s2.click();
		if(driver.getTitle().contains(text))
		{
			System.out.println("button is  not clicked");
		}
		else
		{
			System.out.println("button is  clicked");
		}
		driver.get("https://www.leafground.com/button.xhtml");
		Thread.sleep(2000);
		boolean button= driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled();
		
	System.out.println(button);
	Thread.sleep(2000);
	Point l1 = driver.findElement(By.xpath("//span[text()='Submit']")).getLocation();
	System.out.println(l1);
	}

}
