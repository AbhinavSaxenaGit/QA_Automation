package Test;

import Page.Interview;
import Utility.SeleniumMethods;
import org.openqa.selenium.By;


public class TestInterview {
    public void validateTestInterview() {
        SeleniumMethods seleniumObj = new SeleniumMethods();
        seleniumObj.openBrowser(Interview.url);
        seleniumObj.fullScreen();
        int allComments = seleniumObj.findAllElementByxpath(Interview.getAllComments);
        seleniumObj.click(By.xpath(Interview.getAllComment+"["+allComments+"]"));

        seleniumObj.click(Interview.comment);
        seleniumObj.findElementByxpath(Interview.getComment);
      String comment =  seleniumObj.gettheText(Interview.getComment);
      seleniumObj.click(Interview.commentText);
      seleniumObj.enterText(Interview.commentText,comment);

    }



}
