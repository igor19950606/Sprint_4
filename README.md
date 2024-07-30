# FinalProjectSprint4

Финальный проект 4 спринта

Технологии:

|Технология| Версия |
|---|--------|
|Java| 11     |
|JUnit| 4.13.2 |
|Maven| 4.0.0  |
|Selenium| 4.22.0 |

Настройка:

Установить Java 11.
Установить Maven 3.9.0.
Установить Selenium 4.4.0.
Установить Google Chrome и Mozilla Firefox.

Запуск проекта:

"mvn clean test"

Описание проекта:

Впереди твой второй проект. Загляни в шпаргалки, чтобы повторить теорию.
Тебе предстоит написать автотесты для учебного сервиса «Яндекс.Самокат». Его разработали специально для студентов.
Представь, что ручной тестировщик передал тебе сценарии. Их нужно покрыть автотестами.
Задание состоит из обязательной части и факультативной. Факультативная не влияет на зачёт, но поможет получить больше опыта.
1. Подготовить проект
   Собери в IDE Maven-проект. Пригодятся инструкции из темы «Локальная среда разработки». Обрати внимание: нужно использовать Java 11.
   Подключи JUnit 4.
   Подключи Selenium. Если не помнишь, как это сделать, вернись к инструкции из темы «Selenium».
   Установи Google Chrome и Mozilla Firefox: они понадобятся, чтобы выполнить задание.
2. Изучить тестовые сценарии
   Тестовые сценарии
   Выпадающий список в разделе «Вопросы о важном». Тебе нужно проверить: когда нажимаешь на стрелочку, открывается соответствующий текст.
   Заказ самоката. Нужно проверить весь флоу позитивного сценария с двумя наборами данных. Проверить точки входа в сценарий, их две: кнопка «Заказать» вверху страницы и внизу.
   Из чего состоит позитивный сценарий:
   Нажать кнопку «Заказать». На странице две кнопки заказа.
   Заполнить форму заказа.
   Проверить, что появилось всплывающее окно с сообщением об успешном создании заказа.
   Нужно написать тесты с разными данными: минимум два набора. Какие именно данные использовать — на твоё усмотрение.
   Обрати внимание: в приложении есть баг, который не даёт оформить заказ. Он воспроизводится только в Chrome.
   Ты можешь заметить этот баг, когда будешь писать тесты или запускать их. Ещё может случиться так: тест наткнётся на баг и упадёт. Пусть тебя это не смущает: если тест помог найти неисправность, это хорошо.
3. Написать тесты
   Определи, какие локаторы нужны, чтобы автоматизировать тестовые сценарии. Размести в пакете класс, чтобы описать элементы главной страницы. Выпиши все элементы в список с помощью комментариев. Например:
   // Заголовок страницы
   // Кнопка «Войти»
   // ...
   Названия должны быть понятными, чтобы с ними было удобно работать. Так ты ничего не упустишь, когда будешь искать локаторы.
   Под каждым элементом в списке запиши локатор этого элемента.
   Опиши необходимые локаторы с помощью Page Object.
   Создай отдельный пакет для Page Object.
   Для каждой страницы нужно создать отдельный класс с Page Object.
   Напиши тесты на Selenium.
   Организуй файлы проекта. Все тесты должны лежать в директории test. Тесты нужно разделить по тематике или функциональности. Обрати внимание: не нужно создавать отдельный класс для каждого теста. Добавь тесты на одну функциональность в один класс.
   Убедись, что закрываешь браузер. Метод driver.quit(); нужно использовать в конце каждого теста.
   Проверь, что тесты запускаются. Они должны проходить хотя бы в одном браузере. Нужно отправить тесты на ревью с подключённым Google Chrome.
   Отчёт о тестировании не нужен.
4. Используй параметризацию.
   Обязательно используй параметризацию. Где именно — подумай самостоятельно: тебе нужно уметь находить такие места в автотестах. Если зайдёшь в тупик, задай вопрос наставнику.
   4*. Написать тесты по дополнительным тестовым сценариям
   Выполнять это задание необязательно: оно не повлияет на зачёт.
   Сдавать задания можно только одновременно с обязательной частью работы. Если отправишь обязательную часть на проверку, дополнительные задания сдать не получится.
   Дополнительные тестовые сценарии
   Проверить: если нажать на логотип «Самоката», попадёшь на главную страницу «Самоката».
   Проверить: если нажать на логотип Яндекса, в новом окне откроется главная страница Яндекса.
   Проверить ошибки для всех полей формы заказа.
   Проверить: если ввести неправильный номер заказа, попадёшь на страницу статуса заказа. На ней должно быть написано, что такого заказа нет.