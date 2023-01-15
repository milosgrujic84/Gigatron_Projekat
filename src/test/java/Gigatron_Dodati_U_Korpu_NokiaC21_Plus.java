import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Gigatron_Dodati_U_Korpu_NokiaC21_Plus {

    @Test

    public void DodatiUKurpuNokiaC21Plus(){

        ChromeDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,10);

       try{

           driver.get("https://gigatron.rs/login");

           System.out.println("Unosimo Email Adresu");
           WebElement unesiEmailAdresu = driver.findElementByName("email");
           unesiEmailAdresu.sendKeys("miloss.grujic@gmail.com");

           System.out.println("Unosimo Lozinku");
           WebElement unesiLozinku = driver.findElementByName("password");
           unesiLozinku.sendKeys("Grujic1509!");

           System.out.println("Kliknemo na dugme Prijavi se");
           WebElement kliknutiNaPrijaviSe = driver.findElementById("loginSubmit");

        driver.get("https://gigatron.rs/mobilni-telefoni/nokia-c21-plus-32gb-green-484940?_sgm_campaign=product&_sgm_source=484940&_sgm_action=search&_sgm_term=nokia+c21");

           System.out.println("Dodati Nokia C21 Plus u korpu klikomna dugme kupi odmah");
           WebElement dodatiNokiaC21UKupiOdmah = driver.findElement(By.xpath("//button[@class='buy go-to-cart']"));
           dodatiNokiaC21UKupiOdmah.click();


    }finally {
           driver.quit();
       }
       }

}
