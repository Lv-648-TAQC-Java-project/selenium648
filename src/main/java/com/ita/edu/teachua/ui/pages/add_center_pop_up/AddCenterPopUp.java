package com.ita.edu.teachua.ui.pages.add_center_pop_up;

import com.ita.edu.teachua.ui.elements.ButtonElement;
import com.ita.edu.teachua.ui.elements.DivElement;
import com.ita.edu.teachua.ui.elements.InputElement;
import com.ita.edu.teachua.ui.locators.pageslocators.AddCenterPopUpLocators;
import com.ita.edu.teachua.ui.pages.add_location_pop_up.AddLocationPopUp;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import org.openqa.selenium.WebDriver;

public class AddCenterPopUp extends BasePage {
    private ButtonElement addLocation;
    private InputElement centerName;
    private ButtonElement nextStepButton;
    private DivElement errorBlock;
    public AddCenterPopUp(WebDriver driver) {
        super(driver);
    }
    
    public AddLocationPopUp clickOnAddLocation() {
	addLocation = new ButtonElement(driver,AddCenterPopUpLocators.ADD_LOCATION_BUTTON);
	addLocation.click();
	return new AddLocationPopUp(driver);
    }
    public AddCenterPopUp clearCenterName() {
	centerName = new InputElement(driver,AddCenterPopUpLocators.CENTER_NAME_INPUT);
	centerName.clear();
	return this;
    }
    public AddCenterPopUp clickOnNextStepButton() {
	nextStepButton = new ButtonElement(driver,AddCenterPopUpLocators.NEXT_STEP_BUTTON);
	nextStepButton.click();
	return this;
    }
    public boolean errorsIsDisplayed() {
	errorBlock = new DivElement(driver,AddCenterPopUpLocators.CENTER_NAME_ERROR_BLOCK);
	return waitVisibilityOfElementLocated(errorBlock,5).isDisplayed();
	//return errorBlock.getText();
    }
}
