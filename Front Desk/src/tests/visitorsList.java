package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.DashboardPage;
import pages.LoginPage;
import pages.VisitorsListPage;
import utils.Login;

public class visitorsList {
	WebDriver driver;
	Login login = new Login();
	DashboardPage dashboard = new DashboardPage();
	VisitorsListPage visitorListPage=new VisitorsListPage();

	@BeforeTest
	public void openBrowser() throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://frontdesk.corp.ojas-it.com/index.php");
		driver.findElement(By.xpath("/html/body/div/div[2]/button[3]")).click();
		driver.findElement(By.xpath("//a[text()='Proceed to frontdesk.corp.ojas-it.com (unsafe)']")).click();
		driver.manage().window().maximize();
	}

	@Test
	public void loginToApplication() throws Exception {
		login.fdLogin(driver);
		String ActualTitle = driver.getTitle();
		Assert.assertEquals("Ojas FrontDesk", ActualTitle, "Navigated to Home Page");

	}

	@Test
	public void visitorSearch() throws Exception {
		driver.findElement(dashboard.userListDropDown).click();
		driver.findElement(dashboard.visitorsList).click();
		driver.findElement(visitorListPage.searchBoxinput).sendKeys("Ragula Raju");

	}

}
