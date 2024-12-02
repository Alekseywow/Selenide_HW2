import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class SearchPageAndTitle {

    @BeforeAll
    static void setupExtetion() {
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void openPageAndTitleTest() {
        open("https://github.com/");
        $(byTagAndText("button", "Solutions")).hover();
        $(byTagAndText("a", "Enterprises")).click();
        $(".enterprise-hero").shouldHave(text("The AI-powered developer platform"));

    }
}
