package Page;

import org.openqa.selenium.By;

public class Interview {
    public static String url ="https://www.techlistic.com/search/label/Interviews";
    public static By comment = By.xpath("//*[@id=\"Blog1\"]/div[1]/article[2]/div/div/div[4]/div[1]/div/span/a/span");
    public static By getAllComments = By.xpath("//*[@id=\"top-ra\"]/li]");
    public static By getComment = By.xpath("//*[@id=\"c8157079329008362042\"]/div[2]");
    public static By commentText = By.xpath("//*[@name='commentBody']");

    public static String getAllComment = "//*[@id=\"top-ra\"]/li]";
}
