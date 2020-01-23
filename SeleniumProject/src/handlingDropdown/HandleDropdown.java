package handlingDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {

	public static void main(String[] args) {
		
		String key="webdriver.chrome.driver";
		String value="./exefiles/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-form");
		WebElement drpDwn=driver.findElement(By.id("continents"));
		Select sel=new Select(drpDwn);
		sel.selectByVisibleText("North America");
		List<WebElement> allOption=sel.getOptions();
		int count=allOption.size();
		System.out.println(count);
		
		
	}

}
