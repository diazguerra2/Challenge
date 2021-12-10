package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class CarPage extends PageObject {

    @FindBy(xpath = "//body/section[@id='primaryArea']/div[@id='primaryR1']/div[@id='Onestore-IsomorphicApp-vqo1q35']/div[@id='store-cart-root']/div[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/span[1]/span[2]/div[1]/span[1]/span[2]/span[1]")
    private WebElementFacade itemAddedTxt;

    @FindBy(xpath = "//body/section[@id='primaryArea']/div[@id='primaryR1']/div[@id='Onestore-IsomorphicApp-vqo1q35']/div[@id='store-cart-root']/div[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/span[1]/span[2]/strong[1]/span[1]")
    private WebElementFacade totalItemTxt;

    @FindBy(xpath = "//body/section[@id='primaryArea']/div[@id='primaryR1']/div[@id='Onestore-IsomorphicApp-vqo1q35']/div[@id='store-cart-root']/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/select[1]")
    private WebElementFacade itemsBtn;


    public String getItemAddedPrice(){
        itemAddedTxt.waitUntilVisible();
        return itemAddedTxt.getText();
    }

    public String getTotalPrice(){
        totalItemTxt.waitUntilVisible();
        return totalItemTxt.getText();
    }

    public void selectItem(String numberItem){
        itemsBtn.waitUntilVisible();
        itemsBtn.click();
        itemsBtn.findElement(By.xpath(String.format("//option[contains(text(),'%s')]", numberItem))).click();
    }

}
