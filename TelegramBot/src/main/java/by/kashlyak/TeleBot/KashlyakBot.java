package by.kashlyak.TeleBot;

import by.kashlyak.TeleBot.parse.ParseWeather;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


@Component
public class KashlyakBot extends TelegramLongPollingBot {
    @Override
    public String getBotUsername() {
        return "kashlyakbot";
    }

    @Override
    public String getBotToken() {
        return "1153957492:AAHLwQKlgTuVyIZbhxKQr9JGArvoeCE6dqs";
    }
    @Override
    public void onUpdateReceived(Update update) {
        if(update.hasMessage()) {
            Message message = update.getMessage();
            if(message.hasText()) {
                String text = message.getText();
                if(text.equals("/hello")) {
                    String response = "Hello";
                    sendMessage(message,response);
                }else if (text.equals("/weather")) {
                    String response = "Сегодня днем в Минске"+ParseWeather.getWeatherForToday();
                    sendMessage(message,response);
                }else if (text.equals("/weatherTomorrow")) {
                    String response = "Завтра днем в Минске"+ParseWeather.getWeatherForTomorrow()+ParseWeather.getWeatherForTomorrowPic();
                    sendMessage(message,response);
                }else if (text.equals("/help")) {
                    String response = "/help\n/hello\n/weather\n/weatherTomorrow";
                    sendMessage(message,response);
                }
            }
         }

    }

    public void sendMessage(Message message, String response) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(message.getChatId());
        sendMessage.setText(response);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }



}
