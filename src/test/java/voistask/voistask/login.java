package voistask.voistask;

import org.openqa.selenium.By;
//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		System.setProperty("webdriver.chrome.driver","C:\\Users\\7\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("email")).sendKeys("hima.saad40@yahoo.com");
		driver.findElement(By.id("passwd")).sendKeys("himalovejesus010");
		driver.findElement(By.id("SubmitLogin")).click();
	}

}
