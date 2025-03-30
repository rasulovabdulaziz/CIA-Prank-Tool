import java.awt.*;
import javax.swing.*;

public class ImageDisplay {
    public void showImageWithText(String name, String secondName, String passportID, String password, String number) {
        JFrame frame = new JFrame("Информация");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Проверяем путь к изображению
        ImageIcon imageIcon = new ImageIcon("src/popup_image.jpg");
        if (imageIcon.getIconWidth() == -1) {
            System.out.println("Ошибка: Изображение не найдено! Проверьте путь.");
            return;
        }

        JLabel imageLabel = new JLabel(imageIcon);

        String text = "<html><h2>Данные пользователя:</h2>"
                + "<p><b>Имя:</b> " + name + "</p>"
                + "<p><b>Фамилия:</b> " + secondName + "</p>"
                + "<p><b>Паспортный ID:</b> " + passportID + "</p>"
                + "<p><b>Пароль:</b> " + password + "</p>"
                + "<p><b>Номер:</b> " + number + "</p></html>";

        JLabel textLabel = new JLabel(text, SwingConstants.CENTER);

        panel.add(imageLabel, BorderLayout.CENTER);
        panel.add(textLabel, BorderLayout.SOUTH);

        frame.add(panel);
        frame.setVisible(true);
    }
}
