package Week2.Day1.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadInLeaftapsApplication {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Chromes");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nithish");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
		driver.findElement(By.id("createLeadForm_dataSourceId")).sendKeys("Employee");
		driver.findElement(By.id("createLeadForm_marketingCampaignId")).sendKeys("Automotive");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Nithish");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Nithish K");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Test");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("11/11/1999");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Tester");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Engineering");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("3,50,000");
		driver.findElement(By.id("createLeadForm_currencyUomId")).sendKeys("INR - Indian Rupee");
		driver.findElement(By.id("createLeadForm_industryEnumId")).sendKeys("Manufacturing");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("Test11");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Creating The Lead in LeafTaps");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Test");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8637437209");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Tester");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("nithishkumark11@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.google.com");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("No.21,SRS Nagar,Bharathi Nagar");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Old Perungalathur,Chennai");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalCountryGeoId")).sendKeys("India");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("Tamil Nadu");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600063");
		driver.findElement(By.className("smallSubmit")).click();
		String text=driver.findElement(By.id("viewLead_firstNameLocal_sp")).getText();
		System.out.println("The first name is "+text);
		System.out.println("The Title is "+driver.getTitle());
		if(driver.getTitle().contains("View Lead")){
		System.out.println("The title contains View Lead");
		
		}
		else {
			System.out.println("The title does not contain View Lead");
		}
		
	}
}
