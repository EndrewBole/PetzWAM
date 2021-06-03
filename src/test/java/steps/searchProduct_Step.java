package steps;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import general.Base;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.ProductListPage;
import pages.ProductPage;

import static org.junit.Assert.assertEquals;

public class searchProduct_Step extends Base {
    private Base base;
    private HomePage homePage;
    private ProductListPage productListPage;
    private ProductPage productPage;

    public searchProduct_Step(WebDriver driver) {
        super(driver);
    }



    @Given("^acess Petz site Homepage$")
    public void acessPetzSiteHomepage() {
        base.driver.get("https://www.petz.com.br/");
    }

    @When("^i search for this product Aquario \"([^\"]*)\"$")
    public void iSearchForThisProductAquario(String productSearched)  {
        homePage.searchWithEnterKey(productSearched);
    }

    @Then("^see list of product \"([^\"]*)\"$")
    public void seeListOfProduct(String productSearched) {
       assertEquals(productSearched + " - Produtos pet em promoção | Petz",productListPage.readTabTitle());
       assertEquals("Resultado para \"" + productSearched + "\"",productListPage.readResultBy());
    }

    @And("^click in product \"([^\"]*)\" searched$")
    public void clickInProductSearched(String product) {
        productListPage.clickAtProduct(product);
    }


    @Then("^show the title this product \"([^\"]*)\" and price \"([^\"]*)\"$")
    public void showTheTitleThisProductAndPrice(String product, String price) {
        assertEquals("Resultado para \"" + product + "\"", productPage.readTitleTab());
        assertEquals(price,productPage.readPriceProduct());
    }
}
