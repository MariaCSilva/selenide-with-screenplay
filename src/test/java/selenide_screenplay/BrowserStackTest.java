package selenide_screenplay;

import org.testng.annotations.Test;
import selenide_screenplay.ator.BrowserStackAtor;

public class BrowserStackTest extends Setup
{
    @Test
    public void shouldAnswerWithTrue()
    {
         BrowserStackAtor.setAtor("demouser");
         BrowserStackAtor.getTasks().loga();
        BrowserStackAtor.getQuestions().usuarioVisivel();


    }
}
