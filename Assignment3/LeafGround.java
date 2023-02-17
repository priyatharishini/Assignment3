package Assignment3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround 
{

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//h5[text()='Type your name']/following::input")).sendKeys("Poorna");
		WebElement web1 = driver.findElement(By.id("j_idt88:j_idt91"));
		web1.clear();
		web1.sendKeys("Madurai");
		boolean enabled = driver.findElement(By.id("j_idt88:j_idt93")).isEnabled();
		if(!enabled) {
			System.out.println("TextBox is Disabled ");
		}
		else
		{
			System.out.println("TextBox is Enabled");
		}

		
		WebElement web2 = driver.findElement(By.id("j_idt88:j_idt95"));
		web2.clear();
		web2.sendKeys("Can you clear me, please?");
		WebElement ss = driver.findElement(By.id("j_idt88:j_idt97"));
	ss.clear();
	ss.sendKeys("My learning is superb so far.");
	WebElement dd = driver.findElement(By.name("j_idt88:j_idt99"));
	dd.sendKeys("pooja92@gmail.com");
	  driver.findElement(By.id("j_idt88:j_idt101")).click();
	 System.out.println("Move to next Tab");
	 driver.findElement(By.name("j_idt88:j_idt101")).sendKeys("pooja is a good girl.She is a discipline person .");
    driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']")).sendKeys("pooja");
    driver.findElement(By.className("ql-bold")).click();
driver.findElement(By.className("ql-strike")).click();
//driver.findElement(By.id("ql-picker-options-0")).click();
	driver.findElement(By.id("j_idt106:thisform:age")).sendKeys("leo");
	System.out.println("It have error");
	driver.findElement(By.id("j_idt106:float-input")).sendKeys("demosalesManager");
	System.out.println("the username label goes up");
	driver.findElement(By.id("j_idt106:auto-complete_input")).sendKeys("ram");
	driver.findElement(By.xpath("//li[@class='ui-autocomplete-item ui-autocomplete-list-item ui-corner-all ui-state-highlight']")).click();
	WebElement e1 = driver.findElement(By.id("j_idt106:j_idt116_input"));
	e1.click();
	e1.sendKeys("16/2/2023");
	WebElement w1 = driver.findElement(By.id("j_idt106:j_idt118_input"));
	w1.sendKeys("5");
	driver.findElement(By.className("ui-button-text"));
	driver.findElement(By.id("j_idt106:slider")).sendKeys("100");
	driver.findElement(By.xpath("//h5[text()='Click and Confirm Keyboard appears']/following-sibling::input")).click();
	boolean keyboard = driver.findElement(By.xpath("//div[@class='keypad-row']/parent::div")).isDisplayed();
	if(keyboard) {
		System.out.println("Keyboard is Enabled");
	}else {
		System.out.println("Keyboard is Disabled");
	}
	driver.findElement(By.xpath("//div[@data-placeholder='Enter your content']")).sendKeys("Welcome to Testleaf");
	}
}