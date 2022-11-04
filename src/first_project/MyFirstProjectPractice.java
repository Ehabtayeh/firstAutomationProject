package first_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstProjectPractice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Ehab(QA)\\MyChromeNewWebDriver\\chromedriver.exe");
		
		WebDriver  driver = new ChromeDriver();
		
		driver.get("http://127.0.0.1:5500/index.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("email_input")).sendKeys("ahoob172@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("201010566Ehab");
		driver.findElement(By.id("birth_input")).sendKeys("11/04/2022");
		driver.findElement(By.id("number_input")).sendKeys("+962776347317");
		driver.findElement(By.tagName("button")).click();

	}

}
