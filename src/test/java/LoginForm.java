import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginForm extends PageObject{
    private final String USERNAME = "standard_user";
    private final String PASSWORD = "secret_sauce";

    @FindBy(id = "user-name")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "login-button")
    private WebElement login_button;

    @FindBy(xpath = "//div[@class='error-message-container error']")
    private WebElement invalidCredentials;

    public LoginForm(WebDriver driver) {
        super(driver);
    }

    public void enterUsername() {
        this.username.sendKeys(USERNAME);
    }

    public void enterUsername(String username) {
        this.username.sendKeys(username);
    }

    public void enterPassword() {
        this.password.sendKeys(PASSWORD);
    }

    public void enterPassword(String password) {
        this.password.sendKeys(password);
    }

    public void pressLoginButton() {
        this.login_button.click();
    }

    public String getErrorMessage() {
        return invalidCredentials.getText();
    }
}
