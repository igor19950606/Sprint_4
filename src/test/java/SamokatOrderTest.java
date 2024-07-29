import ru.praktikum.qa_scooter.page_object.AboutRentPage;
import ru.praktikum.qa_scooter.page_object.MainPage;
import ru.praktikum.qa_scooter.page_object.OrderPage;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SamokatOrderTest extends BaseTest {

   // Тест через кнопку заказа
    @Test
    public void samokatOrderingByHeaderOrderButton() {
        new MainPage(driver)
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

    // Тест через кнопку заказа в середине сайта
    @Test
    public void samokatOrderingByMiddleOrderButton() {
        new MainPage(driver)
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
    }

}
