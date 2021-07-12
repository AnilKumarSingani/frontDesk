package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;

public class Login  {
	WebDriver driver;
	LoginPage login=new LoginPage();	
	public void fdLogin(WebDriver driver) {
		driver.findElement(login.userName).sendKeys("Admin");
		driver.findElement(login.password).sendKeys("Ojas@1525");
		driver.findElement(login.loginButton).click();
	}
}

