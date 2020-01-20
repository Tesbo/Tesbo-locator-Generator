package Tesbo;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.chrome.ChromeDriver;


public class Starter {


    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://google.com");

Starter start = new Starter();
        start.getButtonOnPage(driver.getPageSource());









    }


    void getButtonOnPage(String pageSource)
    {

        Document document = Jsoup.parse(pageSource);
        Elements allElements =
                ((org.jsoup.nodes.Document) document).getAllElements();
        for (Element element : allElements) {
            System.out.println(element.nodeName()
                    + " " + element.ownText()  +" " + element.data() );
        }

    }





}
