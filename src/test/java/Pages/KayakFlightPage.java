package Pages;

//import Tests.TestBase;
//import Utilities.Driver;
import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class KayakFlightPage{

WebDriver driver;

public KayakFlightPage() {
        driver = Driver.getDriver();
    PageFactory.initElements(driver, this);
}

    @FindBy(xpath = "(//div[@data-placeholder='From?'])[1]")
    public WebElement flightFromBox;

    @FindBy(xpath = "(//div/input[@name='origin'])[1]")
    public WebElement flightFromBoxTwo;

    @FindBy(xpath = "(//div[@data-placeholder='To?'])[1]")
    public WebElement flightToBox;

    @FindBy(xpath = "(//div/input[@name='destination'])[1]")
    public WebElement flightToBoxTwo;



}


