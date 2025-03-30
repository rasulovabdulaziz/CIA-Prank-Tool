import java.time.LocalDate;
public class GenerateNumber {
    private static int order = 1;
    
    public String generateNumber(){
        LocalDate currentDate = LocalDate.now(); 
        String year, month, orderString;
        
       
        year = String.valueOf(currentDate.getYear());
        month = String.format("%02d", currentDate.getMonthValue());
        orderString = String.format("%04d", order++);
        return year + month + orderString;
    }


}
