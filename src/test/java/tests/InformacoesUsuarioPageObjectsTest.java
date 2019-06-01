package tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import suporte.Web;

public class InformacoesUsuarioPageObjectsTest {
    private WebDriver navegador;

    @Before
    public void setUp(){
        navegador = Web.createChrome();
    }
    @Test
    public void testAdicionarInformacaoAdicionalDoUsuario(){
        new LoginPage(navegador)
                .clicarSignIn()
                .fazerLogin("test", "123456");


    }
    public void tearDown(){
        navegador.quit();
    }
}
