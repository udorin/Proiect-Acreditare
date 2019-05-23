package qa3.fasttrackit.org.steps;

import net.thucydides.core.annotations.Step;
import qa3.fasttrackit.org.pages.CheckOutPage;
import qa3.fasttrackit.org.pages.Homepage;
import qa3.fasttrackit.org.pages.ShopPage;

public class CheckoutSteps {





    private CheckOutPage checkOutPage;


    @Step
    public void setFirstName(String name){
        checkOutPage.setFirstName(name);
    }
    @Step
    public void setLastName(String lastName){
        checkOutPage.setLastName(lastName);
    }
    @Step
    public void setAddress(String address ){
        checkOutPage.setAdress(address);
    }
    @Step
    public void setZipCode(String zipCode){
        checkOutPage.setZipCode(zipCode);
    }
    @Step
    public void setPhoneNumber(String phone){
        checkOutPage.setPhone(phone);
    }
    @Step
    public void setEmail(String email){
        checkOutPage.setEmail(email);
    }
    @Step
    public void clickPlaceOrderButton(){
        checkOutPage.clickPlaceOrderButton();
    }
    @Step
    public void checkCheckoutWasSuccesfully(){
        checkOutPage.checkCheckout();
    }
    @Step
    public void checkCheckoutFailed(){
        checkOutPage.errorCheckout();
    }




}
