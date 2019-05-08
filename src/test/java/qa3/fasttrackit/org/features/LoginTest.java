package qa3.fasttrackit.org.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import qa3.fasttrackit.org.steps.LoginSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    LoginSteps loginSteps;

   @Test
    public void checkLoginWithInvalidCredentials(){
       loginSteps.navigateToLoginPage();
       loginSteps.setAccountCredentials("dorin@gmail.com","12345");
       loginSteps.clickLoginButton();
       loginSteps.checkLoginInvalid();
   }
   @Test
    public void checkLoginWithInvalidPassword(){
       loginSteps.navigateToLoginPage();
       loginSteps.setAccountCredentials("udorin73@gmail.com","test");
       loginSteps.clickLoginButton();
       loginSteps.checkLoginInvalid();
   }
   @Test
    public void checkLoginWithInvalidEmail(){
       loginSteps.navigateToLoginPage();
       loginSteps.setAccountCredentials("udorin73@gmail.org","nokia1234567890!");
       loginSteps.clickLoginButton();
       loginSteps.checkLoginInvalid();

   }
    @Test
    public void checkLoginWithValidCredentials(){
        loginSteps.navigateToLoginPage();
        loginSteps.setAccountCredentials("udorin73@gmail.com","nokia1234567890!");
        loginSteps.clickLoginButton();
        loginSteps.checkUserIsLoginInSuccesfully();
    }

}
