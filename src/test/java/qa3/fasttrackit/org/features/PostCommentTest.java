package qa3.fasttrackit.org.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import qa3.fasttrackit.org.steps.CommentSteps;
import utils.Utils;

@RunWith(SerenityRunner.class)
public class PostCommentTest {

    @Managed(uniqueSession = true)
    private WebDriver webDriver;


    @Steps
    private CommentSteps commentSteps;

    @Test
    public void tryPostCommentWithoutEmail_AuthorName_Website(){
        commentSteps.navigateToBlogPage();
        commentSteps.writeCommentIntoCommentField(Utils.generateRandomString(10)+ "  " + Utils.generateRandomString(10));
        commentSteps.clickPostCommentButton();
        commentSteps.checkPostCommentWasFailed("ERROR");
    }
    @Test
    public void tryPostCommentWithoutEmail_AuthorName(){
        commentSteps.navigateToBlogPage();
        commentSteps.writeCommentIntoCommentField(Utils.generateRandomString(15));
        commentSteps.writeAuthorWebsite(Utils.generateRandomString(9));
        commentSteps.clickPostCommentButton();
        commentSteps.checkPostCommentWasFailed("ERROR");

    }
    @Test
    public void tryPostCommentWithoutEmail(){
        commentSteps.navigateToBlogPage();
        commentSteps.writeCommentIntoCommentField(Utils.generateRandomString(5) + " " + Utils.generateRandomString(10));
        commentSteps.writeAuthorName(Utils.generateRandomString(5));
        commentSteps.writeAuthorWebsite(Utils.generateRandomString(10));
        commentSteps.clickPostCommentButton();
        commentSteps.checkPostCommentWasFailed("ERROR");
    }

    @Test
    public void tryPostCommentWithInvalidEmail(){
        commentSteps.navigateToBlogPage();
        commentSteps.writeCommentIntoCommentField(Utils.generateRandomString(10));
        commentSteps.writeAuthorName(Utils.generateRandomString(5));
        commentSteps.writeAuthorEmail(Utils.generateRandomString(6));
        commentSteps.writeAuthorWebsite(Utils.generateRandomString(5));
        commentSteps.clickPostCommentButton();
        commentSteps.checkPostCommentWasFailed("ERROR");

    }

    @Test
    public void tryPostCommentWithValidCredentials(){
        commentSteps.navigateToBlogPage();
        commentSteps.writeCommentIntoCommentField(Utils.generateRandomString(10));
        commentSteps.writeAuthorName("test");
        commentSteps.writeAuthorEmail(Utils.email);
        commentSteps.writeAuthorWebsite(Utils.generateRandomString(9));
        commentSteps.clickPostCommentButton();
        commentSteps.checkPostCommentWasSuccessfully("test");

    }


}
