package ru.praktikum.qa_scooter.page_object;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import static org.junit.Assert.assertEquals;

//Главная страница
public class MainPage  {

    public static WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    private final By cookieButton = By.id("rcc-confirm-button");// Локатор кнопки "да все привыкли" сообщения куки
    private By heading = By.className("Home_Header__iJKdX");// Локатор заголовка страницы
    private By OrderStatus = By.className("Header_Link__1TAG7");// Локатор кнопки «Статус заказа»
    private By middleOrderButton = By.className("Button_Button__ra12g"); // Локатор кнопки «Заказать»
    private By middleOrderButton2 = By.className("Button_Middle__1CSJM"); // Локатор кнопки «Заказать в середине страницы»

    // Массив локаторов кнопок с вопросами
    private static final String[] dropDownQuestionsArray = new String[]{
            "accordion__heading-0",
            "accordion__heading-1",
            "accordion__heading-2",
            "accordion__heading-3",
            "accordion__heading-4",
            "accordion__heading-5",
            "accordion__heading-6",
            "accordion__heading-7"
    };

    // Массив локаторов с текстом ответов
    private static final String[] dropDownAnswersArray = new String[]{
            "accordion__panel-0",
            "accordion__panel-1",
            "accordion__panel-2",
            "accordion__panel-3",
            "accordion__panel-4",
            "accordion__panel-5",
            "accordion__panel-6",
            "accordion__panel-7"
    };

    // Кликнуть по кнопке "да все привыкли" в сообщении о куки
    public MainPage clickCookieButton() {
        driver.findElement(cookieButton).click();
        return this;
    }
    // Кликнуть по кнопке заказа
    public MainPage clickHeaderOrderButton() {
        driver.findElement(middleOrderButton).click();
        return this;
    }
    // Кликнуть по кнопке заказа в середине сайта
    public MainPage clickMiddleOrderButton() {
        driver.findElement(middleOrderButton2).click();
        return this;
    }
    // Прокрутка главной страницы до последнего элемента списка */
    public MainPage scrollPageToEndOfList() {
        WebElement lastQuestionArrow = driver.findElement(By.id(dropDownQuestionsArray[7]));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", lastQuestionArrow);
        return this;
    }

    // Клик по стрелке выпадающего списка
    public static void clickQuestionArrow(int questionNumber) {
        driver.findElement(By.id(dropDownQuestionsArray[questionNumber])).click();
    }

    // Проверка текста в открытой панели
    public static void checkTextInOpenPanel(String expectedText, int answerNumber) {
        String answerText = driver.findElement(By.id(dropDownAnswersArray[answerNumber])).getText();
        assertEquals(expectedText, answerText);
    }
    // Клик по кнопке вопроса
    public MainPage clickQuestionButton(String questionButtonLocator) {
        driver.findElement(By.id(questionButtonLocator)).click();
        return this;
    }
}


