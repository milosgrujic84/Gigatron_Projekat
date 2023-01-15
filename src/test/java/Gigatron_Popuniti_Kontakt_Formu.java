import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Gigatron_Popuniti_Kontakt_Formu {

    @Test

    public void PopunitiKontaktForma(){

        ChromeDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,10);

        try {
            driver.get("https://gigatron.rs/kontakt");

            System.out.println("Uneti ime");
            WebElement unetiIme = driver.findElementByName("name");
            unetiIme.sendKeys("Milos");

            System.out.println("Uneti email");
            WebElement unetiEmail = driver.findElementByName("email");
            unetiEmail.sendKeys("miloss.grujic@gmail.com");

            System.out.println("Uneti Telefon");
            WebElement unetiTelefon = driver.findElementByName("phone");
            unetiTelefon.sendKeys("381651234567");

            System.out.println("izabrati Kontakt Opciju");
            WebElement kontaktOpcija = driver.findElementByName("contact");
            kontaktOpcija.click();

            System.out.println("Izabrati Prodaju");
            WebElement izabratiProdaju = driver.findElement(By.xpath("//option[@value='2']"));
            izabratiProdaju.click();

            System.out.println("Napisati Poruku");
            WebElement napisatiPoruku = driver.findElementByName("subject");
            napisatiPoruku.sendKeys("Ja sam potpuno nenormalan covek, kada sam izabrao vas sajt za testiranje. Preseli vam hrefovi!");

            System.out.println("disklajmer checkbox");
            WebElement disklajmerCheckbox = driver.findElementByName("term");
            disklajmerCheckbox.click();


        }finally {
            driver.quit();
        }


    }
}
