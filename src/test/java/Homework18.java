import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;




public class Homework18 extends BaseTest{

    @Test
 public void PlayaSong(){

        provideEmail("demo@class.com");
        providePassword("te$t$tudent");
        clickSubmit();
        playsong();
        isSongPlaying();

 }
public void playsong(){
    WebElement PlayNextButton = driver.findElement(By.xpath("//*[@title='Play next song']"));
    WebElement PlayButton = driver.findElement(By.xpath("//span[@data-testid='play-btn']"));
    PlayNextButton.click();
    PlayButton.click();
}
public void isSongPlaying(){
WebElement SoundBar = driver.findElement(By.xpath("//div[@data-testid='sound-bar-play']"));
    Assert.assertTrue(SoundBar.isDisplayed());

}
}
