import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Dodati_Artikal_U_Listu_Zelja {

    @Test

    public void DodatiArtikalUListuZelja(){

        ChromeDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,10);

        try {

            System.out.println("Pokrenimo driver");
            driver.get("https://gigatron.rs/mobilni-telefoni/nokia-c21-plus-32gb-green-484940?_sgm_campaign=scn_b0a3f09478000&_sgm_source=484940&_sgm_action=click");

            System.out.println("Dodajemo artikal NokiaC21Plus u listu zelja");
            WebElement NokiaC21UListuZelja = driver.findElement(By.xpath("//span[@id='favorite-484940']"));
            NokiaC21UListuZelja.click();

        }finally {
            driver.quit();
        }
    }
}
