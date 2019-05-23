package qa3.fasttrackit.org.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import qa3.fasttrackit.org.pages.Homepage;
import qa3.fasttrackit.org.pages.LoginPage;
import qa3.fasttrackit.org.pages.ShopPage;
import qa3.fasttrackit.org.steps.CheckoutSteps;
import qa3.fasttrackit.org.steps.LoginSteps;
import utils.Utils;

@RunWith(SerenityRunner.class)
public class CheckoutTest {

    @Managed(uniqueSession = false)
    private WebDriver webDriver;

    @Steps
    private CheckoutSteps checkoutSteps;
    @Steps
    private Homepage homepage;
    @Steps
    private ShopPage shopPage;
    @Steps
    private LoginSteps loginSteps;


    @Test
    public void placeOrderWithoutSettingCredentials(){
        homepage.open();
        homepage.clickShop();
        shopPage.clickAddToCart();
        homepage.clickCheckout();
        checkoutSteps.clickPlaceOrderButton();
        checkoutSteps.checkPlaceOrderFailed();
    }
    @Test
    public void placeOrderUsingOnlyFirstName(){
        homepage.open();
        homepage.clickShop();
        shopPage.clickAddToCart();
        homepage.clickCheckout();
        checkoutSteps.setFirstName(Utils.generateRandomString(5));
        checkoutSteps.clickPlaceOrderButton();
        checkoutSteps.checkPlaceOrderFailed();


    }
    @Test
    public void placeOrrderUsingOnlyLastName(){
        homepage.open();
        homepage.clickShop();
        shopPage.clickAddToCart();
        homepage.clickCheckout();
        checkoutSteps.setLastName(Utils.generateRandomString(5));
        checkoutSteps.clickPlaceOrderButton();
        checkoutSteps.checkPlaceOrderFailed();

    }
    @Test
    public void placeOrderUsingOnlyAddress(){
        homepage.open();
        homepage.clickShop();
        shopPage.clickAddToCart();
        homepage.clickCheckout();
        checkoutSteps.setAddress(Utils.generateRandomString(10));
        checkoutSteps.clickPlaceOrderButton();
        checkoutSteps.checkPlaceOrderFailed();
    }
    @Test
    public void placeOrderUsingOnlyCityName(){
        homepage.open();
        homepage.clickShop();
        shopPage.clickAddToCart();
        homepage.clickCheckout();
        checkoutSteps.setCityName(Utils.generateRandomString(10));
        checkoutSteps.clickPlaceOrderButton();
        checkoutSteps.checkPlaceOrderFailed();
    }
    @Test
    public void placeOrderUsingOnlyZipCode(){
        homepage.open();
        homepage.clickShop();
        shopPage.clickAddToCart();
        homepage.clickCheckout();
        checkoutSteps.setZipCode(Utils.generateRandomString(5));
        checkoutSteps.clickPlaceOrderButton();
        checkoutSteps.checkPlaceOrderFailed();
    }
    @Test
    public void placeOrderUsingOnlyEmail(){
        homepage.open();
        homepage.clickShop();
        shopPage.clickAddToCart();
        homepage.clickCheckout();
        checkoutSteps.setEmail(Utils.generateRandomString(5));
        checkoutSteps.clickPlaceOrderButton();
        checkoutSteps.checkPlaceOrderFailed();
    }

    @Test
    public void placeOrderUsingOnlyPhoneNumber(){
        homepage.open();
        homepage.clickShop();
        shopPage.clickAddToCart();
        homepage.clickCheckout();
        checkoutSteps.setPhoneNumber(Utils.generateRandomString(10));
        checkoutSteps.clickPlaceOrderButton();
        checkoutSteps.checkPlaceOrderFailed();
    }

    @Test
    public void placeOrderUsingFirstNameAndLastName(){
        homepage.open();
        homepage.clickShop();
        shopPage.clickAddToCart();
        homepage.clickCheckout();
        checkoutSteps.setFirstName(Utils.generateRandomString(5));
        checkoutSteps.setLastName(Utils.generateRandomString(7));
        checkoutSteps.clickPlaceOrderButton();
        checkoutSteps.checkPlaceOrderFailed();
    }
    @Test
    public void placeOrderUsingFirstNameAndAdress(){
        homepage.open();
        homepage.clickShop();
        shopPage.clickAddToCart();
        homepage.clickCheckout();
        checkoutSteps.setFirstName(Utils.generateRandomString(5));
        checkoutSteps.setAddress(Utils.generateRandomString(7));
        checkoutSteps.clickPlaceOrderButton();
        checkoutSteps.checkPlaceOrderFailed();

    }
    @Test
    public void placeOrderUsingFirstNameAndCityName(){
        homepage.open();
        homepage.clickShop();
        shopPage.clickAddToCart();
        homepage.clickCheckout();
        checkoutSteps.setFirstName(Utils.generateRandomString(5));
        checkoutSteps.setCityName(Utils.generateRandomString(7));
        checkoutSteps.clickPlaceOrderButton();
        checkoutSteps.checkPlaceOrderFailed();
    }
    @Test
    public void placeOrderUsingFirstNameAndZipCode(){
        homepage.open();
        homepage.clickShop();
        shopPage.clickAddToCart();
        homepage.clickCheckout();
        checkoutSteps.setFirstName(Utils.generateRandomString(5));
        checkoutSteps.setZipCode(Utils.generateRandomString(4));
        checkoutSteps.clickPlaceOrderButton();
        checkoutSteps.checkPlaceOrderFailed();
    }
    @Test
    public void placeOrderUsingfirstNameAndPhoneNumber(){
        homepage.open();
        homepage.clickShop();
        shopPage.clickAddToCart();
        homepage.clickCheckout();
        checkoutSteps.setFirstName(Utils.generateRandomString(5));
        checkoutSteps.setPhoneNumber(Utils.generateRandomString(7));
        checkoutSteps.clickPlaceOrderButton();
        checkoutSteps.checkPlaceOrderFailed();
    }

    @Test
    public void placeOrderUsingFirstNameAndEmail(){
        homepage.open();
        homepage.clickShop();
        shopPage.clickAddToCart();
        homepage.clickCheckout();
        checkoutSteps.setFirstName(Utils.generateRandomString(5));
        checkoutSteps.setEmail(Utils.email);
        checkoutSteps.clickPlaceOrderButton();
        checkoutSteps.checkPlaceOrderFailed();
    }
    @Test
    public void placeOrderUsingLastNameAndAddress(){
        homepage.open();
        homepage.clickShop();
        shopPage.clickAddToCart();
        homepage.clickCheckout();
        checkoutSteps.setLastName(Utils.generateRandomString(5));
        checkoutSteps.setAddress(Utils.generateRandomString(7));
        checkoutSteps.clickPlaceOrderButton();
        checkoutSteps.checkPlaceOrderFailed();
    }
    @Test
    public void placeOrderUsingLastNameAndCityName(){
        homepage.open();
        homepage.clickShop();
        shopPage.clickAddToCart();
        homepage.clickCheckout();
        checkoutSteps.setLastName(Utils.generateRandomString(5));
        checkoutSteps.setCityName(Utils.generateRandomString(7));
        checkoutSteps.clickPlaceOrderButton();
        checkoutSteps.checkPlaceOrderFailed();

    }
    @Test
    public void placeOrderUsingLastNameAndZipCode(){
        homepage.open();
        homepage.clickShop();
        shopPage.clickAddToCart();
        homepage.clickCheckout();
        checkoutSteps.setLastName(Utils.generateRandomString(5));
        checkoutSteps.setZipCode(Utils.generateRandomString(7));
        checkoutSteps.clickPlaceOrderButton();
        checkoutSteps.checkPlaceOrderFailed();
    }
    @Test
    public void placeOrderUsingLastNameAndPhoneNumber(){
        homepage.open();
        homepage.clickShop();
        shopPage.clickAddToCart();
        homepage.clickCheckout();
        checkoutSteps.setLastName(Utils.generateRandomString(5));
        checkoutSteps.setPhoneNumber(Utils.generateRandomString(10));
        checkoutSteps.clickPlaceOrderButton();
        checkoutSteps.checkPlaceOrderFailed();
    }
    @Test
    public void placeOrdearUsingLastNameAndEmail(){
        homepage.open();
        homepage.clickShop();
        shopPage.clickAddToCart();
        homepage.clickCheckout();
        checkoutSteps.setLastName(Utils.generateRandomString(5));
        checkoutSteps.setEmail(Utils.email);
        checkoutSteps.clickPlaceOrderButton();
        checkoutSteps.checkPlaceOrderFailed();
    }

    @Test
    public void placeOrderUsingAddressAndCity(){
        homepage.open();
        homepage.clickShop();
        shopPage.clickAddToCart();
        homepage.clickCheckout();
        checkoutSteps.setAddress(Utils.generateRandomString(5));
        checkoutSteps.setCityName(Utils.generateRandomString(6));
        checkoutSteps.clickPlaceOrderButton();
        checkoutSteps.checkPlaceOrderFailed();
    }

    @Test

    public void placeOrderUsingAddressAndZipCode(){
        homepage.open();
        homepage.clickShop();
        shopPage.clickAddToCart();
        homepage.clickCheckout();
        checkoutSteps.setAddress(Utils.generateRandomString(5));
        checkoutSteps.setZipCode(Utils.generateRandomString(6));
        checkoutSteps.clickPlaceOrderButton();
        checkoutSteps.checkPlaceOrderFailed();

    }
    @Test
    public void placeOrderUsingAddressAndPhoneNumber(){
        homepage.open();
        homepage.clickShop();
        shopPage.clickAddToCart();
        homepage.clickCheckout();
        checkoutSteps.setAddress(Utils.generateRandomString(5));
        checkoutSteps.setPhoneNumber(Utils.generateRandomString(10));
        checkoutSteps.clickPlaceOrderButton();
        checkoutSteps.checkPlaceOrderFailed();
    }

    @Test
    public void placeOrderUsingAddressAndEmail(){
        homepage.open();
        homepage.clickShop();
        shopPage.clickAddToCart();
        homepage.clickCheckout();
        checkoutSteps.setAddress(Utils.generateRandomString(5));
        checkoutSteps.setEmail(Utils.generateRandomString(6));
        checkoutSteps.clickPlaceOrderButton();
        checkoutSteps.checkPlaceOrderFailed();
    }
    @Test
    public void placeOrderUsingCityAndZipCode(){
        homepage.open();
        homepage.clickShop();
        shopPage.clickAddToCart();
        homepage.clickCheckout();
        checkoutSteps.setCityName(Utils.generateRandomString(5));
        checkoutSteps.setZipCode(Utils.generateRandomString(6));
        checkoutSteps.clickPlaceOrderButton();
        checkoutSteps.checkPlaceOrderFailed();
    }

    @Test
    public void placeOrderUsingCityAndPhoneNumber(){
        homepage.open();
        homepage.clickShop();
        shopPage.clickAddToCart();
        homepage.clickCheckout();
        checkoutSteps.setCityName(Utils.generateRandomString(5));
        checkoutSteps.setPhoneNumber(Utils.generateRandomString(6));
        checkoutSteps.clickPlaceOrderButton();
        checkoutSteps.checkPlaceOrderFailed();
    }
    @Test
    public void placeOrderUsingCityAndEmail(){
        homepage.open();
        homepage.clickShop();
        shopPage.clickAddToCart();
        homepage.clickCheckout();
        checkoutSteps.setCityName(Utils.generateRandomString(5));
        checkoutSteps.setEmail(Utils.email);
        checkoutSteps.clickPlaceOrderButton();
        checkoutSteps.checkPlaceOrderFailed();
    }
    @Test
    public void placeOrderUsingZipCodeAndPhoneNumber(){
        homepage.open();
        homepage.clickShop();
        shopPage.clickAddToCart();
        homepage.clickCheckout();
        checkoutSteps.setZipCode(Utils.generateRandomString(5));
        checkoutSteps.setPhoneNumber(Utils.generateRandomString(6));
        checkoutSteps.clickPlaceOrderButton();
        checkoutSteps.checkPlaceOrderFailed();
    }
    @Test
    public void placeOrderUsingZipCodeAndEmail(){
        homepage.open();
        homepage.clickShop();
        shopPage.clickAddToCart();
        homepage.clickCheckout();
        checkoutSteps.setZipCode(Utils.generateRandomString(5));
        checkoutSteps.setEmail(Utils.email);
        checkoutSteps.clickPlaceOrderButton();
        checkoutSteps.checkPlaceOrderFailed();
    }

    @Test
    public void placeOrderUsingPhoneNumberAndEmail(){
        homepage.open();
        homepage.clickShop();
        shopPage.clickAddToCart();
        homepage.clickCheckout();
        checkoutSteps.setPhoneNumber(Utils.generateRandomString(5));
        checkoutSteps.setEmail(Utils.email);
        checkoutSteps.clickPlaceOrderButton();
        checkoutSteps.checkPlaceOrderFailed();
    }

    @Test
    public void placeOrderUsingUserAccount(){
        homepage.open();
        homepage.clickSignInLink();
        loginSteps.setAccountCredentials(Utils.email,Utils.password);
        loginSteps.clickLoginButton();
        homepage.clickShop();
        shopPage.clickAddToCart();
        homepage.clickCheckout();
        checkoutSteps.clickPlaceOrderButton();
        checkoutSteps.checkPlaceOrderFailed();

    }
    @Test
    public void placeOrderSettingAllCredentials(){
        homepage.open();
        homepage.clickShop();
        shopPage.clickAddToCart();
        homepage.clickCheckout();
        checkoutSteps.setFirstName(Utils.generateRandomString(6));
        checkoutSteps.setLastName(Utils.generateRandomString(8));
        checkoutSteps.setAddress(Utils.generateRandomString(10));
        checkoutSteps.setCityName(Utils.generateRandomString(5));
        checkoutSteps.setZipCode(Utils.generateRandomString(6));
        checkoutSteps.setPhoneNumber(("0757112345"));
        checkoutSteps.setEmail(Utils.email);
        checkoutSteps.clickPlaceOrderButton();
        checkoutSteps.checkPlaceOrderWasSuccesfully();




    }

}
