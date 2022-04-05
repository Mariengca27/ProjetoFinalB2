package pages;

import bases.PageBase;
import org.openqa.selenium.By;

import java.util.Collection;


// Classe que contém o mapeamento dos elementos Extendendo a instância da PageBase e mapeando as variáveis

public class LoginPage extends PageBase {


    By usernameField = By.id("login");
    By passwordField = By.id("senha");
    By loginButton = By.xpath("//button[@type='submit']");
    By cookieButton = By.xpath("//*[@aria-label='dismiss cookie message']");
    By errorMessageLabel = By.className("login-error");

    //Ações básicas
    public void preenhcerUsuarioCompleto(String usuario){
        sendKeys(usernameField, usuario);
    }

    public void preencherSenha(String senha){
        sendKeys(passwordField, senha);
    }

    public void clicarEmLogin(){
        click(loginButton);
    }

    public void clicarEmAceitarCookies(){
        click(cookieButton);
    }

    public String retornaMensagemErroDeLogin(){
        return getText(errorMessageLabel);
    }


}