package Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5Frames {

	public static void main(String[] args) {
		
		
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://the-internet.herokuapp.com");
		 //driver.findElement(By.linkText("Nested Frames")).click();
		 driver.findElement(By.xpath("//div[@id='content']//a[text()='Nested Frames']")).click();
		 driver.switchTo().frame("frame-top");
		 driver.switchTo().frame("frame-middle");
		 System.out.println(driver.findElement(By.id("content")).getText());

	}

}
