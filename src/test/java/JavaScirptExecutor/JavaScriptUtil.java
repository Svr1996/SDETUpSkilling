package JavaScirptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {

    private WebDriver driver;
    private JavascriptExecutor js;

    public JavaScriptUtil(WebDriver driver) {
        this.driver = driver;
        this.js = (JavascriptExecutor) driver;
    }

    // 1. Click using JavaScript
    public void clickElement(WebElement element) {
        js.executeScript("arguments[0].click();", element);
    }

    // 2. Scroll to an element
    public void scrollToElement(WebElement element) {
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    // 3. Scroll to bottom of page
    public void scrollToBottom() {
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }

    // 4. Scroll to top of page
    public void scrollToTop() {
        js.executeScript("window.scrollTo(0, 0);");
    }

    // 5. Set value for input field
    public void setInputValue(WebElement element, String value) {
        js.executeScript("arguments[0].value='" + value + "';", element);
    }

    // 6. Get page title using JavaScript
    public String getPageTitleByJS() {
        return (String) js.executeScript("return document.title;");
    }

    // 7. Generate browser alert
    public void generateAlert(String message) {
        js.executeScript("alert('" + message + "');");
    }

    // 8. Refresh page using JS
    public void refreshBrowserByJS() {
        js.executeScript("history.go(0);");
    }

    // 9. Highlight element with red border
    public void highlightElement(WebElement element) {
        js.executeScript("arguments[0].style.border='2px solid red';", element);
    }

    // 10. Open a URL in new tab
    public void openURLInNewTab(String url) {
        js.executeScript("window.open('" + url + "', '_blank');");
    }

    //Get value from input field
    public String getValueByJS(WebElement element) {
        return (String) js.executeScript("return arguments[0].value;", element);
    }
}
