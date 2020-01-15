package SeleniumDeloitteDemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		driver.get("https://www.makemytrip.com/flights/?gclid=EAIaIQobChMI94KjgIKF5wIVlYePCh0CBwtzEAAYASAAEgJvLvD_BwE&cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|Expanded|162031058804&s_kwcid=AL!1631!3!162031058804!e!!g!!make%20my%20trip&ef_id=EAIaIQobChMI94KjgIKF5wIVlYePCh0CBwtzEAAYASAAEgJvLvD_BwE:G:s");
		// to maximize the window
		driver.manage().window().maximize();

		// finding the element using the locator
	/*	driver.findElement(By.name("session_key")).sendKeys("Alphonsa");
		driver.findElement(By.name("session_password")).sendKeys("Alphonsa123");*/
		
		
		
		/*to click on sign in button of a page
		known as locators*/
		driver.findElement(By.cssSelector("#SW > div.landingContainer > div.makeFlex.hrtlCenter.prependTop5.appendBottom40 > ul > li.makeFlex.hrtlCenter.font10.makeRelative.lhUser")).click();
		
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("alphonsavb@gmail.com");
	//	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("alphonsa23");
		driver.findElement(By.cssSelector("#SW > div.landingContainer > div.headerOuter > div.modal.displayBlock.modalLogin.dynHeight.personal > section > form > div.btnContainer.appendBottom25 > button")).click();
	}


}
