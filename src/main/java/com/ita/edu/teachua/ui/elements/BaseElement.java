package com.ita.edu.teachua.ui.elements;

import com.ita.edu.teachua.ui.locators.Locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseElement {

    protected By path;
    protected WebElement element;
    protected WebDriver driver;

    public BaseElement(WebDriver driver, Locator locator) {
        this.driver = driver;
        this.path = locator.getPath();
        this.element = driver.findElement(path);
    }

    public BaseElement(WebElement element, Locator locator) {
        this.path = locator.getPath();
        this.element = element.findElement(path);
    }

    public BaseElement(WebElement element) {
        this.element = element;
    }

    public String getText() {
        return this.element.getText();
    }

    public String getInnerText() {
        return this.element.getAttribute("innerText");
    }

    public WebElement getElement() {
        return element;
    }
    public By getPath() {
	return this.path;
    }

}
