package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import baseclass.test;
import utilities.PropertyFile;
import utilities.ReadExcel;

public class TimesheetPage extends test {

	public void clearExistingProjects() {

		int TRtag = driver.findElements(By.tagName("tr")).size();
		System.out.println("size=" + TRtag);
		if (TRtag > 2) {
			for (int i = 0; i < TRtag - 1; i = i + 2) {
				getlocator("action").click();
				String alert = driver.switchTo().alert().getText();
				driver.switchTo().alert().accept();
				System.out.println("projectDeleted = " + alert);
			}
		} else {
			System.out.println("no actions exists");
		}
	}

	public void addProject() {

		WebElement Addproject = driver.findElement(By.xpath(PropertyFile.prop.getProperty("addproject")));
		int Addrow = driver.findElements(By.tagName("tbody")).size();
		System.out.println("Current row number = " + Addrow);
		Addproject.click();
	ReadExcel.wb1.getSheet("Time");
	System.out.println(ReadExcel.sh.getPhysicalNumberOfRows());
	System.out.println(ReadExcel.sh.getSheetName());	

		
//			for(int i=0;i<Addrow+1;i++) {
//		WebElement Addrow1 = driver.findElement(By.xpath("//tbody//tr//td//select"));
//			Select action=new Select(Addrow1);
//			//action.selectByVisibleText("Telliant: Admin");
//			System.out.println(""+action);
//			 //WebElement AddTask1 = driver.findElement(By.xpath("//tbody//tr//td//select//following::select "));	
//			//Select action1=new Select(AddTask1);
//			//action1.selectByVisibleText("Leave");
//			
//			//getlocator("save").click();
//			}
//			int Addrow1 = driver.findElements(By.tagName("tbody")).size();
//			System.out.println("Current row number = "+Addrow);
//			
//			for (int i = 1; i < Addrow; i++)
//			{
//				int numberOfColumn=driver.findElements(By.tagName("td")).size();
//				System.out.println("Number of columns= "+numberOfColumn);
//				for(int j=0;j<numberOfColumn-1;j++) {
//				}
//				}
//			if (i == 3) {
//				getlocator("project3").click();
//				getlocator("task3").click();
//				getlocator("save").click();
//			}
//			if (i == 2) {
//				getlocator("project2").click();
//				getlocator("task2").click();
//				getlocator("save").click();
//			}
//			if (Addrow==1) {
//				getlocator("projectAdmin").click();
//				getlocator("taskLeave").click();
//			}
//		}
//	}
//
//	public void EnterTime() {
//		String NumberOfHours = "2";
//		WebElement notes = getlocator("notes");
//		WebElement savenotes = getlocator("savenotes");
//		int trtag = driver.findElements(By.tagName("tr")).size();
//
//		for (int i = 2; i < trtag - 1; i++) {
//
//			for (int j = 5; j <= 9; j++) {
//
//				WebElement enterHours = driver.findElement(By.xpath("//table[@class='table']//tbody/tr[" + i + "]/td[" + j + "]//input"));
//				enterHours.click();
//				enterHours.clear();
//				enterHours.sendKeys(NumberOfHours);
//				if (i == 2) {
//
//					notes.sendKeys("selenium Session");
//					savenotes.click();
//				} else {
//					notes.sendKeys("automation Session");
//					savenotes.click();
//				}
//			}
//		}
//
//	}
//
//	public static void saveChanges() {
//		WebElement SaveChanges = driver.findElement(By.xpath("//*[@class='fa fa-save pl-20']"));
//		SaveChanges.click();
//
//	}

	}
}
