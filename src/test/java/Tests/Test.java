package Tests;

import Pgaes.Page;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Test {

    public static WebDriver driver;
    //Logger logger = Logger.getLogger(Test.class);
    //DOMConfigurator.configure("log4j.xml")
    //PropertiesConfigurator.configure("log4j.properties")

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\dev\\Desktop\\chromedriver-win64");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @org.testng.annotations.Test
    public void test1(){
        Page page = new Page(driver);
        page.actions("standard_user","secret_sauce");

        System.out.println("Working Working Jenkins is Working1");
        System.out.println("Working Working Jenkins is Working2");
        System.out.println("Working Working Jenkins is Working3");

        //logger.info("Validation");
       String actualTitle = driver.getTitle();
       String expectedTitle = "Swag Labs";

        Assert.assertEquals( expectedTitle, actualTitle);
        System.out.println("Title matched");
    }

    @org.testng.annotations.Test
    public void test2(){
        Page page = new Page(driver);
        page.actions("standard_user","secret_sauce");

        System.out.println("Working Working Jenkins is Working1");
        System.out.println("Working Working Jenkins is Working2");
        System.out.println("Working Working Jenkins is Working3");

        //logger.info("Validation");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Swag Labs";

        Assert.assertEquals( expectedTitle, actualTitle);

    }

    @AfterClass
    public void destroy(){

        driver.quit();
    }
}
