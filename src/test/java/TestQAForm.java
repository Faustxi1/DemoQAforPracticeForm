import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TestQAForm {
    String name = "Viktor";
    String lastName = "Trimble";
    String mail = "Heroik@mail.ru";
    String number = "892196";

    @BeforeAll
    static void BeforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
        Configuration.timeout = 5000;
    }
    @Test
    void FormQa() {

        // открываем сайт
        open("https://demoqa.com/automation-practice-form");

        new RegPages()
                .setFirstName("Alex")
                .setLastName("Lover")
                .setMail("us@mail.ru")
                .setGender("Male")
                .SetNumber("52658")
                .Setbirthday("01","02","2010")
                .SetSubjects("Arts")
                .SetHobby("Music")
                .SetPictures("1.jpg")
                .SetAddInfo("Belgorod2")
                .SetstateDropdown("Haryana")
                .SetcityDropDown("Panipat");
              //  .stateAndCityChoice(SetstateDropdown +" "+ SetcityDropDown);

        // указываю дату
        // $("#dateOfBirthInput").click();
        //  $(".react-datepicker__month-select").selectOptionContainingText("June");
        //  $(".react-datepicker__year-select").selectOptionContainingText("2020");
        //  $(".react-datepicker__day.react-datepicker__day--021").click();
        // напрвление
        //   $("#subjectsInput").sendKeys("E");
        // $(byText("English")).click();
        // хобби
        //  $("#hobbiesWrapper").$(byText("Sports")).click();
        // гружу картинку
        // $("#uploadPicture").uploadFile(new File("src/main/resources/IMG/1.png")); - это если мы хотим полный путь
        // $("#uploadPicture").uploadFromClasspath("IMG/1.png");
        //$(byText("Навыки")).doubleClick();
        //указываю доп. инфу
        //  $("[id=currentAddress]").setValue("Belgorod2");
        //  Selenide.executeJavaScript("$('#fixedban').remove()");
        //ввожу штат и город
        // $$("#stateCity-wrapper").first().click();
        // $(byText("NCR")).click();
        // $$("#city").last().click();
        // $(byText("Delhi")).click();
    }
}
