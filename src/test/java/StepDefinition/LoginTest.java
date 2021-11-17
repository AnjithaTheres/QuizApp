package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
	WebDriver driver;
	@Given("Open Quiz App")
	public void open_quiz_app() {
		     
		driver = new ChromeDriver();

		 driver.get("http://localhost:4200/login");	
	}

	@When("User enter username")
	public void user_enter_username() {
		
	    driver.findElement(By.id("exampleInputEmail1")).click();
	    driver.findElement(By.id("exampleInputEmail1")).sendKeys("Anjitha");
	   
	    
	}

	@When("user enter password")
	public void user_enter_password() {
		 driver.findElement(By.id("exampleInputPassword1")).click();
		    driver.findElement(By.id("exampleInputPassword1")).sendKeys("Ajnj");
	}

	@When("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.id("exampleCheck1")).click();
	    driver.findElement(By.id("liveAlertBtn")).click();
	    driver.findElement(By.cssSelector(".col-md-6 > .btn")).click();
	    
	}

	@Then("Rediect to home page")
	public void rediect_to_home_page() {
		driver.findElement(By.cssSelector(".btn:nth-child(3)")).click();
	}
}
