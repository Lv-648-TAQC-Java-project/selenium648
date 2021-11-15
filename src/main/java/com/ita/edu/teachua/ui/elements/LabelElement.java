package com.ita.edu.teachua.ui.elements;

import com.ita.edu.teachua.ui.locators.Locator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LabelElement extends BaseElement {
    public LabelElement(WebDriver driver, Locator locator) {
        super(driver, locator);
    }

    public LabelElement(WebElement element, Locator locator) {
        super(element, locator);
    }

    public LabelElement(WebElement element) {
        super(element);
    }

    public boolean isDisplayedLabel() {
        return this.element.isDisplayed();
    }

    public String getColor() {
        return this.element.getCssValue("color");
    }

    public String getText() {
        return this.element.getText();
    }

    public void click() {
        this.element.click();
    }
}
