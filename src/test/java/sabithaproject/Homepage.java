package sabithaproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Homepage {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//click-->login button
	    WebElement login=driver.findElement(By.xpath("//*[@id=\'header\']/div/div/div/div[2]/div/ul/li[4]/a"));
	    login.click();
				
	    //email-->signup page
	    WebElement email=driver.findElement(By.xpath("//*[@id=\'form\']/div/div/div[1]/div/form/input[2]"));
		email.clear();
		email.sendKeys("takemichi12@gmail.com");
		
		//title-->account page(password)
		WebElement pass=driver.findElement(By.xpath("//*[@id=\'form\']/div/div/div[1]/div/form/input[3]"));
		pass.clear();
		pass.sendKeys("Sabi12@");
		
		//clicking the loggin button
		WebElement logging=driver.findElement(By.cssSelector("button[type=\'submit\']"));
		logging.click();
		
		//women category
		WebElement women=driver.findElement(By.xpath("//*[@id=\'accordian\']/div[1]/div[1]/h4/a/span"));
		women.click();
		
		//dress option
		WebElement dress=driver.findElement(By.xpath("//*[@id=\"Women\"]/div/ul/li[1]/a"));
		dress.click();
		
		//add to cart
		WebElement add=driver.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/div[4]/div/div[1]/div[1]/a"));
		add.click();
		
		

	}

}
