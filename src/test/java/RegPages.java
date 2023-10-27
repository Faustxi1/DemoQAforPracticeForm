import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import Components.CalendarComponent;
import Components.RegistrationResultsModal;


import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegPages {
    private final String IMG_FOLDER = "images/";
    private CalendarComponent calendarComponent = new CalendarComponent();
    private RegistrationResultsModal registrationResultsModal = new RegistrationResultsModal();
    private SelenideElement
    firstNameInput = $("#firstName"),    // вводим имя
    lastNameInput = $("#lastName"),    // введи фамилию
    mailInput = $("#userEmail"),  // введи маил
    ClickGender = $("#genterWrapper"), // выбираю male
    NumberInput =  $("[#userNumber]"), // ввод телефона
    dateOfBirthInput =  $("#dateOfBirthInput"), // указываю дату
    SubjectsInput = $("#subjectsInput"),  // напрвление
    HobbyInput =  $("#hobbiesWrapper"),   // хобби
    PictiresUpload =$("#uploadPicture"),     // гружу картинку
    AddInfo = $("#currentAddress"), //указываю доп. инфу
    stateDropdown = $("#state"),
    cityDropDown =$("#city"),
            stateAndCityChoice = $("#stateCity-wrapper");

    public RegPages openPage() {
        open("https://demoqa.com/automation-practice-form");
        Selenide.executeJavaScript("$('#fixedban').remove()");
        return this;
    }
    public RegPages setFirstName(String value){
        firstNameInput.setValue(value);
        return this;
    }
    public RegPages setLastName(String value){
        lastNameInput.setValue(value);
        return this;
    }
    public RegPages setMail(String value){
        mailInput.setValue(value);
        return this;
    }
    public RegPages setGender(String value){
        ClickGender.$(byText(value)).click();
        return this;
    }
    public RegPages SetNumber(String value){
        NumberInput.setValue(value);
        return this;
    }
    public RegPages Setbirthday(String day, String month, String year){
        dateOfBirthInput.click();
        calendarComponent.setDate(day, month, year);
        return this;
    }
    public RegPages SetSubjects(String value){
        SubjectsInput.setValue(value).pressEnter();
        return this;
    }
    public RegPages SetHobby(String value) {
        HobbyInput.$(byText(value)).click();
        return this;
    }
    public RegPages SetPictures(String value) {
        PictiresUpload.uploadFromClasspath(IMG_FOLDER + value);
        return this;
    }
    public RegPages SetAddInfo(String value) {
        AddInfo.setValue(value);
        return this;
    }
    public RegPages SetstateDropdown(String value) {
        stateDropdown.click();
        stateAndCityChoice.$(byText(value)).click();
        return this;
    }
    public RegPages SetcityDropDown(String value) {
        cityDropDown.click();
        stateAndCityChoice.$(byText(value)).click();
        return this;
    }
}
