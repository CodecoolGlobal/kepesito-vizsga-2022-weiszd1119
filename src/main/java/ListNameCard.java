import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListNameCard extends BasePage {
	public ListNameCard(org.openqa.selenium.WebDriver startdriver) {
		super(startdriver);
	}
	
	private final String urlNameCard = "https://demo.seleniumeasy.com/data-list-filter-demo.html";
	
	public void navigate() {
		driver.navigate().to(urlNameCard);
	}
}