package com.ita.edu.teachua.ui.pages.profile_page;

import com.ita.edu.teachua.ui.elements.ButtonElement;
import com.ita.edu.teachua.ui.elements.DropDownElement;
import com.ita.edu.teachua.ui.elements.LinkElement;
import com.ita.edu.teachua.ui.locators.pageslocators.ProfilePageLocators;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import com.ita.edu.teachua.ui.pages.club_page_pop_up.ClubPagePopUp;
import com.ita.edu.teachua.ui.pages.clubs_page.ClubsPage;
import com.ita.edu.teachua.ui.pages.edit_profile_pop_up.ProfileEditPopUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProfilePage extends BasePage {
    public ProfilePage(WebDriver driver) {
        super(driver);
    }
    public ProfileEditPopUp clickEditProfile(){
        LinkElement editProfile=new LinkElement(driver, ProfilePageLocators.EDIT_PROFILE);
        editProfile.click();
        return new ProfileEditPopUp(driver);
    }
    public ProfilePage clickAddClubButton(){
        Actions action=new Actions(driver);
        DropDownElement addClubButton=new DropDownElement(driver,ProfilePageLocators.ADD_CLUB_BUTTON);
        action.moveToElement(addClubButton.getElement()).build().perform();
        return this;
    }
    public ClubPagePopUp clickAddClub() throws InterruptedException {
        ButtonElement addClub = new ButtonElement(driver,ProfilePageLocators.ADD_CLUB);
        addClub.click();
        return  new ClubPagePopUp(driver);
    }

}
