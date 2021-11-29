package com.ita.edu.teachua.ui.elements;

import com.ita.edu.teachua.ui.locators.Locator;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputElement extends BaseElement {

    public InputElement(WebDriver driver, Locator locator) {
        super(driver, locator);
    }

    public InputElement(WebElement element, Locator locator) {
        super(element, locator);
    }

    public InputElement(WebElement element) {
        super(element);
    }

    public void click() {
        this.element.click();
    }

    public void clear() {
        this.element.sendKeys(Keys.CONTROL + "A");
        this.element.sendKeys(Keys.BACK_SPACE);
    }

    public void sendKeys(String text) {
        this.element.sendKeys(text);
    }

    public void pressEnter() {
        this.element.sendKeys(Keys.ENTER);
    }

    public String getValue() {
        return this.element.getAttribute("value");
    }

    public String getCSSValue(String value){
        return this.element.getCssValue(value);
    }

}
