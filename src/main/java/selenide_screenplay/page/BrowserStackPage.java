package selenide_screenplay.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class BrowserStackPage {
    public static SelenideElement elementoPorTexto(String texto){
        return $(byText(texto));
    }
    public static SelenideElement elementoPorID(String id){
        return $(byId(id));
    }
}
