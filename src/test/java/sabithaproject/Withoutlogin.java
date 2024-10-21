package sabithaproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Withoutlogin {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//view product
		 WebElement view=driver.findElement(By.xpath("/html/body/section[2]/div[1]/div[1]/div[2]/div[1]/div[11]/div/div[2]/ul/li/a"));
		 view.click();
		 
		 //quantity add
		 WebElement add=driver.findElement(By.id("quantity"));
		 add.clear();
		 add.sendKeys("4");
		 
		 //add to cart
		 driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")).click();
		 
		 //view cart
		 driver.findElement(By.linkText("View Cart")).click();
		 
		 //proceed to checkout
		 driver.findElement(By.xpath("//*[@id=\"do_action\"]/div[1]/div/div/a")).click();
		 
		
				
	}

}
