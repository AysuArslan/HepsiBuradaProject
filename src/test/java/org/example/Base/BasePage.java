package org.example.Base;

import com.sun.org.glassfish.gmbal.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class BasePage {

    protected WebDriver driver;
    protected JavascriptExecutor js;
    protected Actions actions;

    protected BasePage(WebDriver driver){
        this.driver = driver;
        this.js = (JavascriptExecutor) driver;
        this.actions=new Actions(driver);
    }


    protected void waitSeconds(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }


    public void setById(String id, String value){
        WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
        element.clear();
        element.sendKeys(value);
    }

    public void setByXpath(String Xpath, String value) throws InterruptedException {
        WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath)));
        element.clear();
        element.sendKeys(value);
    }




    protected void setByClassName(String className, String value){
        WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.className(className)));
        element.clear();
        element.sendKeys(value);
    }


    protected void setByXPath(String xPath, String value){
        WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPath)));
        element.clear();
        element.sendKeys(value);
    }


    public void clickById(String id){
        WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.id(id)));
        driver.findElement(By.id(id)).click();
    }


    public void clickByClassname(String classname){
        WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.className(classname)));
        driver.findElement(By.className(classname)).click();
    }



    public void clickByXpath(String xpath){
        WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        driver.findElement(By.xpath(xpath)).click();
    }


    protected String getCurrentUrl(){
        return driver.getCurrentUrl();
    }

    public void clickElement(WebElement element){
        element = new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

   /* public void clickByClassNameRandom(String className) {
        List<WebElement> els =  driver.findElements(By.className(className));
        int sz = els.size();
        Random random = new Random();
        int index = random.nextInt(sz);
        WebElement el = els.get(index - 1);
        el.click();
    }*/

    public void clickByClassNameRandom(String className) {
        List<WebElement> els =  driver.findElements(By.className(className));
        int sz = els.size();
        if (sz > 0) {
            Random random = new Random();
            int index = random.nextInt(sz);
            WebElement el = els.get(index - 1);
            el.click();
        }


    }

    public void select(String id, String value){
        Select selectItem = new Select(driver.findElement(By.id(id)));
        selectItem.selectByValue(value);
    }

    public void selectXpath(String xpath, String value){
        Select selectItem = new Select(driver.findElement(By.xpath(xpath)));
        selectItem.selectByValue(value);
    }



}
