import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
WebDriver driver;
	
	By username=By.id("email");
	By password=By.id("pass");
	By LoginBtn=By.name("login");
	By Frgtlink=By.linkText("Forgotten password?");
	By logo	= By.xpath("//body/div[@id='u_0_3_yL']/div[@id='globalContainer']/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]");
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	
	
	public HomePage  validatelogin() {
	System.out.println("HI");
		driver.findElement(username).sendKeys("rakeshrakhi");
		driver.findElement(password).sendKeys("rakhi99");
		driver.findElement(LoginBtn).click();
		return new HomePage();
		
	}
	
	
}
