import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
// Добавлнеи библиотек javazoom

import java.io.FileInputStream;
import java.io.IOException;

public class MP3Player {

    public void playback(String path) {
        try (FileInputStream inputStream = new FileInputStream(path)) {
            try {
                Player player = new Player(inputStream);
// Запуск плеера
                player.play();
            } catch (JavaLayerException e) {
// Ошибка
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
