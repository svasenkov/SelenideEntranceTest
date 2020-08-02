import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleSearchTests {

    @Test
    void searchTests() {
        // Открыть google
        open("https://google.com");

        // Ввести yandex в поиск
        $(byName("q")).setValue("yandex").pressEnter();

        // Проверить, что yandex.ru появился в результатах поиска
        $("html").shouldHave(text("yandex.ru"));
    }
}
