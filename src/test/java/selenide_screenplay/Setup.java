package selenide_screenplay;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.closeWindow;
import static com.codeborne.selenide.Selenide.open;

public class Setup {

    @BeforeMethod
    public void setup(){
        open("https://bstackdemo.com/signin");
    }

    @AfterMethod
    public void close(){
        closeWindow();
    }


}
