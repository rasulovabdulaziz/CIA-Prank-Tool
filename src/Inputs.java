import java.util.Scanner;
public class Inputs {
    private String passportID;
    public String name, secondName;
    Scanner scanner = new Scanner(System.in);
    public void takePassportID(){
        while (true) { 
            System.out.println("Enter the passport ID: ");
            String input = scanner.nextLine();
            if(input.matches("^[a-zA-Z]{2}[0-9]{7}+$")){
                this.passportID = input;
                break;
            }else{
                System.out.println("Invalid input! Please enter as an example (AC0000000)");
            }
        }
        

    }
    public void takeName(){
        while(true){
            System.out.println("Enter your name starting with the big String:");
            String input = scanner.nextLine();

            if(input.matches("^[A-Z]{1}[a-z]+$")){
                this.name = input;
                break;
            }else{
                System.out.println("Invalid input! Please enter only alphabets.");
            }
    }
    }
    public void takeSecondName(){
        while (true) { 
            System.out.println("Enter your second name starting with the big String: ");
            String input = scanner.nextLine();

            if(input.matches("^[A-Z]{1}[a-z]+$")){
                this.secondName = input;
                break;
            }else{
                System.out.println("Invalid input! Please enter only alphabets.");
            }
        }
        
    }
    public String getPassportID(){

        return this.passportID;
    }
    public String getName(){

        return this.name;
    }
    public String getSecondName(){
        return this.secondName;
    }
    
}
