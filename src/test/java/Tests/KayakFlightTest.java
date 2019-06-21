package Tests;

import Pages.KayakFlightPage;
import Utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class KayakFlightTest{

    KayakFlightPage page = new KayakFlightPage();
    WebDriver driver= Driver.getDriver();

@Test
    public void test1()throws Exception{
    driver.get("https://www.kayak.com/");
//    page.flightFromBox.click();
//    Thread.sleep(3000);

    page.flightFromBox.click();
    page.flightFromBoxTwo.sendKeys(Keys.BACK_SPACE);
    Thread.sleep(1000);

    page.flightFromBoxTwo.sendKeys("New York");
    page.flightFromBoxTwo.sendKeys(Keys.ENTER);
    Thread.sleep(3000);


    page.flightToBox.click();
    Thread.sleep(1000);
    page.flightToBoxTwo.sendKeys("Los Angeles");
    page.flightFromBoxTwo.sendKeys(Keys.ENTER);

}
}
