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




}
