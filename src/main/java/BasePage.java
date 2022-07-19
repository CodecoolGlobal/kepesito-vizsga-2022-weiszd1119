import org.openqa.selenium.WebDriver;
public class BasePage {
	static org.openqa.selenium.WebDriver driver;
	
	public BasePage(WebDriver startdriver) {
		driver = startdriver;
	}
}