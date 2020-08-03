import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleSearchPizzaTests {
    @Test
    void searchTests() {
        // Открыть google
        open("https://google.com");

        // Ввести  в поиск вкусная пицца
        $(byName("q")).setValue("вкусная пицца").pressEnter();

        // Проверить, что есть сайт рекомендующий пиццу dominos появился в результатах поиска
        $(byId("rcnt")).shouldHave(text("dominos"));
    }
}
