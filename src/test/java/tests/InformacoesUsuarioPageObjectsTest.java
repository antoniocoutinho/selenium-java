package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.LoginPage;
import suporte.AddContact;
import suporte.RemoveContact;
import suporte.Web;

import static java.lang.Thread.sleep;
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

    @Test
    public void testRemoveContact(){
        //Given i have a contact already added
        AddContact add = new AddContact(navegador);
        add.addUserContact("test","123456","Phone", "numeroMagico");
        //Then I want to remove the contact
        RemoveContact rmContact = new RemoveContact(navegador);
        rmContact.removeContact();
        String mensagemEsperada = new BasePage(navegador).capturarTextoToast();

        assertEquals(mensagemEsperada, "Rest in peace, dear phone!");
    }

    public void tearDown(){
        navegador.quit();
    }
}
