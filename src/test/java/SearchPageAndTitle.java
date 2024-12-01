import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class SearchPageAndTitle {

    @BeforeAll
    static void beforeAll() {
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void openPageAndTitle() {
        open("https://github.com/");
        $(byTagAndText("button", "Solutions")).hover();
        $(byTagAndText("a", "Enterprises")).click();
        $(".enterprise-hero").shouldHave(text("The AI-powered developer platform"));

    }
}
