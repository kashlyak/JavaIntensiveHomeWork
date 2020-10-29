package by.kashlyak.TeleBot;



import by.kashlyak.TeleBot.parse.ParseWeather;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;

import java.io.IOException;

@SpringBootApplication
public class TeleBotApplication {

	public static void main(String[] args) {
		ApiContextInitializer.init();
		SpringApplication.run(TeleBotApplication.class, args);
//ParseWeather.getWeatherForTomorrowPic();


	}

}
