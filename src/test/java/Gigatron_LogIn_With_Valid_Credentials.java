import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Gigatron_LogIn_With_Valid_Credentials {

    @Test

    public void LogInWithValidCreds(){
        System.out.println("Pokrecemo Chromedriver");
        ChromeDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,10);
        try {
            driver.get("https://gigatron.rs/login");

            System.out.println("Unosimo Email Adresu");
            WebElement unesiEmailAdresu = driver.findElementByName("email");
            unesiEmailAdresu.sendKeys("miloss.grujic@gmail.com");

            System.out.println("Unosimo Lozinku");
            WebElement unesiLozinku = driver.findElementByName("password");
            unesiLozinku.sendKeys("Grujic1509!");

            System.out.println("Kliknemo na dugme Prijavi se");
            WebElement kliknutiNaPrijaviSe = driver.findElementById("loginSubmit");


        }finally {
            driver.quit();
        }

    }
}
