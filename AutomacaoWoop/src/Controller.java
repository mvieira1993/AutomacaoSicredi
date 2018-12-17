import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;


public class Controller {
    WebDriver driver = new WebDriver() {
        @Override
        public void get(String url) {

        }

        @Override
        public String getCurrentUrl() {
            return driver.getCurrentUrl();
        }

        @Override
        public String getTitle() {
            return driver.getTitle();
        }

        @Override
        public List<WebElement> findElements(By by) {
            return driver.findElements((By.id(by.toString())));
        }

        @Override
        public WebElement findElement(By by) {
            return null;
        }

        @Override
        public String getPageSource() {
            return null;
        }

        @Override
        public void close() {

        }

        @Override
        public void quit() {

        }

        @Override
        public Set<String> getWindowHandles() {
            return null;
        }

        @Override
        public String getWindowHandle() {
            return null;
        }

        @Override
        public TargetLocator switchTo() {
            return null;
        }

        @Override
        public Navigation navigate() {
            return null;
        }

        @Override
        public Options manage() {
            return null;
        }


    };

    public void login() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/melissa.vieira/Desktop/Automacao.Sicredi/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/");
        driver.manage().window().maximize();

    }

}
