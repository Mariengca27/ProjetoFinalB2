package flows;

import pages.LoginPage;

//Contém os métodos que agrupam as ações em fluxo que pode ser exercitado em vários casos de teste.

public class LoginFlows {

    //Objetos e construtores
    LoginPage loginPage;

    public LoginFlows(){
        //Page and Steps Objects
        loginPage = new LoginPage();
    }

    //Flows
    public void efetuarLogin(String usuario, String senha){
        loginPage.clicarEmAceitarCookies();
        loginPage.preenhcerUsuarioCompleto(usuario);
        loginPage.preencherSenha(senha);
        loginPage.clicarEmLogin();
    }
}
