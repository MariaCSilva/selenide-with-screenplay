package selenide_screenplay.interaction;

import static selenide_screenplay.page.LoginPage.*;

public class LoginInteraction extends BrowserStackInteraction{
    public  LoginInteraction digitarCampoUsuario(String usuario){
        digitar(campoUsuario(),usuario);
        clicar(opcaoUsuario());
        return this;
    }
    public  LoginInteraction digitarCampoSenha(){
        digitar(campoSenha(),"testingisfun99");
        clicar(opcaoSenha());
        return this;
    }
    public  void clicarBoaoLogin(){
        clicar(botaoLogin());
    }
}
