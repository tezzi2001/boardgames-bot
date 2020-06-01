import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

@AllArgsConstructor
public class Bot extends TelegramLongPollingBot {
    private String username;
    private String token;

    @Override
    @SneakyThrows
    public void onUpdateReceived(Update update) {
        SendMessage message = new SendMessage()
                .setText(update.getMessage().getText())
                .setChatId(update.getMessage().getChatId());
        execute(message);
    }

    @Override
    public String getBotUsername() {
        return username;
    }

    @Override
    public String getBotToken() {
        return token;
    }
}
