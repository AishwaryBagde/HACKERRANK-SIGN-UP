package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.JavascriptExecutor;
//Selenium Imports
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
///


public class TestCases {
    ChromeDriver driver;
    public TestCases()
    {
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    
    public  void testCase01()throws InterruptedException{
        System.out.println("Start Test case: testCase01");
        

        // Launch Chrome :
        // Load URL  https://www.hackerrank.com/auth/signup
        driver.get("https://www.hackerrank.com/auth/signup");
        // Wait for 30 seconds  
        Thread.sleep(3000);
        // Enter first Name and Last Name  in the Text Field Using Locator "ID":"input-1"
        driver.findElementById("input-1").sendKeys("Test HackerRank");
        Thread.sleep(500);
        // Enter Email in the mail text box Using Locator "ID" "input-2"
        driver.findElementById("input-2").sendKeys("TTeesttHakkeRRank@kruay.com");
        Thread.sleep(500);
        // Enter Password in the pass text box Using Locator "ID" "input-3"
        driver.findElementById("input-3").sendKeys("Test HackerRank");
        Thread.sleep(500);
        // Click on checkbox Using Locator "Class" Name "checkbox-input"
        driver.findElementByClassName("checkbox-input").click();
        // Wait for 3 sec  
        Thread.sleep(1000);
        // Click on Create an account button Using Locator "XPath" "//span[contains(text(),'Create An Account')]"
        driver.findElementByXPath("//span[contains(text(),'Create An Account')]").click();
        Thread.sleep(6000);

        // On Page 2 Step 1 - Select "Prepare for Job Interviews" Using Locator "XPath" "//span[contains(text(),'Prepare for Job Interviews')]/ .."
        driver.findElementByXPath("//span[contains(text(),'Prepare for Job Interviews')]/ ..").click();
        Thread.sleep(3000);
        // On Page 2 Step 2 - Select "Working Professional" Using Locator "XPath" "//span[contains(text(),'Working Professional')]/ .."
        driver.findElementByXPath("//span[contains(text(),'Working Professional')]/ ..").click();
        Thread.sleep(3000);
        // On Page 2 Step 3 - Click on "Select Options" Dropdown to open dropdown Using Locator "XPath" "//div[contains(text(),'Select Option')]/ .."
        driver.findElementByXPath("//div[contains(text(),'Select Option')]/ ..").click();
        Thread.sleep(500);
        //Select dropdown value - "1 year" Using Locator "XPath" "//div[contains(text(),'1 year')]"
        driver.findElementByXPath("//div[contains(text(),'1 year')]").click();
        Thread.sleep(500);
        // On Page 2 Step 4 - Select "a week" Using Locator "XPath" "//span[contains(text(),'a week')]/ .."
        driver.findElementByXPath("//span[contains(text(),'a week')]/ ..").click();
        // Wait for 3 sec  
        Thread.sleep(3000);
        // Click on Lets go button Using Locator "XPath" "//span[@class='ui-text']/ .. /.."
        driver.findElementByXPath("//span[@class='ui-text']/ .. /..").click();
        // Wait for 4 sec  
        Thread.sleep(4000);
        // click on pop up - Introducing dark mode select - "Not now" Using Locator "XPath" "//span[contains(text(),'Not Now')]"
        driver.findElementByXPath("//span[contains(text(),'Not Now')]").click();
        Thread.sleep(3000);
        // Scroll up   
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-1250)");
        Thread.sleep(3000);
        // Validate that user Logged In By returning The Username Using Locator "XPath" "//div[@class='dropdown profile-menu theme-m-content']"
        WebElement username = driver.findElementByXPath("//div[@class='dropdown profile-menu theme-m-content']");
          if(username.isDisplayed()){
            System.out.println("Sign Up and Login Succesfull");
            System.out.println("The UserName is : "+ username.getText());
        }
        
    }


}
