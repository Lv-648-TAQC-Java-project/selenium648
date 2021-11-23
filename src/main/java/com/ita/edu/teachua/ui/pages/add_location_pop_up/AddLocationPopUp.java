package com.ita.edu.teachua.ui.pages.add_location_pop_up;

import com.ita.edu.teachua.ui.elements.ButtonElement;
import com.ita.edu.teachua.ui.elements.DivElement;
import com.ita.edu.teachua.ui.locators.pageslocators.AddLocationPopUpLocators;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class AddLocationPopUp extends BasePage {
    private ButtonElement addButton;
    private DivElement addLocationPopUpBlock;

    public AddLocationPopUp(WebDriver driver) {
        super(driver);
    }

    public boolean checkAddButton() {
        addButton = new ButtonElement(driver, AddLocationPopUpLocators.ADD_BUTTON);
        return addButton.isActive();
    }

    public boolean addLocationPopUpBlockIsDisplayed() {

        try {
            addLocationPopUpBlock = new DivElement(driver, AddLocationPopUpLocators.ADD_LOCATION_BLOCK_HEADER);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }

    }
}
