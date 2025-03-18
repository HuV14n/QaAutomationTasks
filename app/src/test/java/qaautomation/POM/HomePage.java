package qaautomation.POM;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class HomePage {
    public void searchUnixPage(String category, String subCategory) {
        System.out.println("Натискаємо кнопку категорій...");
        $("button.flex-group").shouldBe(visible).click();

        System.out.println("Шукаємо категорію: " + category + "...");
        $$("li.category-button").findBy(text(category)).shouldBe(visible).click();

        System.out.println("Шукаємо підкатегорію: " + subCategory + "...");
        $("a[href='" + subCategory +"']").shouldBe(visible).click();

        System.out.println("Тест успішно виконався!");
    }
}
