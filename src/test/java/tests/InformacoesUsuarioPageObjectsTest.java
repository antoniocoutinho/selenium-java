package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import suporte.Web;

import static org.junit.Assert.*;

public class InformacoesUsuarioPageObjectsTest {
    private WebDriver navegador;

    @Before
    public void setUp(){
        navegador = Web.createChrome();
    }
    @Test
    public void testAdicionarInformacaoAdicionalDoUsuario(){
        String expectedMessage = new LoginPage(navegador)
                .clicarSignIn()
                .fazerLogin("test", "123456")
                .clicarMe()
                .clicarAbaMoreDataAboutYou()
                .clicarBotaoAddMoreDataAboutYou()
                .selectType("Phone")
                .insertContact("123456789")
                .clickSaveContactButton()
                .capturarTextoToast();
        assertEquals(expectedMessage, "Your contact has been added!");

    }

    public void tearDown(){
        navegador.quit();
    }
}
