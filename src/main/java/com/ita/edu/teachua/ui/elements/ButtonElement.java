package com.ita.edu.teachua.ui.elements;

import com.ita.edu.teachua.ui.locators.Locator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ButtonElement extends BaseElement {

    public ButtonElement(WebDriver driver, Locator locator) {
        super(driver, locator);
    }

    public ButtonElement(WebElement element, Locator locator) {
        super(element, locator);
    }

    public ButtonElement(WebElement element) {
        super(element);
    }

    public void click() {
        this.element.click();
    }

    public boolean isDisplayed() {
        return this.element.isDisplayed();
    }

    public boolean isActive() {
        return this.element.isEnabled();
    }

    public boolean isSelected() {
        return this.element.isSelected();
    }

    public void sendKeys(String key) {
        this.element.sendKeys(key);
    }
}
