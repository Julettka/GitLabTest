import org.example.LogInPage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class EnterToMainPage {
    public static void enterToMainPage(){
        open("https://git.astondevs.ru/users/sign_in");

        $(By.id("username")).val("y.varabei").pressEnter();
        $(By.id("password")).val("AXqJbG8$3C0z");
        $(By.xpath(LogInPage.LOG_IN_BUTTON)).pressEnter();
    }
}
