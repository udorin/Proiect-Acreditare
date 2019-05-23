package qa3.fasttrackit.org.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import qa3.fasttrackit.org.steps.LoginSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import utils.Utils;

@RunWith(SerenityRunner.class)
public class LoginTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private LoginSteps loginSteps;

   @Test
    public void checkLoginWithInvalidCredentials(){
       loginSteps.navigateToLoginPage();
       loginSteps.setAccountCredentials(Utils.generateRandomString(10),Utils.generateRandomString(10));
       loginSteps.clickLoginButton();
       loginSteps.checkLoginInvalid();
   }
   @Test
    public void checkLoginWithInvalidPassword(){
       loginSteps.navigateToLoginPage();
       loginSteps.setAccountCredentials(Utils.email,Utils.generateRandomString(6));
       loginSteps.clickLoginButton();
       loginSteps.checkLoginInvalid();
   }
   @Test
    public void checkLoginWithInvalidEmail(){
       loginSteps.navigateToLoginPage();
       loginSteps.setAccountCredentials(Utils.generateRandomString(12),Utils.password);
       loginSteps.clickLoginButton();
       loginSteps.checkLoginInvalid();

   }
    @Test
    public void checkLoginWithValidCredentials(){
        loginSteps.navigateToLoginPage();
        loginSteps.setAccountCredentials(Utils.email,Utils.password);
        loginSteps.clickLoginButton();
        loginSteps.checkUserIsLoginInSuccesfully();
    }

    @Test
    public void checkLoginWithoutCredentials(){

       loginSteps.navigateToLoginPage();
       loginSteps.clickLoginButton();
       loginSteps.checkLoginInvalid();
    }

}
