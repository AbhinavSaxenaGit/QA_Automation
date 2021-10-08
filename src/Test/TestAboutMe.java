package Test;

import Page.AboutMe;
import Utility.SeleniumMethods;

public class TestAboutMe {
    public void validatingAboutMeForm(){
        SeleniumMethods seleniumObj = new SeleniumMethods();
        seleniumObj.openBrowser(AboutMe.url);
        seleniumObj.fullScreen();
        seleniumObj.enterText(AboutMe.firstname,AboutMe.firstNameText);
        seleniumObj.enterText(AboutMe.lastname,AboutMe.lastNameText);
        seleniumObj.click(AboutMe.gender);
        seleniumObj.click(AboutMe.exp);
        seleniumObj.enterText(AboutMe.date,AboutMe.dateText);
        seleniumObj.click(AboutMe.prof1);
        seleniumObj.click(AboutMe.prof2);
        seleniumObj.click(AboutMe.tool);
        seleniumObj.closeBrowser();

    }
}

