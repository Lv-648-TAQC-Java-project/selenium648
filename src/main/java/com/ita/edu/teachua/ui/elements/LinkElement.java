package com.ita.edu.teachua.ui.elements;

import com.ita.edu.teachua.ui.locators.Locator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkElement extends BaseElement {

    public LinkElement(WebDriver driver, Locator locator) {
        super(driver, locator);
    }

    public LinkElement(WebElement element, Locator locator) {
        super(element, locator);
    }

    public LinkElement(WebElement element) {
        super(element);
    }

    public void click() {
        this.element.click();
    }

    public boolean isDisplayed() {
        return this.element.isDisplayed();
    }
}
