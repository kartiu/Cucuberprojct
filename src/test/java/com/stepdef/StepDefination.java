package com.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefination 
{
	public static WebDriver driver;

	@Given("user launch the broswer")
	public void user_launch_the_broswer() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@When("User on the login page")
	public void user_on_the_login_page() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println(driver.getTitle());
	}
	@When("User Enter the username as {string}")
	public void user_enter_the_username_as(String uname) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys(uname);
		

	}
	@When("User Enter the password as {string}")
	public void user_enter_the_password_as(String pwd) {
		driver.findElement(By.name("password")).sendKeys(pwd);
	
	}
	@When("user click on the login button")
	public void user_click_on_the_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	}
	@Then("user should navigative to the dashboard page")
	public void user_should_navigative_to_the_dashboard_page() {
	System.out.println("u r dashboard page");
	}



	


}
