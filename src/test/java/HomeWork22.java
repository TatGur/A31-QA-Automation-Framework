import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class HomeWork22 extends BaseTest {
    @Test
    public void renamePlaylist() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        loginPage.logIn();
        homePage.choosePlaylist();
        homePage.conTextClick();
        homePage.newName();
        Assert.assertTrue(homePage.checkPlayList());
    }
}


