package com.ita.edu.teachua.ui.elements;

import com.ita.edu.teachua.ui.locators.Locator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DivElement extends BaseElement {

    public DivElement(WebDriver driver, Locator locator) {
        super(driver, locator);

    }

    public DivElement(WebElement element) {
        super(element);
    }

    public boolean isDisplayed() {
        return this.element.isDisplayed();
    }
}
