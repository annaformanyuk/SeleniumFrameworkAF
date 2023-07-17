package TestCasesAF;

import org.testng.annotations.Test;
import pageobjects.SignInPage;

public class lesson5part1Test extends BaseTest{

    @Test
    public void JobTitleValuesOnSignIn(){
        homePage.clickSignUp();
        signUpPage.JobTitleDropdown();
    }
}
