import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class YandexSearchTests {

    @Test
    void searchTextTest() {
        open("https://yandex.ru");
        
        //Найти sportbox.ru
        $("#text").setValue("sportbox.ru").pressEnter();
        
        // Проверить, что sportbox.ru появился в результатах поиска
        $("#search-result").shouldHave(text("sportbox.ru"));
    }
}
