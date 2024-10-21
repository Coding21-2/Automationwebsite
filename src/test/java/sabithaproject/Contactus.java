package sabithaproject;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Contactus {

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
		
		//contact us
		driver.findElement(By.linkText("Contact us")).click();
		//name
		driver.findElement(By.name("name")).sendKeys("takemichi");
		//email
		driver.findElement(By.name("email")).sendKeys("takemichi.a221@gmail.com");
		//subject
		driver.findElement(By.name("subject")).sendKeys("takemichi information");
		//message
		driver.findElement(By.name("message")).sendKeys(" Mikey is that most of his carefree nature consists of his mischievousness, laziness, and child-like demeanor.");
		//file upload
		driver.findElement(By.name("upload_file")).sendKeys("C:\\automate\\file2.txt");
		if(driver.findElement(By.name("upload_file")).getText().equals("file2.txt"))
		{
			System.out.println("File is sucessfully uploaded");
		}
		else
		{
			System.out.println("Upload failed.");
		}
		//submit button
		driver.findElement(By.xpath("//*[@id=\'contact-us-form\']/div[6]/input")).click();
		//pop-up
	    Alert popup=driver.switchTo().alert();
	    popup.accept();
	      
	      //home page
	    driver.findElement(By.xpath("//*[@id=\"form-section\"]/a")).click();
	    
	    
	    


		
		

	}

}
