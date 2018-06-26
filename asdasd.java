import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GithubTest {
  
  WebDriver driver;
  JavascriptExecutor js;
  
  @Test
  public void f() {
	  
      js = (JavascriptExecutor) driver;
      
      js.executeScript("return document.querySelector('body > div.position-relative.js-header-wrapper > header > div > div.HeaderMenu.HeaderMenu--bright.d-lg-flex.flex-justify-between.flex-auto > div > span > div > a:nth-child(1)').click()");
      js.executeScript("return document.querySelector('input#login_field').value = 'himanshuqa4490'");
      js.executeScript("return document.querySelector('input#password').value = 'himanshuqa4490'");
      js.executeScript("return document.querySelector('input.btn.btn-primary.btn-block').click()");
      
      
  }
  
  @BeforeClass
  public void afterClass() {
	  System.setProperty("webdriver.chrome.driver", "/home/himanshuchaudhary/Downloads/chromedriver");
      driver = new ChromeDriver();
      driver.get("https://github.com/");
      driver.manage().window().maximize();
  }

  @AfterClass
  public void afterTest() throws InterruptedException {
      Thread.sleep(2000);
	  driver.close();
  }
}
