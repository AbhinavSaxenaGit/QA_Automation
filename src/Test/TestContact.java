package Test;

import Page.Contact;
import Utility.SeleniumMethods;

public class TestContact {
    public void top10(){
        SeleniumMethods seleniumObj = new SeleniumMethods();
        seleniumObj.openBrowser(Contact.url);
        seleniumObj.fullScreen();
        seleniumObj.enterText(Contact.name,Contact.nameText);
        seleniumObj.enterText(Contact.email,Contact.emailText);
        seleniumObj.enterText(Contact.msg,Contact.msgText);
        seleniumObj.closeBrowser();


    }
}
