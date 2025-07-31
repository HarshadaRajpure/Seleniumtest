package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {
public static WebDriver driver;

@Before
public void LaunchBrowser() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/login");
}

@After
public void closeBrowser() {
	System.out.println("Closing browser");
	driver.quit();
}

@BeforeStep
public void beforestep() {
	System.out.println("Im execute before each step");
}

@AfterStep
public void afterStep() {
	System.out.println("Im execute after each step");
}

}
