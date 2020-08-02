import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class YandexSearchTests {

    @Test
    void searchTextTests() {
        //Открыть страницу yandex.ru
        open("https://yandex.ru");
        //Найти sportbox.ru
        $(byId("text")).setValue("sportbox.ru").pressEnter();
        // Проверить, что sportbox.ru появился в результатах поиска
        $(byId("search-result")).shouldHave(text("sportbox.ru"));
    }
}
