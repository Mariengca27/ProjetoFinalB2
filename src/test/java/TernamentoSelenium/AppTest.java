package TernamentoSelenium;



import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AppTest 
{
    @Test
    public void acessoInicial(){

            WebDriver driver = new ChromeDriver();
            driver.navigate().to("https://mantis-prova.base2.com.br/login_page.php");
            Assert.assertEquals("Mantis",driver.getTitle());
            driver.quit();
        }

    }


