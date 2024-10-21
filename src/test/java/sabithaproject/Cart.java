package sabithaproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Cart {

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
		
		//click cart option
		WebElement cart=driver.findElement(By.linkText("Cart"));
		cart.click();
		
		//proceed checkout
		WebElement proceed =driver.findElement(By.linkText("Proceed To Checkout"));
		proceed.click();
		
		//comment
		driver.findElement(By.name("message")).sendKeys("hii!! I'm majiro sano from Tokyo...");
		//place order
		driver.findElement(By.linkText("Place Order")).click();
		
		//subscripion
		driver.findElement(By.id("susbscribe_email")).sendKeys("mikey.a22@gmail.com");
		driver.findElement(By.id("subscribe")).click();
		
		//payment
	   //Enter name on card
	    driver.findElement(By.name("name_on_card")).sendKeys("Hema");
	    //Enter card no
	    WebElement cardnumber=driver.findElement(By.cssSelector("input[name='card_number']"));
	    cardnumber.sendKeys("895623");
	    //Enter CVV
	    WebElement cvv=driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[3]/div[1]/input"));
	    cvv.sendKeys("563");
	    //Enter month
	    driver.findElement(By.name("expiry_month")).sendKeys("09");
	    //Enter year
	    WebElement year=driver.findElement(By.cssSelector("input[name=\"expiry_year\"]"));
	    year.sendKeys("2030");
	   
	    //click continue
	    driver.findElement(By.tagName("continue-button")).click();
		
		
		
		//home
		WebElement home =driver.findElement(By.xpath("//*[@id=\'cart_items\']/div/div[1]/ol/li[1]/a"));
		home.click();
		
		

	}

}
