package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.nio.file.Paths;

public class BasePage {
    protected WebDriver driver;
    private String baseURL = "https://www.lambdatest.com/selenium-playground/";
    public BasePage() {
        //default constructor
    }
    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    @BeforeClass
    public void setUp() {
        String driverPath = Paths.get("src/main", "resources/", "chromedriver.exe").toString();
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true"); //suppress unnecessary console warnings when executing
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseURL);

    }
    @AfterMethod
    public void tearDown() {driver.close();
    }
}