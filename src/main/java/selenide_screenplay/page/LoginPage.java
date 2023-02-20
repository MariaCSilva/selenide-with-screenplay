package selenide_screenplay.page;

import com.codeborne.selenide.SelenideElement;

import static selenide_screenplay.page.BrowserStackPage.elementoPorID;

public class LoginPage {

    public static final String ID_CAMPO_USERNAME = "react-select-2-input";
    public static final String ID_OPCAO_USUARIO = "react-select-2-option-0-0";
    public static final String ID_OPCAO_SENHA = "react-select-3-option-0-0";
    public static final String ID_CAMPO_PASSWORD = "react-select-3-input";
    public static final String ID_BOTAO_LOGIN = "login-btn";

    public static SelenideElement campoUsuario(){
        return elementoPorID(ID_CAMPO_USERNAME);
    }

    public static SelenideElement opcaoUsuario(){
        return elementoPorID(ID_OPCAO_USUARIO);
    }


    public static SelenideElement campoSenha(){
        return elementoPorID(ID_CAMPO_PASSWORD);
    }

    public static SelenideElement opcaoSenha(){
        return elementoPorID(ID_OPCAO_SENHA);
    }

    public static SelenideElement botaoLogin(){
        return elementoPorID(ID_BOTAO_LOGIN);
    }
}
