import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
public class SelectDay extends BasePage{
	public SelectDay(WebDriver startdriver) {
		super(startdriver);
	}
	
	private final String urlSelectDay = "https://demo.seleniumeasy.com/basic-select-dropdown-demo.html";
	
	private final By findDropdownList = By.id("select-demo");
	
	//Metódusok
	
	public void navigate() {
		driver.navigate().to(urlSelectDay);
	}
	
	public void clickSingleDropdownList() {
		driver.findElement(findDropdownList).click();
	}
	
	public void selectFromSingleList() {
		Select itemSelect = new Select(driver.findElement(findDropdownList));
		itemSelect.selectByIndex(1);
	}
	
	public String currentDayResult() {
		String currentDayResult = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/p[2]")).getText();
		return currentDayResult;
	}
}