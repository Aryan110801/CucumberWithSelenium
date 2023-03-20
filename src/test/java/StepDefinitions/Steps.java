package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Steps {
    WebDriver driver = new ChromeDriver();

    @Given("Open Google Chrome and launch the application")
    public void openGoogleChromeAndLaunchTheApplication() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Aryan.Pandey\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/v4");
    }

    @When("User Enters Username and Password")
    public void userEntersUsernameAndPassword() {
        driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("username12");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password12");
    }

    @Then("Reset the credentials")
    public void resetTheCredentials() {
        driver.findElement(By.xpath("//input[@name='btnReset']")).click();
        driver.quit();
    }
}
