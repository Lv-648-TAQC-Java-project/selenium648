package com.ita.edu.teachua.ui.elements;

import com.ita.edu.teachua.ui.locators.Locator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxElement extends BaseElement {

    public CheckBoxElement(WebDriver driver, Locator locator) {
        super(driver, locator);
    }

    public CheckBoxElement(WebElement element, Locator locator) {
        super(element, locator);
    }

    public CheckBoxElement(WebElement element) {
        super(element);
    }

    public void click() {
        this.element.click();
    }

    public boolean isChecked() {
        return this.element.isSelected();
    }

    public String getAttribute(String attribute) {
        return this.element.getAttribute(attribute);
    }

    public boolean isDisplayed() {
        return this.element.isDisplayed();
    }
}
