package selenide_screenplay.interaction;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;

public class BrowserStackInteraction {

    public void clicar(SelenideElement elemento){
        elemento.shouldBe(visible).click();
    }
    public void digitar(SelenideElement elemento, String valor){
        elemento.shouldBe(visible).setValue(valor);
    }
}
