package ru.praktikum.qa_scooter.page_object;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

//Страница Про аренду
public class AboutRentPage {
    private final WebDriver driver;
    public AboutRentPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By rentalDateField = By.xpath(".//input[@placeholder='* Когда привезти самокат']"); // Локатор поля даты начала аренды
    private final By rentalTimeField = By.className("Dropdown-placeholder"); //Локатор поля срока аренды
    private final By rentalTime = By.xpath(".//*[(@role ='option' and text()='трое суток')]"); // Локатор списка срока аренды
    private final By checkBoxColourBlackPearl = By.xpath(".//input[@id='black']"); // Локатор цвета самоката "Черный жемчуг"
    private final By checkBoxColourGreyDespair = By.xpath(".//input[@id='grey']"); // Локатор цвета самоката "Серая безысходность"
    private final By commentField = By.xpath(".//input[@placeholder='Комментарий для курьера']"); // Локатор поля комментария для курьера
    private final By orderButton = By.xpath(".//button[(@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Заказать')]"); //Локатор кнопки "Заказать"
    private final By orderButtonYes = By.xpath(".//*[@id='root']/div/div[2]/div[5]/div[2]/button[2]"); // Локатор кнопки "Да" оформления заказа*/
    private final By modalOrderWindow = By.xpath(".//div[contains(@class, 'Order_ModalHeader')]"); // Локатор модального окна*/



    //Модальное окно "Заказ Оформлен"
    public boolean isModalOrderWindowDisplayed() {
        return driver.findElement(modalOrderWindow).isDisplayed();
    }

     //Ввод даты доставки
    public AboutRentPage sendRentalDate(String date) {
        driver.findElement(rentalDateField).sendKeys(date);
        driver.findElement(rentalDateField).sendKeys(Keys.ENTER);
        return this;
    }

    //Ввод срока аренды
    public AboutRentPage setRentalTime() {
        driver.findElement(rentalTimeField).click();
        driver.findElement(rentalTime).click();
        return this;
    }

    //Выбор цвета самоката "Черный жемчуг"
    public AboutRentPage clickCheckBoxColourBlackPearl() {
        driver.findElement(checkBoxColourBlackPearl).click();
        return this;
    }

    //Выбор цвета самоката "Серая безысходность"
    public AboutRentPage clickCheckBoxColourGreyDespair() {
        driver.findElement(checkBoxColourGreyDespair).click();
        return this;
    }

    //Ввод комментария для курьера
    public AboutRentPage sendComment(String userComment) {
        driver.findElement(commentField).sendKeys(userComment);
        return this;
    }

    //Клик по Кнопке "Заказать"
    public AboutRentPage clickOrderButton() {
        driver.findElement(orderButton).click();
        return this;
    }

    //Клик по кнопке "Да" оформления заказа
    public AboutRentPage clickOrderButtonYes() {
        driver.findElement(orderButtonYes).click();
        return this;
    }
}
