package selenide_screenplay;

import static org.junit.Assert.assertTrue;
import com.codeborne.selenide.Selenide;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        Selenide.open("https://seubarriga.wcaquino.me/");
        assertTrue( true );
    }
}
