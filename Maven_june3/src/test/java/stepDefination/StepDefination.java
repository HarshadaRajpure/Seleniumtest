package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	WebDriver driver;
	

	@Given("user is on login page")
	public void user_is_on_login_page() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
	}

	@When("user enters valid username as {string} and password as  {string}")
	public void user_enters_valid_username_as_and_password_as(String un, String pass) throws InterruptedException {
		driver.findElement(By.id("Email")).sendKeys(un);
		driver.findElement(By.id("Password")).sendKeys(pass);
		Thread.sleep(2000);
		
	}

	@When("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
	}

	@Then("user should lang on homepage")
	public void user_should_lang_on_homepage() {
		
		String ExpectedTitle="Demo Web Shop";
		String actualTitle=driver.getTitle();
		
		if(ExpectedTitle.equals(actualTitle)) {
			System.out.println("You Naviageted to homepage");
		}
		else {
			System.out.println("Check credentials");
		}
	}

}
