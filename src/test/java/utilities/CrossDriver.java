package utilities;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.time.Duration;get init

public class CrossDriver {

    WebDriver driver ;
    DesiredCapabilities capabilities = new DesiredCapabilities();

    public WebDriver remoteDriverChromeOptions(){
       // url may be different, please check the url when you run command prompt
        try {
            driver = new RemoteWebDriver(new URL(ConfigReader.getProperty("url")),new ChromeOptions());
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
        }catch (Exception e){
            System.out.println("Remote Driver Not Found "+e.getMessage());
        }
        return driver;
    }

    public WebDriver remoteDriverFirefoxOptions(){
        try {
            driver = new RemoteWebDriver(new URL(ConfigReader.getProperty("url")),new FirefoxOptions());
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
        }catch (Exception e){
            System.out.println("Remote Driver Not Found "+e.getMessage());
        }
        return driver;
    }

    public WebDriver remoteDriverEdgeOptions(){
        try {
            driver = new RemoteWebDriver(new URL(ConfigReader.getProperty("url")),new EdgeOptions());
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
        }catch (Exception e){
            System.out.println("Remote Driver Not Found "+e.getMessage());
        }
        return driver;
    }

    public WebDriver setUpRemoteChromeDriver(){
        try {
            capabilities.setPlatform(Platform.WINDOWS);
            capabilities.setBrowserName(ConfigReader.getProperty("browser"));
            capabilities.setVersion(ConfigReader.getProperty("version"));
            ChromeOptions options = new ChromeOptions();
            options.merge(capabilities);
            driver = new RemoteWebDriver(new URL(ConfigReader.getProperty("url")),options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();

        }catch (Exception e){
            System.out.println("Driver not found "+e.getMessage());
        }
        return driver;
    }






}
