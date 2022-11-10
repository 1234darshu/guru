package defination4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class guru_defination {
	  String url="https://demo.guru99.com/test/newtours/";
	WebDriver driver;
	
	@Given("I should go to the login page")
	public void i_should_go_to_the_login_page() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get(url);
	}
	@When("Enter the username {string}")
	public void enter_the_username(String string) {
		
		driver.findElement(By.xpath("//*[@name='userName']")).sendKeys(string);
	    
	}
	@And("Enter the password {string}")
	public void enter_the_password(String string) {
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys(string);
		   
	}
	@And("Click on the login button")
	public void click_on_the_login_button() {
		driver.findElement(By.xpath("//*[@name='submit']")).click();
	    
	}
	@Then("I should see title as {string}")
	public void i_should_see_title_as(String string) {
		String s= driver.getTitle();
		 Assert.assertEquals(string,s);
		  driver.close();
	    
	}
}
