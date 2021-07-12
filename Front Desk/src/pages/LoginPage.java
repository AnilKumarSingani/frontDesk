package pages;

import org.openqa.selenium.By;

public class LoginPage {
	String url="https://frontdesk.corp.ojas-it.com/index.php";
	public By userName=By.cssSelector("[placeholder='Username']");
	public By password=By.cssSelector("[name=\"password\"]");
	public By loginButton=By.cssSelector("[name=\"btn_login\"]");
	

}
