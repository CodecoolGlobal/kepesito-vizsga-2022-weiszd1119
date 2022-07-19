import org.openqa.selenium.WebDriver;

public class SiteFactory {
	public static BasePage Create(String name, WebDriver driver) {
		switch (name) {
			case "TwoInputFields":
				return new TwoInputFields(driver);
			case "SelectDay":
				return new SelectDay(driver);
			case "ModalAlert":
				return new ModalAlert(driver);
			default:
				return null;
		}
	}
}