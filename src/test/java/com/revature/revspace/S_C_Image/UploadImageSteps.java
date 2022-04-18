package com.revature.revspace.S_C_Image;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadImageSteps {

	
String browserName ="edge";
	
	WebDriver driver;

		@Given("the browser is open")
		public void the_browser_is_open() {
			System.out.println("#Step - browser is open");
			if (browserName.equals("edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			} else if (browserName.equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				
			}}
		@Given("the user is on login page")
		public void the_user_is_on_login_page() {
			System.out.println("#Step - user is on login page");
			driver.manage().window().maximize();
			driver.get("http://localhost:4200/");
			
			assertTrue(driver.findElement(By.id("email")).isDisplayed());
		}
		@When("the user enters username and password")
		public void the_user_enters_username_and_password() {
			System.out.println("#Step - user enters username and password");
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("atano@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Atano123");
		}
		@When("the user clicks on login button")
		public void the_user_clicks_on_login_button() {
			System.out.println("#Step - user clicks on login button");
			driver.findElement(By.xpath("//*[@id=\"login\"]")).click();		
		}

		@Then("the user is navigated to the postfeed page")
		public void the_user_is_navigated_to_the_postfeed_page() {
			assertTrue(driver.findElement(By.xpath("//*[@id=\"contents_wrapper\"]")).isDisplayed());
			System.out.println("#Step - user is navigated to postfee page");
		}
	
		@When("the user clicks Hello Ahsoka Tano")
		public void the_user_press_Hello_Ahsoka_Tano() {
			System.out.println("#Step - user clicks on Hello Ahsoka Tano ");
			driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div[3]")).click();
		}

		@When("the user clicks profile")
		public void the_user_clicks_profile() {
			System.out.println("#Step - user clicks on profile ");
			driver.findElement(By.xpath("//*[@id=\"profile\"]")).click();
		}
		@Then("the user is navigated to editprofile")
		public void the_user_is_navigated_to_editprofile() {
			assertTrue(driver.findElement(By.id("edit")).isDisplayed());
			System.out.println("#Step - user is navigated to editprofile");
		}
		
		@When("the user clicks on pencil icon")
		public void the_user_clicks_on_pencil_icon() {
			System.out.println("#Step - user clicks on pencil icon");
			driver.findElement(By.xpath("//*[@id=\"edit_profile\"]")).click();		
		}

		@Then("the user clicks on update image")
		public void the_user_clicks_on_update_image() {
			System.out.println("#Step - user clicks on update image");
			driver.findElement(By.xpath("//*[@id=\"edit-user-image-input\"]")).sendKeys("https://i.ibb.co/SnvkWCd/a.jpg");
			driver.findElement(By.name("edit-user-accept-changes-button")).click();
		}
		
		
	}

/*

@When("the user clicks top right button")
		public void the_user_clicks_top_right_button() {
			System.out.println("#Step - user clicks top right buttom");
			driver.findElement(By.id("//*[@id=\"contents_wrapper\"]/nav")).click();	
		
		}
		@Then("the user is navigated to expanded drop")
		public void the_user_is_navigated_to_expanded_drop() {
			assertTrue(driver.findElement(By.xpath("menubar")).isDisplayed());
			System.out.println("#Step - user is navigated to expanded drop");
		}
*/