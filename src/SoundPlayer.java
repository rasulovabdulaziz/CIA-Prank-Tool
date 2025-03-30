import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;

public class SoundPlayer {
    public void playSound(String soundFile) {
        try {
            File file = new File(soundFile);
            
            // Проверяем, существует ли файл
            if (!file.exists()) {
                System.out.println("Ошибка: Файл звука не найден! Проверьте путь.");
                return;
            }

            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            AudioFormat format = audioStream.getFormat();

            // Проверяем формат
            if (format.getEncoding() != AudioFormat.Encoding.PCM_SIGNED) {
                System.out.println("Ошибка: Формат звука не поддерживается! Конвертируйте в PCM WAV.");
                return;
            }

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

            System.out.println("🎵 Звук воспроизводится...");
            Thread.sleep(clip.getMicrosecondLength() / 1000); // Ждём окончания звука
            clip.close();

        } catch (UnsupportedAudioFileException e) {
            System.out.println("Ошибка: Неподдерживаемый формат аудиофайла.");
        } catch (IOException e) {
            System.out.println("Ошибка чтения аудиофайла: " + e.getMessage());
        } catch (LineUnavailableException e) {
            System.out.println("Ошибка аудиоустройства.");
        } catch (InterruptedException e) {
            System.out.println("Ошибка задержки воспроизведения.");
        }
    }
}
