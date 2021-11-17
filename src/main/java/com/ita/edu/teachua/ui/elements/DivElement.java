package com.ita.edu.teachua.ui.elements;

import org.openqa.selenium.WebDriver;

import com.ita.edu.teachua.ui.locators.Locator;

public class DivElement extends BaseElement {

    public DivElement(WebDriver driver, Locator locator) {
	super(driver, locator);
	
    }
    public boolean isDisplayed() {
        return this.element.isDisplayed();
    }
}
