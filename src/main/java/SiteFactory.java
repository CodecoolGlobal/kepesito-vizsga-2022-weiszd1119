import org.openqa.selenium.WebDriver;

public class SiteFactory {
	public static BasePage Create(String name, WebDriver driver) {
		switch (name) {
			case "TwoInputFields":
				return new TwoInputFields(driver);
			default:
				return null;
		}
	}
}