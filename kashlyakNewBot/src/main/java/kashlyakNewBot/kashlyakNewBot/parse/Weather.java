package kashlyakNewBot.kashlyakNewBot.parse;

public class Weather {
    public static String weatherToday() {
        String response = "Сегодня днем в Минске"+ ParseWeather.getWeatherForToday();
        return response;
    }
    public static String weatherTomorrow() {
        String response = "Сегодня днем в Минске"+ ParseWeather.getWeatherForToday();
        return response;
    }
}
