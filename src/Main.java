public class Main {
    public static void main(String[] args) {
        Inputs input = new Inputs();
        input.takePassportID();
        input.takeName();
        input.takeSecondName();

        GeneratePassword passwordGenerator = new GeneratePassword();
        String password = passwordGenerator.generatePassword(input.getPassportID());

        GenerateNumber numberGenerator = new GenerateNumber();
        String number = numberGenerator.generateNumber();

        // Показываем изображение
        ImageDisplay imageDisplay = new ImageDisplay();
        imageDisplay.showImageWithText(input.getName(), input.getSecondName(), input.getPassportID(), password, number);

        // Воспроизводим звук
        SoundPlayer soundPlayer = new SoundPlayer();
        soundPlayer.playSound("src/sound.wav");
    }
}

