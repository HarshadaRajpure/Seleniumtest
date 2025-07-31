package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoStepDefination {
	WebDriver driver = Hooks.driver;

	@Given("User is on login page")
	public void user_is_on_login_page() {
		driver.findElement(By.className("ico-login")).click();
	}

//@When("user enter valid email and password")
//public void user_enter_valid_email_and_password() {
//   driver.findElement(By.id("Email")).sendKeys("reqs12@gmail.com");
//   driver.findElement(By.id("Password")).sendKeys("abcdef");
//   driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
//
//}

	@When("user enter valid username as {string} and password  as {string}")
	public void user_enter_valid_username_as_and_password_as(String username, String password) {
		driver.findElement(By.id("Email")).sendKeys("reqs12@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("abcdef");
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
	}

	@Then("user redirected to homepage")
	public void user_redirected_to_homepage() {

		boolean isLoggedin = driver.findElement(By.className("account")).isDisplayed();
		if (isLoggedin) {
			System.out.println("Login Succesful");
		} else {
			System.out.println("login failed");
		}

	}
}