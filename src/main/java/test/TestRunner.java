package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import test.utils.ConstReader;

public class TestRunner {
    public static void main(String[] args) {
        System.setProperty("webdriver.http.factory", "jdk-http-client");

        // Установка пути к драйверу браузера Chrome
        System.setProperty("webdriver.chrome.driver", ConstReader.getProperty("ChromeDriverPath"));

        // Создание экземпляра браузера Chrome
        WebDriver driver = new ChromeDriver();

        // Открытие целевого сайта
        driver.get(ConstReader.getProperty("MainPageAdress"));

        // Поиск поля для ввода и ввод ключевого слова
        //driver.findElement(By.name("email")).sendKeys("selenium webdriver");

        // Закрытие браузера
        //driver.quit();
    }
}
