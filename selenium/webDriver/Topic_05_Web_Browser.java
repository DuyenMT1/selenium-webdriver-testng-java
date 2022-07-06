package webDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_05_Web_Browser {
	// Khai báo 
	WebDriver driver;
	WebDriver element;
	
	// Khai báo + Khởi 
	String projectPath = System.getProperty("user.dir");
	String osName = System.getProperty("os.name");

	@BeforeClass
	public void beforeClass() {
		
		if (osName.contains("Mac")) { // Mac
		System.setProperty("webdriver.gecko.driver", projectPath + "/browserDrivers/geckodriver");
		} else { // Windowns
			System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\geckodriver.exe");
		}
		// Khởi 
		driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();		
		
	}

	@Test
	public void TC_01_Browser() {
		// Các hàm tương tác với Browser sẽ thông qua biến driver 
		// Đóng tab/ window đang active
		driver.close(); // **
		
		// Đóng browser
		driver.quit(); // **
		
		// Tìm ra 1 element (single)
		WebElement loginButton = driver.findElement(By.cssSelector("")); // **
		
		// Tim ra nhiều element (multiple) 
		List<WebElement> links = driver.findElements(By.cssSelector("")); // **
		
		// Mở ra Url truyền vao 
		driver.get("https://www.facebook.com/"); // **
		
		// Trả về 1 Url tại page đang view
		String gamePageUrl = driver.getCurrentUrl();
		
		String gamePageTitle = driver.getTitle();
		
		// Source code cua page dang view
		driver.getPageSource();
		
		// Get ra ID of tab dang view/ window dang view/ active (windown/ Tab)
		driver.getWindowHandle(); // one // **
		driver.getWindowHandles(); // all // **
		
		// Get option/interface
		driver.manage().getCookies(); // Cookies (framework) // **
		driver.manage().logs().getAvailableLogTypes(); // logs (framework)
		
		driver.manage().window().fullscreen();
		driver.manage().window().maximize(); // **
		
		// Test GUI (Graphic User Interface)
		// Font/ Size/ Color/ Position/ Location/...
		// High => Functional UI
		// Low => Graphic UI
		driver.manage().window().getPosition();
		driver.manage().window().getSize();
		
		// Wait for element is find in time = xxs (WebDriverWait)
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
		
		// Wait for page load success in time = xxs
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		// Wait for script is inject success into browser/ element in time xxs (JavascriptExecutor)
		driver.manage().timeouts().setScriptTimeout(15, TimeUnit.SECONDS);
		
		// navigation
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().to("https://www.facebook.com/");
		
		// Alert/ Frame(Iframe)/ Windown (Tab)
		driver.switchTo().alert(); // **
		driver.switchTo().frame(0); // **
		driver.switchTo().window(""); // **
		
		//Tips:
		// Action: close/quit/refresh/back/forward/click/select/sendkey... => void 
		// Verify: get data(value) Url/title/text/attribute/... => ko laf void
		// Function getXXX => 100% la Verify (Tru case: driver.get(""))
	}

	@Test
	public void TC_02() {
		// Các hàm tương tác với sẽ thông qua 
		//element.
	}

	@Test
	public void TC_03() {

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
