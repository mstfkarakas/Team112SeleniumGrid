package tests;

import org.testng.annotations.Test;
import utilities.CrossDriver;

public class SeleniumGrid01 {

    CrossDriver crossDriver = new CrossDriver();

    @Test
    public void chromeTest01(){
        crossDriver.remoteDriverChromeOptions().get("https://www.amazon.com");
    }
    @Test
    public void chromeTest02(){
        crossDriver.remoteDriverChromeOptions().get("https://www.amazon.com");
    }

    @Test
    public void chromeTest03(){
        crossDriver.remoteDriverChromeOptions().get("https://www.amazon.com");
    }
    @Test
    public void chromeTest04(){
        crossDriver.setUpRemoteChromeDriver().get("https://www.amazon.com");
    }

    @Test
    public void firefoxTest01(){
        crossDriver.remoteDriverFirefoxOptions().get("https://www.amazon.com");
    }

    @Test
    public void firefoxTest02(){
        crossDriver.remoteDriverFirefoxOptions().get("https://www.amazon.com");
    }

    @Test
    public void firefoxTest03(){
        crossDriver.remoteDriverFirefoxOptions().get("https://www.amazon.com");
    }

    @Test
    public void edgeTest01(){
        crossDriver.remoteDriverEdgeOptions().get("https://www.amazon.com");
    }
    @Test
    public void edgeTest02(){
        crossDriver.remoteDriverEdgeOptions().get("https://www.amazon.com");
    }



}
