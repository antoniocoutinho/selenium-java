package suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Web {

    public static WebDriver createChrome(){
        System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
        //Opening the browser
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        //Navigating to task It
        navegador.get("http://www.juliodelima.com.br/taskit");
        return navegador;
    }
}
