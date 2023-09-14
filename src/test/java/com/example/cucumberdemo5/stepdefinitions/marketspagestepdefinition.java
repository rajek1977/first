package com.example.cucumberdemo5.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.example.cucumberdemo5.App;
import com.example.cucumberdemo5.utils.TestContextSetup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class marketspagestepdefinition {

	App app=new App();
//	WebDriver driver=new ChromeDriver();
	
	TestContextSetup testContextSetup;
	
	
	
	public marketspagestepdefinition(TestContextSetup testContextSetup) {
	super();
	this.testContextSetup = testContextSetup;
}
	By newsTab=By.xpath("/html/body/div[5]/ul/li[2]/a");
	By moneyIcon=By.cssSelector("body > div.logobar > div > div.cell.topicons > a.moneyicon.relative");

	
//	@Given("user is on the home page")
//	public void user_is_on_the_home_page() {
//	    // Write code here that turns the phrase above into concrete actions
//		
//		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		driver.get("https://www.rediff.com/");
//		System.out.println("User is on home page");
////	    throw new io.cucumber.java.PendingException();
//	}
//	@Then("user click on news tab")
//	public void user_click_on_news_tab() {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(newsTab).click();
//		System.out.println("User clicks on news tab");
//	    //throw new io.cucumber.java.PendingException();
//	}
//	@Then("list of news is displayed")
//	public void list_of_news_is_displayed() {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("List of news is displayed");
//		//throw new io.cucumber.java.PendingException();
//	}
	@Given("user clicks on Money icon")
	public void user_clicks_on_money_icon() {
	    // Write code here that turns the phrase above into concrete actions
		testContextSetup.driver.findElement(moneyIcon).click();
		System.out.println("User clicks on money icon");
		//throw new io.cucumber.java.PendingException();
	}
	@Then("user is taken to the Markets page")
	public void user_is_taken_to_the_markets_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Markets page is displayed to user");
		//throw new io.cucumber.java.PendingException();
	}
}
