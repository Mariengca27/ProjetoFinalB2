package bases;

/*Classe pai de todas as classes de testes contém os métodos "Before" e "After" utilizados em todos os testes.*/

import java.utils.GlobalParameters;
import java.utils.DriverUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;



public class TestBase {
    @BeforeClass
    public static void beforeSuite(){
        new GlobalParameters();
    }

    @Before
    public void beforeTest(){
        DriverUtils.createInstance();
        DriverUtils.INSTANCE.manage().window().maximize();
        DriverUtils.INSTANCE.navigate().to(GlobalParameters.URL_DEFAULT);
    }

    @After
    public void afterTest(){
        DriverUtils.quitInstace();
    }

    @AfterClass
    public static void afterSuite(){
    }
}

