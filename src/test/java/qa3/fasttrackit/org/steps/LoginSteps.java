package qa3.fasttrackit.org.steps;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import qa3.fasttrackit.org.pages.Homepage;
import qa3.fasttrackit.org.pages.LoginPage;
import qa3.fasttrackit.org.pages.MyAccountPage;

public class LoginSteps {

     private Homepage homepage;
     private LoginPage loginPage;
     private MyAccountPage myAccountPage;

    @Step
    public void navigateToLoginPage(){
        loginPage.open();
    }

    @Step
    public void setAccountCredentials(String email,String password){
        loginPage.setEmailField(email);
        loginPage.setPasswordField(password);

    }
    @Step
    public void clickLoginButton(){
        loginPage.clickLoginButton();
    }
    @Step
    public void checkLoginInvalid(){
        loginPage.checkLoginInvalid();

    }
    @Step
    public void checkUserIsLoginInSuccesfully(){
        myAccountPage.checkLogin();
    }
}
