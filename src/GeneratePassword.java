public class GeneratePassword{
  
    public String generatePassword(String passportID){
        if (passportID == null || passportID.length() < 9){
            throw new IllegalArgumentException("Неккоректный формат пасспорта ID");
        }
        String firstTwo = passportID.substring(0 , 2);
        String lastFour = passportID.substring(passportID.length() - 4);
        return firstTwo + lastFour;
    }
    
}