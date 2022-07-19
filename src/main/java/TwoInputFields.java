import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class TwoInputFields extends BasePage{
	public TwoInputFields(WebDriver startdriver) {
		super(startdriver);
	}
	
	// Stringek definiálása
	
	private final String urlTwoInput = "https://demo.seleniumeasy.com/basic-first-form-demo.html";
	
	private final String inputFirstField = "1119";
	
	private final String inputSecondField = "-1119";
	
	//Mezők, gombok keresése
	
	private final By findFirstValueField = By.id("sum1");
	
	private final By findSecondValueField = By.id("sum2");
	
	private final By findGetTotalButton = By.xpath("//*[@id=\"gettotal\"]/button");
	
	private final By findPopupWindowCloseButton = By.id("at-cv-lightbox-close");
	
	//Metódusok
	
	//Url címre ugrás
	
	public void navigate() {
		driver.navigate().to(urlTwoInput);
	}
	
	//Mezőbe írás
	
	public void writeIntoFirstValueField() {
		driver.findElement(findFirstValueField).sendKeys(inputFirstField);
	}
	
	public void writeIntoSecondValueField() {
		driver.findElement(findSecondValueField).sendKeys(inputSecondField);
	}
	
	//Gombok lenyomása
	
	public void pushClosePopupWindow() {
		driver.findElement(findPopupWindowCloseButton).click();
	}
	public void pushGetTotalButton() {
		driver.findElement(findGetTotalButton).click();
	}
	
	//Eredmény ellenőrzése
	
	public String currentGetTotalResult() {
		String currentGetTotalResult = driver.findElement(By.id("displayvalue")).getText();
		return currentGetTotalResult;
	}
}