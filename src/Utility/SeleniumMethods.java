package Utility;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethods {
    WebDriver driverobj = null;
    //you can't intialise without method inside the class
//Constructor as without return type and have same name as class
    public SeleniumMethods() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
         driverobj = new ChromeDriver();
         //Alert alert = driverobj.switchTo().alert();

    }

    public void dismissWebAlert() throws InterruptedException {

        Alert alert = driverobj.switchTo().alert();
        alert.dismiss();
    }

   public void openBrowser(String url){
        driverobj.get(url);
   }
   public void  closeBrowser(){
        driverobj.close();
   }
   public void fullScreen(){
        driverobj.manage().window().maximize();
   }
   public void findElementByxpath(By xpath){
        driverobj.findElement(xpath);
   }

   public int findAllElementByxpath(By xpath){
        int size = driverobj.findElements(xpath).size();
        return size;
   }
   /*public void findElementByid(By id){
        driverobj.findElement(id);
    }*/
    public String gettheText(By xpath){
        String str = driverobj.findElement(xpath).getText();
        return(str);
    }


   public void enterText(By xpath,String text){
        driverobj.findElement(xpath).sendKeys(text);
   }
    /*public void enterTextid(By id,String text){
        driverobj.findElement(id).sendKeys(text);
    }*/
   public void click(By xpath){
        driverobj.findElement(xpath).click();
   }
}
