package qa3.fasttrackit.org.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import qa3.fasttrackit.org.steps.CommentSteps;

@RunWith(SerenityRunner.class)
public class PostCommentTest {

    @Managed(uniqueSession = true)
    private WebDriver webDriver;


    @Steps
    private CommentSteps commentSteps;

    @Test
    public void tryPostCommentWithoutEmail_AuthorName_Website(){
        commentSteps.navigateToBlogPage();
        commentSteps.writeCommentIntoCommentField("hello, i dont like this product");
        commentSteps.clickPostCommentButton();
        commentSteps.checkPostCommentWasFailed("ERROR");
    }
    @Test
    public void tryPostCommentWithoutEmail_AuthorName(){
        commentSteps.navigateToBlogPage();
        commentSteps.writeCommentIntoCommentField("Hello, there");
        commentSteps.writeAuthorWebsite("www.test.com");
        commentSteps.clickPostCommentButton();
        commentSteps.checkPostCommentWasFailed("ERROR");

    }
    @Test
    public void tryPostCommentWithoutEmail(){
        commentSteps.navigateToBlogPage();
        commentSteps.writeCommentIntoCommentField("hi there");
        commentSteps.writeAuthorName("test");
        commentSteps.writeAuthorWebsite("www.test.com");
        commentSteps.clickPostCommentButton();
        commentSteps.checkPostCommentWasFailed("ERROR");
    }

    @Test
    public void tryPostCommentWithInvalidEmail(){
        commentSteps.navigateToBlogPage();
        commentSteps.writeCommentIntoCommentField("hi there");
        commentSteps.writeAuthorName("test");
        commentSteps.writeAuthorEmail("testtest.com");
        commentSteps.writeAuthorWebsite("www.test.com");
        commentSteps.clickPostCommentButton();
        commentSteps.checkPostCommentWasFailed("ERROR");

    }

    @Test
    public void tryPostCommentWithValidCredentials(){
        commentSteps.navigateToBlogPage();
        commentSteps.writeCommentIntoCommentField("hi there");
        commentSteps.writeAuthorName("test");
        commentSteps.writeAuthorEmail("test@test.com");
        commentSteps.writeAuthorWebsite("www.test.com");
        commentSteps.clickPostCommentButton();
        commentSteps.checkPostCommentWasSuccessfully("test");

    }


}
