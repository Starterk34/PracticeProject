import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get(" http://automationpractice.com/index.php");
        driver.findElement(By.tagName("a")).click();
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();


    }
}
