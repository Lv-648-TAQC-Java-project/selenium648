package com.ita.edu.teachua.ui.elements;

import com.ita.edu.teachua.ui.locators.Locator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropDownElement extends BaseElement {

    public DropDownElement(WebDriver driver, Locator locator) {
        super(driver, locator);
    }

    public DropDownElement(WebElement element, Locator locator) {
        super(element, locator);
    }

    public DropDownElement(WebElement element) {
        super(element);
    }

    public void click() {
        this.element.click();
    }
}
