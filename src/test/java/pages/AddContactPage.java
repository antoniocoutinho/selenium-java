package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AddContactPage extends BasePage{

    public AddContactPage(WebDriver navegador){
        super(navegador);
    }
    public AddContactPage selectType(String type){

        Select selectedType = new Select(navegador.findElement(By.className("browser-default")));
        selectedType.selectByVisibleText(type);
        return this;
    }
    public AddContactPage insertContact(String contact){
        navegador.findElement(By.name("contact")).sendKeys(contact);
        return this;
    }
    public MePage clickSaveContactButton(){
        navegador.findElement(By.linkText("SAVE")).click();
        return new MePage(navegador);
    }

}
