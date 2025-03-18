package qaautomation.tests;

import com.codeborne.selenide.Selenide;
import com.fasterxml.jackson.databind.JsonNode;

import qaautomation.driver.DriverManager;
import qaautomation.utils.ConfigReader;
import qaautomation.POM.HomePage;
import qaautomation.POM.UnixPage;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class NavigationTest {
    private HomePage homePage;
    private UnixPage unixPage;
    private JsonNode testData;

    @BeforeAll
    static void setup() {
        DriverManager.setup();
    }

    @BeforeEach
    void openPage() {
        testData = ConfigReader.getTestData("testData.json");
        Selenide.open("/");
        homePage = new HomePage();
        unixPage = new UnixPage();
    }

    @Test    
    void testNavigationToUnixPage() {
        // Використовуємо дані з JSON
        String category = testData.get("unixCategory").asText();
        String subCategory = testData.get("unixSubCategoryRef").asText();
        String expectedTitle = testData.get("unixTitle").asText();

        // Перевірка навігації до сторінки Unix
        homePage.searchUnixPage(category, subCategory);

        assertTrue(unixPage.getTitle().contains(expectedTitle), "Unix page not opened!");
    }
}