package qa3.fasttrackit.org.steps;

import net.thucydides.core.annotations.Step;
import qa3.fasttrackit.org.pages.Homepage;
import qa3.fasttrackit.org.pages.LoginPage;
import qa3.fasttrackit.org.pages.MyAccountPage;

public class LoginSteps {

    Homepage homepage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;

    @Step
    public void navigateToHomepage(){
        homepage.open();
    }

    @Step
    public void goToLoginPage(){
        homepage.clickMyAccount();
        homepage.clickLoginLink();
    }

    @Step
    public void loginUser(String email, String password){
        loginPage.setEmailField(email);
        loginPage.setPassField(password);
        loginPage.clickLoginButton();
    }

    @Step
    public void checkUserIsLoggedIn(){
        myAccountPage.checkLoggedIn("asdasda asdasd");
    }

    @Step
    public void checkUserNotLoggedIn(){
        loginPage.checkErrorMessage();
    }

    @Step
    public void userStillOnLoginPage(){
        loginPage.checkUserIsOnLoginPage();
    }

}
