package org.example;

import com.thoughtworks.gauge.Step;
import org.example.Base.BaseTest;
import org.example.Page.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;


public class HomeStep extends BaseTest {


    HomePage homePage=new HomePage(webDriver);

    @Step("<url> adresine git")
    public void gotoHomePage(String url) throws InterruptedException {
        homePage.callHomePage(url);
    }

    @Step("to Login Page")
    public void gotoRegisterPage() throws InterruptedException {
        homePage.toLoginPage();
    }

    public void gotoLoginPage(String url) throws InterruptedException {
        homePage.toLoginPage();
    }


    @Step("Write username: <userName> and password: <password>")
    public void doLogin(String userName, String password) throws InterruptedException {
        homePage.setByXpath("/html/body/div[1]/div/div/div[2]/div/div/div/div[2]/div[2]/div/div/form/div[1]/div/input", userName);
        TimeUnit.SECONDS.sleep(1);
        homePage.setByXpath("/html/body/div[1]/div/div/div[2]/div/div/div/div[2]/div[2]/div/div/form/div[2]/div/input", password);
        TimeUnit.SECONDS.sleep(1);
        homePage.clickByXpath("/html/body/div[1]/div/div/div[2]/div/div/div/div[2]/div[2]/div/div/form/button");
        TimeUnit.SECONDS.sleep(3);

    }

    @Step("To Select Category")
    public  void toSelectCategory() throws InterruptedException {
        homePage.toSelectCategory();
    }

    @Step("To Select AltCategory")
    public  void toSelectAltCategory() throws InterruptedException {
        homePage.toSelectAltCategory();
    }


    @Step("select Product")
    public  void selectProduct() throws InterruptedException {
        homePage.selectProduct();
    }

    @Step("add Basket")
    public  void addBasket() throws InterruptedException {
        homePage.addBasket("addToCartButton");
    }


    /*@Step("Select Brand")
    public  void toSelectBrand() throws InterruptedException {
        homePage.toSelectBrand();
    }*

    //toSelectBrand

   /* @Step("Write minprice: <minPrice> and maxprice: <maxPrice>")
    public void writeMinPriceandMaxPrice(String minPrice, String maxPrice) throws InterruptedException {
        homePage.setByXpath("/html/body/div[1]/div/div/div[2]/div/div/div/div[2]/div[2]/div/div/form/div[1]/div/input", minPrice);
        TimeUnit.SECONDS.sleep(1);
        homePage.clickByXpath("/html/body/div[1]/div/div/div[2]/div/div/div/div[2]/div[2]/div/div/form/button");
        TimeUnit.SECONDS.sleep(3);
    }*/









}
