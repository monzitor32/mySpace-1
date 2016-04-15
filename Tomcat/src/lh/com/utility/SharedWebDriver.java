package lh.com.utility;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.concurrent.TimeUnit;

/**
 * Created by MCS on 23/10/2015.
 * web driver class
 */
public class SharedWebDriver {

    private WebDriver driver;

    public WebDriver get() {
        if (driver == null) {
            /**
             * normal setup
             */
            DesiredCapabilities dc = new DesiredCapabilities();
            dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
            dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);


            ProfilesIni profile = new ProfilesIni();
            FirefoxProfile myprofile = profile.getProfile("test");
            myprofile.setAcceptUntrustedCertificates(true);
            myprofile.setAssumeUntrustedCertificateIssuer(true);
            dc.setCapability(FirefoxDriver.PROFILE, myprofile);
            driver = new FirefoxDriver(dc);//local
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//local

            //grid
//            dc.setBrowserName("firefox");
//            dc.setCapability(CapabilityType.PLATFORM, "LINUX");
//            try {
//                driver = new RemoteWebDriver(new URL("http://10.37.10.201:4444/wd/hub"), dc);
//            } catch (MalformedURLException e) {
//                driver.quit();`
//                e.printStackTrace();
//            }

        }
        return driver;
    }

    public void clear() {
       driver.quit();//grid
       driver = null;
    }
}
