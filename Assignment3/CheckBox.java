package Assignment3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement f1 = driver.findElement(By.xpath("//span[text()='Basic']"));
		f1.click();
		System.out.println(f1.isEnabled());
	WebElement f2 = driver.findElement(By.xpath("//span[text()='Ajax']"));
	f2.click();
	System.out.println(f2.isEnabled());
	WebElement f3 = driver.findElement(By.xpath("(//label[text()='Python'])"));
	f3.click();
	System.out.println(f3.isEnabled());
	driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']"));
	WebElement f4 = driver.findElement(By.xpath("(//div[@id='j_idt87:ajaxTriState']//div)[2]"));
f4.click();
System.out.println(f4.isEnabled());
driver.findElement(By.className("ui-toggleswitch-slider")).click();
 boolean enabled = driver.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'])[3]")).isSelected();
if(!enabled)
{
	System.out.println("is disabled");
	
}
else
{
	System.out.println("is enabled");
}
driver.findElement(By.xpath("//ul[contains(@class,'ui-selectcheckboxmenu-multiple-container ui-widget')]")).click();
WebElement f5 = driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[5]"));
f5.click();
System.out.println(f5.isEnabled());
Thread.sleep(2000);
}
}
