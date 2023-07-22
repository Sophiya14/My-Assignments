package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sophiya");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Joseph");
        driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sophi");
        driver.findElement(By.name("departmentName")).sendKeys("Testing");
        driver.findElement(By.name("description")).sendKeys("selenium");
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sofiyajoseph14@gmail.com");
        WebElement drop=driver.findElement(By.name("generalStateProvinceGeoId"));
        Select op=new Select(drop);
        op.selectByVisibleText("New York");
        driver.findElement(By.className("smallSubmit")).click();
        
        driver.findElement(By.linkText("Edit")).click();
        driver.findElement(By.name("description")).clear();
        driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Learn good");
        driver.findElement(By.name("submitButton")).click();
        
        
        
        
	}

}
