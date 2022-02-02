package websteps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Webtesting {
    WebDriver driver;
	
	@Given("User must be on homepage by url {string}")
	public void user_must_be_on_homepage_by_url(String string) {
	    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    driver=new ChromeDriver ();
	    driver.get(string);
	    
	}

	@When("User click on signup button")
	public void user_click_on_signup_button() {
	    driver.findElement(By.id("signin2")).click();
	}

	@Then("Signup dialog box should be displayed")
	public void signup_dialog_box_should_be_displayed() {
	    driver.findElement(By.className("modal-header")).isDisplayed();
	    
	}

	@Then("User must write username")
	public void user_must_write_username() {
	   driver.findElement(By.id("sign-username")).sendKeys("akshargajjar1812@gmail.com");
	   
	}

	@Then("User must write Password")
	public void user_must_write_password() {
	   driver.findElement(By.id("sign-password")).sendKeys("123456");
	}

	@Then("User must click on signup button")
	public void User_must_click_on_signup_button() {
	   driver.findElement(By.className("btn btn-primary")).click();
	}

	@Then("User must click OK on signup successful dialogbox")
	public void user_must_click_ok_on_signup_successful_dialogbox() {
	    driver.switchTo().alert().accept();
	}

	@When("User click on login button")
	public void User_click_on_login_button() {
	    driver.findElement(By.id("login2")).click();
	}

	@Then("Login dialogbox should be displayed")
	public void login_dialogbox_should_be_displayed() {
	    driver.findElement(By.id("logInModalLabel")).isDisplayed();
	}

	@Then("User must write valid username")
	public void user_must_write_valid_username() {
	    driver.findElement(By.id("loginusername")).sendKeys("akshargajjar1812@gmail.com");
	}

	@Then("User must write valid password")
	public void user_must_write_valid_password() {
	    driver.findElement(By.id("loginpassword")).sendKeys("123456");
	}

	@Then("User must click on login button")
	public void User_must_click_on_login_button() {
	    driver.findElement(By.className("btn btn-primary")).click();
	}

	@When("User must click on laptops")
	public void user_must_click_on_laptops() {
		driver.get("https://www.demoblaze.com/prod.html?idp_=15");
	    driver.findElement(By.id("itemc")).click();
	}

	@Then("User must click on laptop")
	public void user_must_click_on_laptop() {
	    driver.findElement(By.cssSelector("#tbodyid > div:nth-child(4) > div > div > h4 > a")).click();
	}

	@Then("User must navigate on separate page of laptop by url {string}")
	public void user_must_navigate_on_separate_page_of_laptop_by_url(String string) {
	    driver.get(string);
	}

	@Given("User must be on page by url {string}")
	public void user_must_be_on_page_by_url(String string) {
	    driver.get("https://www.demoblaze.com/prod.html?idp_=15");
	    driver.findElement(By.cssSelector("#tbodyid > h2")).isDisplayed();
	}

	@When("User must click on Addtocart button")
	public void user_must_click_on_addtocart_button() {
	    driver.findElement(By.cssSelector("#tbodyid > div.row > div > a")).click();
	}

	@Then("Product added dialogbox should be displayed")
	public void product_added_dialogbox_should_be_displayed() {
	    driver.switchTo().alert().accept();
	}

	@When("User must click on cart button")
	public void user_must_click_on_cart_button() {
	    driver.findElement(By.className("nav-link")).click();
	}

	@Then("User must be navigate on page by url {string}")
	public void user_must_be_navigate_on_page_by_url(String string) {
	    driver.get(string);
	}

	@When("User must click on placeorder button")
	public void user_must_click_on_placeorder_button() {
	    driver.findElement(By.className("btn btn-success")).click();
	}

	@Then("Place order dialog box should be displayed")
	public void place_order_dialog_box_should_be_displayed() {
	    driver.findElement(By.id("orderModalLabel")).isDisplayed();
	    driver.close();
	}
	
	
	
	
}
