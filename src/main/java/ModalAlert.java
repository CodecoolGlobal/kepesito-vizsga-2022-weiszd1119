import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModalAlert extends BasePage{
	public ModalAlert(WebDriver startdriver) {
		super(startdriver);
	}
	
	private final String urlModalAlert = "https://demo.seleniumeasy.com/bootstrap-modal-demo.html";
	
	private final By findLaunchModalButton = By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/div/div[2]/a");
	
	private final By findCloseModalButton = By.xpath("//*[@id=\"myModal0\"]/div/div/div[4]/a[1]");
	
	public void navigate() {
		driver.navigate().to(urlModalAlert);
	}
	
	public void pushLaunchModalButton() {
		driver.findElement(findLaunchModalButton).click();
	}
	
	public void pushCloseModalButton() {
		driver.findElement(findCloseModalButton).click();
	}
	
	public String currentAlertResult() {
		String currentAlertResult = driver.findElement(By.xpath("//*[@id=\"myModal0\"]/div/div/div[3]")).getText();
		return currentAlertResult;
	}
}