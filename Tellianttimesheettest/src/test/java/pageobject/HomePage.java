package pageobject;

import baseclass.test;

public class HomePage extends test {
	public void clickOnViewTimesheetLink() {

		getlocator("viewtimesheet").click();
	}

	public String validateViewTimeSheetpage() {
		String Currenturl = driver.getCurrentUrl();
		return Currenturl;

	}

}