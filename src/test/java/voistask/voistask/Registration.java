package voistask.voistask;

 

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		System.setProperty("webdriver.chrome.driver","C:\\Users\\7\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.xpath("//input[@name='email_create']")).sendKeys("ibra@yahoo.com");
		driver.findElement(By.id("SubmitCreate")).click();
		 
		WebDriverWait wait = new WebDriverWait (driver, 30);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='id_gender']")));
	    element.click();
		
		driver.findElement(By.cssSelector("input[name='customer_firstname']")).sendKeys("ibrahim");
		driver.findElement(By.xpath("//*[@name='customer_lastname']")).sendKeys("saad");
		WebElement alo =driver.findElement(By.id("email"));
		alo.clear();
		alo.sendKeys("ibra@yahoo.com");
		
		
		driver.findElement(By.id("passwd")).sendKeys("hima12345");
		WebElement day = driver.findElement(By.id("days"));
		Select dayvalue = new Select (day);
		dayvalue.selectByIndex(23);
		WebElement month = driver.findElement(By.id("months"));
		Select monthvalue = new Select (month);
		 monthvalue.selectByValue("8");;
		 WebElement year = driver.findElement(By.id("years"));
		Select yearvalue = new Select (year);
		 yearvalue.selectByValue("1993");;
		 driver.findElement(By.xpath("//input[@name='newsletter']")).click();
		 List <WebElement> box = driver.findElements(By.xpath("//input[@class='form-control']"));
		 box.get(0).sendKeys("ibrahim");
		 box.get(1).sendKeys("saad");
		 box.get(2).sendKeys("xyc company");
		 box.get(3).sendKeys("16 haram street");
		 box.get(4).sendKeys("15 haram bnj");
		 box.get(5).sendKeys("Giza");
		 
		WebElement state = driver.findElement(By.id("id_state"));
		Select stateval = new Select (state);
		stateval.selectByValue("8");;
		
		 driver.findElement(By.id("postcode")).sendKeys("00000");
		 driver.findElement(By.id("uniform-id_country")).click();
		 /*WebElement country = driver.findElement(By.id("id_country"));
			Select counval = new Select (country);
			counval.selectByValue("United States");*/
		 driver.findElement(By.id("other")).sendKeys("alpabeta");
		 driver.findElement(By.id("phone")).sendKeys("01552842657");
		 driver.findElement(By.id("phone_mobile")).sendKeys("01552842657");
		 driver.findElement(By.id("alias")).sendKeys("47 maryo street");
		 driver.findElement(By.id("submitAccount")).click();
		 
		
		
	}

}
