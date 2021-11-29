package com.ita.edu.teachua.ui.locators.pageslocators.profilelocators;

import com.ita.edu.teachua.ui.locators.Locator;
import org.openqa.selenium.By;

public enum AddClubPopUpComponentLocators implements Locator {
    NAME_OF_CLUB(By.cssSelector("#basic_name")),
    DANCES_CHECKBOX(By.xpath("//label[@class='ant-checkbox-wrapper']//span[contains(text(),'Танці, хореографія')]")),
    FROM_AGE_UPPER_ARROW(By.xpath("//body/div/div[@class='ant-modal-root']/div[@role='dialog']/div[@role='document']/div[@class='ant-modal-content']/div[@class='ant-modal-body']/section[@class='ant-layout ant-layout-has-sider']/main[@class='ant-layout-content add-club-container']/div[@class='add-club-content']/form[@id='basic']/div[@class='ant-row ant-form-item add-club-row']/div[@class='ant-col ant-form-item-control']/div[@class='ant-form-item-control-input']/div[@class='ant-form-item-control-input-content']/span[@class='add-club-age']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")),
    TO_AGE_UPPER_ARROW(By.xpath("(//span[@aria-label='Increase Value'])[2]")),
    NEXT_STEP_BUTTON(By.cssSelector("button[class='ant-btn flooded-button add-club-content-next']")),
    TELEPHONE_NUMBER(By.cssSelector("#basic_contactТелефон")),
    DESCRIPTION_FIELD(By.cssSelector("#basic_description")),
    END_BUTTON(By.cssSelector("button[type='submit']")),
    TICK(By.xpath("//span[@aria-label='check-circle']")),
    ERROR_IN_DESCRIPTION_FIELD(By.xpath("//div[@class='ant-form-item-explain ant-form-item-explain-connected']")),
    ;

    private final By path;

    AddClubPopUpComponentLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
