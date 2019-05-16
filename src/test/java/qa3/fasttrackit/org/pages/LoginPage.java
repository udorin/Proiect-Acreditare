package qa3.fasttrackit.org.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa3.fasttrackit.org:8008/my-account")
public class LoginPage extends PageObject {


    @FindBy(css = "#username")
    private WebElementFacade emailField;

    @FindBy(css = "#password")
    private WebElementFacade passField;

   @FindBy(css = "button[value='Login']")
   private WebElementFacade loginButton;

   @FindBy(css = "a[href*='lost-password']")
   private WebElementFacade lostPassword;//link to lost password page

    @FindBy(css = "#reg_email")
    private WebElementFacade emailRegField;//input field for e-mail when you want to register

    @FindBy(css = "#reg_password")
    private WebElementFacade passwordRegField;//input field password when you want to register

    @FindBy(css = "button[value='Register']")
    private WebElementFacade registerButton;//button register




    public void setEmailReg(String email){
        typeInto(emailRegField,email);
    }
    public void setPasswordReg(String password){
        typeInto(passwordRegField,password);
    }
    public void clickRegister(){
        clickOn(registerButton);
    }
public void checkInvalidRegister(){
        element(registerButton).shouldBeVisible();
}

public void checkInvalidRegister1(){
        element(registerButton).shouldNotBeEnabled();
}



   public void setEmailField(String email){
        typeInto(emailField,email);
    }

    public void setPasswordField(String password){
        typeInto(passField,password);
    }

    public void clickLoginButton(){
       clickOn(loginButton);
    }

    public void checkLoginInvalid(){
       element(loginButton).shouldBeVisible();
    }

    public void clickLostPasswordLink(){
       clickOn(lostPassword);
    }




}
