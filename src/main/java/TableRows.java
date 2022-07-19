import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TableRows extends BasePage {
	public TableRows(org.openqa.selenium.WebDriver startdriver) {
		super(startdriver);
	}
	
	private final String urlTableRows = "https://demo.seleniumeasy.com/table-data-download-demo.html";
	
	public void navigate() {
		driver.navigate().to(urlTableRows);
	}
}