package selenide_screenplay.question;

import static com.codeborne.selenide.Condition.visible;
import static selenide_screenplay.page.BrowserStackPage.elementoPorTexto;

public class HomeQuestions extends BrowserStackQuestion {

    public HomeQuestions(String ator) {
        super(ator);
    }

    public void usuarioVisivel(){
        elementoPorTexto(ator).shouldBe(visible);
    }
}
