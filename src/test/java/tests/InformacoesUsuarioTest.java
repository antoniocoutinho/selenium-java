package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InformacoesUsuarioTest {
    @Test
    public void testAdicionarInfoUser(){
        System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
        //Opening the browser
        WebDriver navegador = new ChromeDriver();
        //Navigating to task It
        navegador.get("http://www.juliodelima.com.br/taskit");
        assertEquals(1,1);
    }
}
