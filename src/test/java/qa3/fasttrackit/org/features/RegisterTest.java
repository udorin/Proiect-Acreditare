package qa3.fasttrackit.org.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import qa3.fasttrackit.org.steps.RegisterSteps;
import utils.Utils;

@RunWith(SerenityRunner.class)
public class RegisterTest {

    @Managed(uniqueSession = true)
    private WebDriver webDriver;

    @Steps
     private RegisterSteps registerSteps;

    @Test
    public void RegisterWithInvalidEmailAddress(){
        registerSteps.goToRegisterPage();
        registerSteps.setEmailAddress(Utils.generateRandomString(5));
        registerSteps.setPassword(Utils.password);
        registerSteps.clickRegisterButton();
        registerSteps.checkInvalidRegister();
    }
    @Test
    public void RegisterWithInvalidCredentials(){
        registerSteps.goToRegisterPage();
        registerSteps.setEmailAddress(Utils.generateRandomString(10));
        registerSteps.setPassword(Utils.generateRandomString(10));
        registerSteps.checkInvalidRegister1();
    }
    @Test
    public void RegisterWithInvalidPassword(){
        registerSteps.goToRegisterPage();
        registerSteps.setEmailAddress("udorin73@test111.com");
        registerSteps.setPassword(Utils.generateRandomString(6));
        registerSteps.checkInvalidRegister1();
    }
    @Test
    public void RegisterWithValidCredentials(){
        registerSteps.goToRegisterPage();
        registerSteps.setEmailAddress("udorin73@test111.com");
        registerSteps.setPassword(Utils.password);
       registerSteps.clickRegisterButton();
       registerSteps.checkValidRegister();
    }

    @Test
    public void RegisterWithAccountAlreadyExistent(){
        registerSteps.goToRegisterPage();
        registerSteps.setEmailAddress(Utils.email);
        registerSteps.setPassword(Utils.password);
        registerSteps.clickRegisterButton();
        registerSteps.checkInvalidRegister();
    }




}
