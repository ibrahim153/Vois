package voistask.voistask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class checkout {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\7\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("email")).sendKeys("hima.saad40@yahoo.com");
		driver.findElement(By.id("passwd")).sendKeys("himalovejesus010");
		driver.findElement(By.id("SubmitLogin")).click();
		
		 driver.findElement(By.linkText("Women")).click();
	 
	     driver.findElement(By.linkText("Blouse")).click();
	     driver.findElement(By.xpath("//p[@id='add_to_cart']")).click();
        // driver.switchTo().alert().accept();
	     Thread.sleep(3000);
	    driver.findElement(By.linkText("Proceed to checkout")).click();
	    driver.findElement(By.linkText("Proceed to checkout")).click();
	    driver.findElement(By.xpath("//button[@name='processAddress']")).click();
	    driver.findElement(By.id("cgv")).click();
	    driver.findElement(By.xpath("//button[@name='processCarrier']")).click();
	    driver.findElement(By.xpath("//a[@title='Pay by bank wire']")).click();
	    driver.findElement(By.xpath("//i[@class='icon-chevron-right right']")).click();
	  //  driver.findElement(By.cssSelector("button[class='button btn btn-default button-medium']")).click();
	    
		
		

	}

}
