import lombok.SneakyThrows;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        ApiContextInitializer.init();
        new TelegramBotsApi().registerBot(new Bot(System.getenv("bot_username"), System.getenv("bot_token")));
    }
}
