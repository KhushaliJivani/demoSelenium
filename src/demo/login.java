package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Khushali\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new  ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("USERID");
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("USERID");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
}
