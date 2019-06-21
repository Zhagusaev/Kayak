//package Tests;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//
//import java.util.concurrent.TimeUnit;
//
//public class TestBase {
//
//    static public  WebDriver driver;
//
//    @BeforeClass
//    public static void setUp(){
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//    }
//
//
//
//
//    @AfterClass
//    public static void tearDown()throws Exception{
//        Thread.sleep(5000);
//        driver.quit();
//    }
//}
