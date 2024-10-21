package sabithaproject;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Loginpage {

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
		
		//clicking the product menu
		/*WebElement product=driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a/i"));
		product.click();
		
		//search
		driver.findElement(By.cssSelector("input#search_product")).sendKeys("SAREE");
		
		//click the search button
		WebElement search=driver.findElement(By.cssSelector("button[type='button']"));
		search.click();
		
		//clicking view product
		WebElement viewproduct=driver.findElement(By.linkText("View Product"));
		viewproduct.click();
		
		//add to cart
		WebElement addcart=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button"));
		addcart.click();
		
		//view cart
		//WebElement viewcart=driver.findElement(By.linkText("View Cart"));
		//viewcart.click();
		
		//continue shopping
		WebElement continueshopping=driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button"));
		continueshopping.click();*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
