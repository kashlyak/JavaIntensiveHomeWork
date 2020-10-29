package by.kashlyak.TeleBot.parse;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;



import java.io.IOException;

public class ParseWeather {

    public static String getWeatherForToday(){
        String text ="";
        try {
            Document doc = Jsoup.connect("http://www.pogoda.by/").get();
            Elements element = doc.getElementsByTag("nobr");
            text = element.get(0).text();

        } catch (
                IOException e) {
            e.printStackTrace();
        }

        return text;

    }

    public static String getWeatherForTomorrow(){
        String text ="";
        try {
            Document doc = Jsoup.connect("http://www.pogoda.by/").get();
            Elements element = doc.getElementsByTag("nobr");
            text = element.get(2).text();

        } catch (
                IOException e) {
            e.printStackTrace();
        }
        return text;
    }
    public static String getWeatherForTomorrowPic(){
        String text= null;
        try {
            Document doc = Jsoup.connect("http://www.pogoda.by/").get();
            Elements element = doc.getElementsByTag("table");
            text = element.get(8).getElementsByTag("td").get(3).text();

        } catch (
                IOException e) {
            e.printStackTrace();
        }
        System.out.println(text);
        return text;
    }




}
