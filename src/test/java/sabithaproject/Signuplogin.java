package sabithaproject;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Signuplogin {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//click-->signup button
		WebElement login=driver.findElement(By.xpath("//*[@id=\'header\']/div/div/div/div[2]/div/ul/li[4]/a"));
		login.click();
		
		//name-->signup page
		WebElement name=driver.findElement(By.name("name"));
		name.clear();
		name.sendKeys("takemichi");
		
		//email-->signup page
	    WebElement email=driver.findElement(By.xpath("//*[@id=\'form\']/div/div/div[3]/div/form/input[3]"));
		email.clear();
		email.sendKeys("takemichi12@gmail.com");
		
		//signup button-->signup page
		WebElement signup= driver.findElement(By.xpath("//*[@id=\'form\']/div/div/div[3]/div/form/button"));
		signup.click();		
		
		//title-->account page(password)
		WebElement pass=driver.findElement(By.id("password"));
		pass.clear();
		pass.sendKeys("Sabi12@");
		
		//title-->selecting radio button(gender)
		WebElement id=driver.findElement(By.id("uniform-id_gender1"));
		id.click();
		
		//title-->selecting the date
		WebElement drpdate=driver.findElement(By.id("days"));
		Select date=new Select(drpdate);
		date.selectByValue("2");
		
		//title-->selecting the month
		WebElement drpmonth=driver.findElement(By.id("months"));
		Select month=new Select(drpmonth);
		month.selectByVisibleText("March");
		
		//title-->selecting the year
		WebElement drpyear=driver.findElement(By.id("years"));
		Select year=new Select(drpyear);
		year.selectByValue("2004");
		
		//selecting the checkbox1
		WebElement checkbox= driver.findElement(By.xpath("//*[@id=\'newsletter\']"));
		checkbox.click();
		boolean result = checkbox.isSelected();
        //selecting the checkbox2
		WebElement checkboxs= driver.findElement(By.xpath("//*[@id=\'optin\']"));
		checkboxs.click();
		boolean status = checkboxs.isSelected();
		
		//address information
		//firstname
		WebElement firstname=driver.findElement(By.id("first_name"));
		firstname.sendKeys("mikey");
		
		//lastname
		WebElement lastname=driver.findElement(By.id("last_name"));
		lastname.sendKeys("manjiro");
		
		//company name
		WebElement company=driver.findElement(By.id("company"));
		company.sendKeys("congruent solution");
		
		//address1
		WebElement address=driver.findElement(By.id("address1"));
		address.sendKeys("krishna nagar");
		
		//address2
		WebElement addresss=driver.findElement(By.id("address2"));
		addresss.sendKeys("porur");
		
		//selecting country
		WebElement countrys=driver.findElement(By.id("country"));
		Select country=new Select(countrys);
		country.selectByVisibleText("Canada");
		
		//state
		WebElement state=driver.findElement(By.id("state"));
		state.sendKeys("Tamil nadu");
		
		//city
		WebElement city=driver.findElement(By.id("city"));
		city.sendKeys("chennai");
		
		//zipcode
		WebElement zipcode=driver.findElement(By.id("zipcode"));
		zipcode.sendKeys("600116");
		
		//mobile number
		WebElement phonenumber=driver.findElement(By.id("mobile_number"));
		phonenumber.sendKeys("7904537782");
		
		//button-->create account
		WebElement ca= driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button"));
		ca.click();		
		
		//button-->click continue
		//WebElement cont= driver.findElement(By.linkText("Continue"));
		//cont.click();		
		
		
		

		
		
		
		
		
		
		
				
		

		   
		

	}

}
