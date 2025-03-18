package qaautomation.driver;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
    public static void setup() {

        // WebDriverManager.chromedriver().driverVersion("134.0.6998.88").setup();
        WebDriverManager.firefoxdriver().setup();
        Configuration.browser = "firefox"; // Можна змінити на "firefox", "edge"
        Configuration.baseUrl = "https://www.tutorialspoint.com/";

        // Час очікування взаємодії з елементами (10 секунд)
        Configuration.timeout = 15000;

        // Час очікування повного завантаження сторінки 20 секунд)
        Configuration.pageLoadTimeout = 20000;

        // Автоматичне закриття браузера після тестів
        Configuration.holdBrowserOpen = true;
    }
}
