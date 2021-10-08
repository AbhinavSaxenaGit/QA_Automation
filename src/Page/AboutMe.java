package Page;
//AActually given all locators here
import org.openqa.selenium.By;
public class AboutMe {
    public static  String url = "https://www.techlistic.com/p/selenium-practice-form.html";
    public static By firstname =By.xpath("//*[@id=\"post-body-3077692503353518311\"]/div/div/div[3]/input");
    public static By lastname = By.xpath("//*[@id=\"post-body-3077692503353518311\"]/div/div/div[6]/input");
    public static By gender = By.xpath("//*[@id=\"sex-1\"]");
    public static By exp = By.xpath("//*[@id=\"exp-2\"]");
    public static By date = By.xpath("//*[@id=\"datepicker\"]");
    public static By prof1 = By.xpath("//*[@id=\"profession-1\"]");
    public static By prof2 =By.xpath("//*[@id=\"exp-2\"]");
    public static By tool = By.xpath("//*[@id=\"tool-2\"]");
    public static String firstNameText = "Prerna";
    public static String lastNameText = "Saxena";
    public static String dateText = "20/11/2021";

}

    /*  //About Me Page Automation Testing8

      WebDriver driver = new ChromeDriver();
      String URL = "https://www.techlistic.com/p/selenium-practice-form.html";
      driver.get(URL);
      driver.manage().window().fullscreen();
      driver.findElement(By.xpath("//*[@id=\"post-body-3077692503353518311\"]/div/div/div[3]/input")).sendKeys("Prerna");
      driver.findElement(By.xpath("//*[@id=\"post-body-3077692503353518311\"]/div/div/div[6]/input")).sendKeys("Saxena");
      driver.findElement(By.xpath("//*[@id=\"sex-1\"]")).click();
      driver.findElement(By.xpath("//*[@id=\"exp-2\"]")).click();
      driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).sendKeys("20/11/2021");
      driver.findElement(By.xpath("//*[@id=\"profession-1\"]")).click();
      driver.findElement(By.xpath("//*[@id=\"profession-0\"]")).click();
      driver.findElement(By.xpath("//*[@id=\"tool-2\"]")).click();*/