import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Gigatron_Vratiti_Se_Na_Pocetnu_Stranu {

    @Test

    public void VracanjeNaPocetnuStranuKlikomNaLogo(){

        ChromeDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,10);

        try{

            driver.get("https://gigatron.rs/mobilni-telefoni/nokia-c21-plus-32gb-green-484940?_sgm_campaign=scn_b0a3f09478000&_sgm_source=484940&_sgm_action=click");

            System.out.println("Vratiti se na pocetnu stranu klikom na logo");
            WebElement vratitiSeNaPocetnuStranu = driver.findElementById("logi-img");
            vratitiSeNaPocetnuStranu.click();
        }finally {
            driver.quit();
        }

    }
}
