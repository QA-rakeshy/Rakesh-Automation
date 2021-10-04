import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

	public WebDriver driver;
	LoginPage lp;
	HomePage hp;
	
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
	driver=new ChromeDriver();
	lp=new LoginPage(driver);
		driver.get("https://www.facebook.com/");
	}
	
	
	
	@Test
	public void Verifylog() {
						
	hp=	lp.validatelogin();}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		
	}
	
}
