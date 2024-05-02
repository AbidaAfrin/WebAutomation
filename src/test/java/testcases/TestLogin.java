package testcases;

import org.testng.annotations.Test;
import utilities.BrowserSetup;

public class TestLogin extends BrowserSetup {

    @Test

    public void testLogin(){
        System.out.println("Test");
        getBrowser().get("https://rahulshettyacademy.com/AutomationPractice/");

    }

}
