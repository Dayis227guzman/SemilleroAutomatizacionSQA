import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//importaciones que se generan luego de llamar los metodos de Junit

public class PruebaJunitTest extends TestCase {

    WebDriver driver; // se instancia la clase  Webdriver

    @BeforeClass
    public static void beforeClass() throws Exception {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); //se llama el chrome driver
    }

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver(); // nueva instancia dle chromdriver
        driver.manage().window().maximize(); // maximiza la pagina
        driver.get("https://demo.guru99.com/test/newtours/index.php");//abre la url de la pagina
    }

    @Test
    public void test() {
        driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("dayana.guzman"); // ingreso usuario para iniciar sesion
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("dayana.guzman");// ingreso contraseña para iniciar sesion
        driver.findElement(By.xpath("//input[@name='submit']")).click(); // click en submit
        driver.findElement(By.xpath("//a[contains(.,'Flights')]")).click(); //click en flights

        driver.findElement(By.xpath("//input[@value='oneway']")).click(); // click en opcion one way

        Select lst_passCount = new Select(driver.findElement(By.name("passCount")));//selecciona 2 pasajeros
        lst_passCount.selectByVisibleText("2");

        Select lst_fromPort = new Select(driver.findElement(By.name("fromPort"))); // seleciona lugar de origen
        lst_fromPort.selectByVisibleText("New York");

        Select lst_fromMonth = new Select(driver.findElement(By.name("fromMonth")));// selecciona mes de partida
        lst_fromMonth.selectByValue("8");

        Select lst_fromDay = new Select(driver.findElement(By.name("fromDay")));// selecciona dia de partida
        lst_fromDay.selectByValue("6");

        Select lst_toPort = new Select(driver.findElement(By.name("toPort")));// selecciona pais de destino
        lst_toPort.selectByVisibleText("Portland");

        Select lst_toMonth = new Select(driver.findElement(By.name("toMonth"))); // selecciona mes de regreso
        lst_toMonth.selectByValue("9");

        Select lst_toDay = new Select(driver.findElement(By.name("toDay")));// selecciona dia de regreso
        lst_toDay.selectByValue("10");

        driver.findElement(By.xpath("//input[@value='Business']")).click();// selecciona clase ejecutiva

        Select lst_airline = new Select(driver.findElement(By.name("airline"))); //selecciona aerolinea
        lst_airline.selectByVisibleText("Unified Airlines");

        driver.findElement(By.xpath("//input[@name='findFlights']")).click();// click en continuar

        String text = driver.findElement(By.xpath("//font[contains(.,'After flight finder - No Seats Avaialble')][@size='4']")).getText(); // mensaje final
        System.out.println(text);

    }

    @After
    public void tearDown() throws Exception {
        driver.quit(); // cierra conexión
    }
}