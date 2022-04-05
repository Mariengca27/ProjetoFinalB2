package tests;

import bases.TestBase;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import org.junit.Assert;
import org.junit.Test;


/*Classe que contém os métodos correspondentes aos testes de uma funcionalidade, ou seja, onde os métodos e fluxos de
casos de testes são colocados*/


public class LoginTests extends TestBase {
    //Objects
    LoginPage loginPage;

    /*Cenários de testes:*/


    //Acesso com e-mail inválido
    @Test
    public void efetuarLoginEmailInvalido() {

        loginPage = new LoginPage();

        @Before
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://mantis-prova.base2.com.br/login_page.php");


        @After
        String usuario = "emailerrado@email.com";
        String senha = "123456";
        String mensagemErroEsperada = "Favor digitar novamente, senha ou e-mail errados";

        //Test
        loginPage.clicarEmAceitarCookies();
        loginPage.preenhcerUsuarioCompleto(usuario);
        loginPage.preencherSenha(senha);
        loginPage.clicarEmLogin();

        Assert.assertTrue(loginPage.retornaMensagemErroDeLogin().contains(mensagemErroEsperada));

        driver.quit();
    }


    //Login Correto e senha corretos
    @Test
    public void efetuarLoginEmailCorreto() {


        loginPage = new LoginPage();

        @Before
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://mantis-prova.base2.com.br/login_page.php");

        @After
        String usuario = "emailCorreto@email.com";
        String senha = "123456dd";


        //Test
        loginPage.clicarEmAceitarCookies();
        loginPage.preenhcerUsuarioCompleto(usuario);
        loginPage.preencherSenha(senha);
        loginPage.clicarEmLogin();

        Assert.assertTrue(loginPage.retornaMensagemErroDeLogin().contains(mensagemErroEsperada));

        driver.quit();
    }


    //Login Correto e senha corretos e selecionar um caso de teste na página de ver casos.
    @Test
    public void efetuarLoginVisualizarCasosESelecionarUm() {


        loginPage = new LoginPage();

        @Before
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://mantis-prova.base2.com.br/login_page.php");

        @After
        String usuario = "emailCorreto@email.com";
        String senha = "123456dd";
        String mensagemErroEsperada = "Favor digitar novamente, senha ou e-mail errados";

        //Test
        loginPage.clicarEmAceitarCookies();
        loginPage.preenhcerUsuarioCompleto(usuario);
        loginPage.preencherSenha(senha);
        loginPage.clicarEmLogin();

        Assert.assertTrue(loginPage.retornaMensagemErroDeLogin().contains(mensagemErroEsperada));

        driver.quit();
    }


    //Verificar se existe algum caso de teste duplicado(coluna Num - Mantis)
    @Test
    public void efetuarLoginVisualizarCasosRepetidos() {


        loginPage = new LoginPage();

        @Before
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://mantis-prova.base2.com.br/login_page.php");

        @After
        String usuario = "emailCorreto@email.com";
        String senha = "123456dd";
        String mensagemErroEsperada = "Favor digitar novamente, senha ou e-mail errados";

        //Test
        loginPage.clicarEmAceitarCookies();
        loginPage.preenhcerUsuarioCompleto(usuario);
        loginPage.preencherSenha(senha);
        loginPage.clicarEmLogin();

        Assert.assertTrue(loginPage.retornaMensagemErroDeLogin().contains(mensagemErroEsperada));

        driver.quit();
    }

    //Verificar na página de Casos se o botão filtros está funcionando após o preenchimento
    @Test
    public void efetuarLoginFiltrarquivos() {


        loginPage = new LoginPage();

        @Before
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://mantis-prova.base2.com.br/login_page.php");

        @After
        String usuario = "emailCorreto@email.com";
        String senha = "123456dd";
        String mensagemErroEsperada = "Favor digitar novamente, senha ou e-mail errados";

        //Test
        loginPage.clicarEmAceitarCookies();
        loginPage.preenhcerUsuarioCompleto(usuario);
        loginPage.preencherSenha(senha);
        loginPage.clicarEmLogin();

        Assert.assertTrue(loginPage.retornaMensagemErroDeLogin().contains(mensagemErroEsperada));

        driver.quit();
    }


    //Verificar na página de Casos se o botão de importar dados está funcionando e gerando o arquivo
    @Test
    public void efetuarLoginExportararquivos() {


        loginPage = new LoginPage();

        @Before
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://mantis-prova.base2.com.br/login_page.php");

        @After
        String usuario = "emailCorreto@email.com";
        String senha = "123456dd";
        String mensagemErroEsperada = "Favor digitar novamente, senha ou e-mail errados";

        //Test
        loginPage.clicarEmAceitarCookies();
        loginPage.preenhcerUsuarioCompleto(usuario);
        loginPage.preencherSenha(senha);
        loginPage.clicarEmLogin();

        Assert.assertTrue(loginPage.retornaMensagemErroDeLogin().contains(mensagemErroEsperada));

        driver.quit();
    }


}









