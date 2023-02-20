package selenide_screenplay.tarefas;

import selenide_screenplay.interaction.LoginInteraction;

public class BrowserStackTarefa {
    protected String ator;
    public BrowserStackTarefa(String ator) {
        this.ator = ator;
    }

    public void loga(){
        LoginInteraction login = new LoginInteraction();
        login.digitarCampoUsuario(ator)
                .digitarCampoSenha()
                .clicarBoaoLogin();

    }
}
