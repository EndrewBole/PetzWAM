package pages;

import general.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends Base {

    //@FindBy(css = "div.col-md-7.prod.info:nth-child(6) > h1:nth-child(1)")
    //private WebElement productTitle;

    @FindBy(css = "div.price-current")
    private WebElement productPrice;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void productTitle (String product){
        driver.findElement(By.xpath("//h1[contains(text(),"+product+")]"));
    }
    public String readTitleTab(){
        return driver.getTitle();
    }

    public String readPriceProduct(){
        return productPrice.getText();
    }
}
