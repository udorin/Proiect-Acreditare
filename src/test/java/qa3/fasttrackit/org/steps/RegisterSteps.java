package qa3.fasttrackit.org.steps;

import net.thucydides.core.annotations.Step;
import qa3.fasttrackit.org.pages.LoginPage;
import qa3.fasttrackit.org.pages.MyAccountPage;

public class RegisterSteps {
    LoginPage loginPage;
    MyAccountPage myAccountPage;


    @Step
    public void goToRegisterPage(){
        loginPage.open();
    }
    @Step
    public void setEmailAddress(String email){
        loginPage.setEmailReg(email);
    }
    @Step
    public void setPassword(String password){
        loginPage.setPasswordReg(password);
    }
    @Step
    public void clickRegisterButton(){
        loginPage.clickRegister();
    }
    @Step
    public void checkInvalidRegister(){
        loginPage.checkInvalidRegister();
    }
    @Step
    public void checkValidRegister(){
        myAccountPage.checkLogin();
    }
    @Step
    public void checkInvalidRegister1(){
        loginPage.checkInvalidRegister1();
    }
}
