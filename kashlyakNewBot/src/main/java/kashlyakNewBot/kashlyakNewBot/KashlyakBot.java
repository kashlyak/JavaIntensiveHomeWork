package kashlyakNewBot.kashlyakNewBot;


import kashlyakNewBot.kashlyakNewBot.parse.DBConnect;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;


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
    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
    @Override
    public void onUpdateReceived(Update update) {



        if(update.hasMessage()) {
            Message message = update.getMessage();
            if(message.hasText()) {
                String text = message.getText();
                if(text.equals("Показать историю входящих сообщений")) {
                    String response = DBConnect.readDB();
                    sendMessage(message, response);
                }else {
                    DBConnect.writeOnDB(text);
                }
            }
//                if(text.equals("/hello")) {
//                    String response = "Hello";
//                    sendMessage(message,response);
//                }else if (text.equals("/weather")) {
//                    String response = Weather.weatherToday();
//                    sendMessage(message,response);
//                }else if (text.equals("/weatherTomorrow")) {
//                    String response = Weather.weatherTomorrow();
//                    sendMessage(message,response);
//                }else if (text.equals("/help")) {
//                    String response = "/help\n/hello\n/weather\n/weatherTomorrow";
//                    sendMessage(message,response);
//                }
//            }
         }

    }
    public void setButton(SendMessage sendMessage) {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboardRowList = new ArrayList<>();
        KeyboardRow keyboardFirstRow = new KeyboardRow();

        keyboardFirstRow.add(new KeyboardButton("Показать историю входящих сообщений"));

        keyboardRowList.add(keyboardFirstRow);
        replyKeyboardMarkup.setKeyboard(keyboardRowList);
    }

    public void sendMessage(Message message, String response) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(message.getChatId());
        sendMessage.setText(response);

        try {
            setButton(sendMessage);
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }



}
