import Test.TestAboutMe;
import Test.TestContact;
import Test.TestInterview;

public class Main {
   public static void main(String[] args) throws InterruptedException {
//       TestAboutMe obj = new TestAboutMe();
//       obj.validatingAboutMeForm();
//       TestContact objTest = new TestContact();
//       objTest.top10();
       TestInterview objInter = new TestInterview(); /*This is to test Github*/
       objInter.validateTestInterview();
       //Set the path of executable browser
      /* System.setProperty("webdriver.chrome.driver",
               "C:\\Users\\PRERNA\\Downloads\\chromedriver_win32\\chromedriver.exe");
       WebDriver driverobj = new ChromeDriver();
       Main mainobj = new Main();
       mainobj.openBrowser(driverobj);
       mainobj.testCase1(driverobj);
       mainobj.testCase2(driverobj);
       mainobj.testCase3(driverobj);
       mainobj.testCase4(driverobj);
       mainobj.testCase5(driverobj);
       mainobj.testCase6(driverobj);
       mainobj.closeBrowser(driverobj);*/

   }


  /*  public void openBrowser(WebDriver driverobj){
        String url = " https://www.godaddy.com/";
        driverobj.get(url);

    }
    public void closeBrowser(WebDriver driverobj){
       driverobj.close();
    }
    //Test Case 1 - Launch browser and Open Godaddy.com
    //Launch the browser
    public void testCase1(WebDriver driverobj){
     System.out.println("TC1 executed successfully");

    }
       //TC 2 Open Godaddy.com and maximize browser window.
    public void testCase2(WebDriver driverobj){
        driverobj.manage().window().maximize();
        System.out.println("\n TC2 Executed Successfully");
    }

       //TC3 Open Godaddy.com and Print it's Page title.
       public void testCase3(WebDriver driverobj){
           String title = driverobj.getTitle();
           System.out.println("\n Title of the page = " + title);
           System.out.print("\n TC3 executed successfully");
       }

       // Test Case 4 - Open Godaddy.com and Print current url.
       public void testCase4(WebDriver driverobj){
           String currenturl = driverobj.getCurrentUrl();
           System.out.print("\n Current URL =" + currenturl);
           System.out.print("\n TC4 executed successfully");
       }

       //Test Case 5 - Open Godaddy.com and Print Page source.
       public void testCase5(WebDriver driverobj){
           String pagesource = driverobj.getPageSource();
           System.out.print(" \n Page Source =" + pagesource);
           System.out.print("\n TC5 Executed Successfully");
       }

       //Test Case 6 - Open Godaddy.com and Validate Page Title
    public void testCase6(WebDriver driverobj)
    {
        String PageTitle = driverobj.getTitle();
        if(PageTitle.contains("GoDaddy"))
            System.out.println("\n TC 6 completed");

        else
            System.out.println("\n TC 6 fail");
    }



      // WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"continents\"]"));*/
}
