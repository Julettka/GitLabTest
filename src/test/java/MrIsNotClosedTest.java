import org.example.ABankPage;
import org.example.FirstProjectPage;
import org.example.MrPage;
import org.example.ProjectsPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MrIsNotClosedTest {

    @Test
    public void mrIsNotClosedTest(){
        EnterToMainPage.enterToMainPage();
        $(By.xpath(ProjectsPage.FIRST_PROJECT)).click();
        $(By.xpath(FirstProjectPage.A_BANK)).click();
        $(By.xpath(ABankPage.MERGE_REQUESTS)).click();
        assertNotNull(($$(By.xpath(MrPage.FIRST_MR))), "Все МР закрыты");
    }
}
