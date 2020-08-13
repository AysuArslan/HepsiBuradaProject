package org.example.Page;

import org.example.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public  void callHomePage(String url){
        driver.get(url);
    }

    public void  toLoginPage() throws InterruptedException {
        WebElement hoverElement=driver.findElement(By.id("myAccount"));
        TimeUnit.SECONDS.sleep(1);
        actions.moveToElement(hoverElement).build().perform();
        TimeUnit.SECONDS.sleep(1);
        WebElement clickElement=driver.findElement(By.id("login"));
        TimeUnit.SECONDS.sleep(1);
        clickElement(clickElement);
    }

    public void toSelectCategory() throws InterruptedException {
        clickByClassNameRandom("MenuItems-1-U3X");
        TimeUnit.SECONDS.sleep(3);

    }

    public void toSelectAltCategory() throws InterruptedException {
        clickByClassNameRandom("ChildMenuItems-aeXwv");
        TimeUnit.SECONDS.sleep(5);

    }


    /*public void toSelectBrand() throws InterruptedException {
        clickByClassNameRandom("");
    }*/


    public void selectProduct() throws InterruptedException {
        clickByClassNameRandom("search-item col lg-1 md-1 sm-1  custom-hover not-fashion-flex");
        System.out.println("Ürüne tıklandı");
        TimeUnit.SECONDS.sleep(1);

    }

    public void addBasket(String classname) {
        clickByClassname("addToCartButton");
        System.out.println("Sepete eklendi");
    }
}
