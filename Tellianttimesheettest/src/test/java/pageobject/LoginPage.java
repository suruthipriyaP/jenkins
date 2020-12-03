
package pageobject;

import org.openqa.selenium.WebElement;

import baseclass.test;

public class LoginPage extends test {

	public void Clickloginlink() {

		getlocator("login").click();
	}
	public String validateLoginScreen() {
		String LoggedInUser= getlocator("LogedInUser").getText();
		return LoggedInUser;
		
	}
	public void enterUserName(String Myusername) {
		WebElement username = getlocator("username");
		username.click();
		username.clear();
		username.sendKeys(Myusername);
	}

	public void enterPassword(String Mypassword) {
		WebElement password = getlocator("password");
		password.click();
		password.clear();
		password.sendKeys(Mypassword);
	}

	public void submitLogin() {
		getlocator("loginsubmit").click();

	}

}
