
import PageObject.AboutRentPage;
import PageObject.MainPage;
import PageObject.OrderPage;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static PageObject.MainPage.driver;
import static org.junit.Assert.assertTrue;

public class SamokatOrderTest {

   // Тест через кнопку заказа
    @Test
    public void samokatOrderingByHeaderOrderButton() {
        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new EdgeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        new MainPage(driver)
                .clickCookieButton()
                .clickHeaderOrderButton();

        new OrderPage(driver)
                .sendClientFirstName("Тестер")
                .sendClientLastName("Автоматизаторов")
                .sendDeliveryAddress("Москва, Тестовая, 1")
                .selectMetroStation("ВДНХ")
                .sendDeliveryClientPhoneNumber("89295855896")
                .clickNextButton();

        boolean isDisplayed = new AboutRentPage(driver)
                .sendRentalDate("01.01.2001")
                .setRentalTime()
                .clickCheckBoxColourBlackPearl()
                .sendComment("Тест1")
                .clickOrderButton()
                .clickOrderButtonYes()
                .isModalOrderWindowDisplayed();
        assertTrue("Отсутствует окно заказа тест1", isDisplayed);
    }
    @After
    public void teardown() {
        driver.quit();
    }

    // Тест через кнопку заказа в середине сайта
    @Test
    public void samokatOrderingByMiddleOrderButton() {
        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new EdgeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        new MainPage(driver)
                .clickCookieButton()
                .clickMiddleOrderButton();

        new OrderPage(driver)
                .sendClientFirstName("Автомат")
                .sendClientLastName("Тесторов")
                .sendDeliveryAddress("Москва, Тестовая, 2")
                .selectMetroStation("Котельники")
                .sendDeliveryClientPhoneNumber("89296966996")
                .clickNextButton();

        boolean isDisplayed = new AboutRentPage(driver)
                .sendRentalDate("05.12.2000")
                .setRentalTime()
                .clickCheckBoxColourGreyDespair()
                .sendComment("Тест2")
                .clickOrderButton()
                .clickOrderButtonYes()
                .isModalOrderWindowDisplayed();
        assertTrue("Отсутствует окно заказа тест2", isDisplayed);
        driver.quit();
    }

}
