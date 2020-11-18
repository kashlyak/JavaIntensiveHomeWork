package kashlyakNewBot.kashlyakNewBot.parse;

public class MenuWeather {
    public void menuForWeather() {
        String response;
        boolean more = true;
        switch (123) {
            case (1):
                response = Weather.weatherToday();
            break;
            case (2):
                response = Weather.weatherTomorrow();
            break;
            case (3):
                more = false;
                break;
            default:
                throw new IllegalStateException("Unexpected value: ");
        }
        }
    }



