package com.ita.edu.teachua.ui.elements;

import com.ita.edu.teachua.ui.locators.Locator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButtonElement extends BaseElement {
    public RadioButtonElement(WebDriver driver, Locator locator) {
        super(driver, locator);
    }

    public RadioButtonElement(WebElement element, Locator locator) {
        super(element, locator);
    }

    public RadioButtonElement(WebElement element) {
        super(element);
    }

    public void click() {
        this.element.click();
    }

    public boolean isDisplayed() {
        return this.element.isDisplayed();
    }

    public String getAttribute(String attribute) {
        return this.element.getAttribute(attribute);
    }
}
