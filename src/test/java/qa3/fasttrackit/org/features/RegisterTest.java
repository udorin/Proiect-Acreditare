package qa3.fasttrackit.org.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import qa3.fasttrackit.org.steps.RegisterSteps;

@RunWith(SerenityRunner.class)
public class RegisterTest {

    @Managed(uniqueSession = true)
    private WebDriver webDriver;

    @Steps
    RegisterSteps registerSteps;

    @Test
    public void RegisterWithInvalidEmailAddress(){
        registerSteps.goToRegisterPage();
        registerSteps.setEmailAddress("udorin");
        registerSteps.setPassword("nokia1234567890!");
        registerSteps.clickRegisterButton();
        registerSteps.checkInvalidRegister();
    }
    @Test
    public void RegisterWithInvalidCredentials(){
        registerSteps.goToRegisterPage();
        registerSteps.setEmailAddress("udorin");
        registerSteps.setPassword("nokia123!");
        registerSteps.checkInvalidRegister1();
    }
    @Test
    public void RegisterWithInvalidPassword(){
        registerSteps.goToRegisterPage();
        registerSteps.setEmailAddress("udorin73@test1.com");
        registerSteps.setPassword("nokia123!");
        registerSteps.checkInvalidRegister1();
    }
    @Test
    public void RegisterWithValidCredentials(){
        registerSteps.goToRegisterPage();
        registerSteps.setEmailAddress("udorin73@test1.com");
        registerSteps.setPassword("nokia1234567890!");
       registerSteps.clickRegisterButton();
       registerSteps.checkValidRegister();
    }




}
