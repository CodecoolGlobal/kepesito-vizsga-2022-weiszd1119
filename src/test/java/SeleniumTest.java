import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
public class SeleniumTest {

    /*
    Tölts be a böngészőbe az alábbi oldalt: https://demo.seleniumeasy.com/basic-first-form-demo.html
    Írj tesztesetet két szám összegének ellenőrzésére a mellékelt dokumentumban, majd a tesztlépések alapján írj automatizált tesztet. Az oldalon, a Two Input Fields” szekcióban két beviteli mezőjét töltsd ki tetszőleges számokkal, majd végezd el a számok összeadásának ellenőrzését kiolvasva az oldalon megjelenő összeget.
    Használj tetszőleges tesztadatot
     */
    WebDriver driver;
    @BeforeEach
    public void setup() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--disable-notifications");
		options.addArguments("--disable-extensions");
		// options.addArguments("--headless");
		options.addArguments("--window-size=1920,1080");
		options.addArguments("start-maximized");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
 
	@Test
	public void TestInput() throws InterruptedException {
		TwoInputFields twoInputFields = (TwoInputFields) SiteFactory.Create("TwoInputFields", driver);
		twoInputFields.navigate();
		Thread.sleep(5000);
		twoInputFields.pushClosePopupWindow();
		twoInputFields.writeIntoFirstValueField();
		twoInputFields.writeIntoSecondValueField();
		twoInputFields.pushGetTotalButton();
		// Assertions
		String expectedGetTotalResult = "0";
		String actualGetTotalResult = twoInputFields.currentGetTotalResult();
		Assertions.assertEquals(expectedGetTotalResult, actualGetTotalResult);
    }

    /*
    Töltsd be az alábbi oldalt a böngészőbe: zhttps://demo.seleniumeasy.com/basic-select-dropdown-demo.html
    Írj tesztesetet a mellékelt dokumentumban, majd a tesztlépések alapján írj automatizált tesztet a következők szerint: a Select List Demo szekció lenyíló mezőjében válaszd ki a hét utolsó napját és ellenőrizd, hogy az oldalon helyesen jelenik meg a kiválasztott érték
    Tesztadatként használd az hét utolsó napját
     */
    @Test
	public void SelectDayTest() throws InterruptedException
    {
	    SelectDay selectDay = (SelectDay) SiteFactory.Create("SelectDay", driver);
	    selectDay.navigate();
		Thread.sleep(5000);
	    selectDay.clickSingleDropdownList();
	    selectDay.selectFromSingleList();
	    selectDay.currentDayResult();
	    // Assertions
	    String expectedDayResult = "Day selected :- Sunday";
	    String actualDayResult = selectDay.currentDayResult();
	    Assertions.assertEquals(expectedDayResult, actualDayResult);
    }

    /*
    Töltsd be az alábbi oldalt a böngészőbe: https://demo.seleniumeasy.com/bootstrap-modal-demo.html#
    Írj tesztesetet a mellékelt dokumentumban, majd a tesztlépések alapján írj automatizált tesztet. A tesztesetben ellenőrizd a modal alert ablak szöveges tartalmát összahasonlítva egy általad definiált elvárt eredménnyel. Nyisd meg a Single Modal ablakot, tárolt el az ablakon megjelenő szöveget egy változóba és zárd be az ablakot a bezárás gombbal
     */
    @Test
	public void AlertTest() throws InterruptedException
    {
	    ModalAlert modalAlert = (ModalAlert) SiteFactory.Create("ModalAlert", driver);
	    modalAlert.navigate();
	    Thread.sleep(5000);
	    modalAlert.pushLaunchModalButton();
		modalAlert.pushCloseModalButton();
		// Assertions
	    String expectedAlertResult = "This is the place where the content for the modal dialog displays";
		String actualAlertResult = modalAlert.currentAlertResult();
	    Assertions.assertEquals(expectedAlertResult, actualAlertResult);
    }

    /*
    Töltsd be az alábbi oldalt a böngészőbe: https://demo.seleniumeasy.com/data-list-filter-demo.html
    Írj tesztesetet a mellékelt dokumentumban, majd a tesztlépések alapján írj automatizált tesztet. A teszteset ellenőrizze a névjegykártyák tartalmát.Olvasd ki a neveket a megjelenő névjegykártyákról és ellenőrzésként hasonlítsd össze egy elvárt eredményként megadott listával.
    Használj relatív útvonalat a névjegykártya név elemeinek kiolvasásához.
     */
    @Test
	public void NamecardTest() throws InterruptedException
    {
	    ListNameCard listNameCard = (ListNameCard) SiteFactory.Create("ListNameCard", driver);
	    listNameCard.navigate();
	    Thread.sleep(5000);
    }

    /*
    Töltsd be az alábbi oldalt a böngészőbe: https://demo.seleniumeasy.com/table-data-download-demo.html
    Írj tesztesetet a mellékelt dokumentumban, majd a tesztlépések alapján írj automatizált tesztet. A tesztesetet ellenőrizze a táblázatból a neveket, amelyeket a táblázat első oszlop tartalmaz. Gyűjtsd össze a neveket és tárold le a names.txt fájlba majd a tesztesetben a fájl tartalmát hasonlítsd össze egy elvárt eredménnyel.
     */
    @Test
	public void TableTest()
    {}

}