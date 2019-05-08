package qa3.fasttrackit.org.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;


public class MyAccountPage extends PageObject {

    @FindBy(css = " li a[href*='customer']")
    private WebElementFacade logOutButton;


    public void clickOnLogOutButton(){
        clickOn(logOutButton);
    }
    public void checkLogin(){
        element(logOutButton).shouldBeVisible();
    }



}
