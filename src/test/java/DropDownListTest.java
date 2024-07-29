import org.openqa.selenium.By;
import ru.praktikum.qa_scooter.page_object.MainPage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class DropDownListTest extends BaseTest {

    private final String questionButtonLocator;
    private final String answerTextLocator;
    private final String expectedAnswerText;

    public DropDownListTest(String questionButtonLocator, String answerTextLocator, String expectedAnswerText) {
        this.questionButtonLocator = questionButtonLocator;
        this.answerTextLocator = answerTextLocator;
        this.expectedAnswerText = expectedAnswerText;
    }

    @Parameterized.Parameters
    public static Object[][] expectedAnswersParamList() {
        return new Object[][]{
                {TestData.QUESTION_LOCATOR_0, TestData.ANSWER_LOCATOR_0, TestData.ANSWER_TEXT_0},
                {TestData.QUESTION_LOCATOR_1, TestData.ANSWER_LOCATOR_1, TestData.ANSWER_TEXT_1},
                {TestData.QUESTION_LOCATOR_2, TestData.ANSWER_LOCATOR_2, TestData.ANSWER_TEXT_2},
                {TestData.QUESTION_LOCATOR_3, TestData.ANSWER_LOCATOR_3, TestData.ANSWER_TEXT_3},
                {TestData.QUESTION_LOCATOR_4, TestData.ANSWER_LOCATOR_4, TestData.ANSWER_TEXT_4},
                {TestData.QUESTION_LOCATOR_5, TestData.ANSWER_LOCATOR_5, TestData.ANSWER_TEXT_5},
                {TestData.QUESTION_LOCATOR_6, TestData.ANSWER_LOCATOR_6, TestData.ANSWER_TEXT_6},
                {TestData.QUESTION_LOCATOR_7, TestData.ANSWER_LOCATOR_7, TestData.ANSWER_TEXT_7},
        };
    }

    // Тест выпадающего списка
    @Test
    public void testDropDownList() {
        MainPage mainPage = new MainPage(driver);
        mainPage.scrollPageToEndOfList()
                .clickQuestionButton(questionButtonLocator);

        String ActualAnswerText = driver.findElement(By.id(answerTextLocator)).getText();
        assertEquals("Текст не соответствует ожидаемому результату", expectedAnswerText, ActualAnswerText);
    }
}