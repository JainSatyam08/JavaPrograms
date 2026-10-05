class InvalidAgeException extends Exception{
    InvalidAgeException(String message){
        super(message);
    }
}
public class ExceptionHandling {
    static void C(){
        int a=10/0;
    }
    static void B(){
        C();
    }
    static void A(){
        B();
    }
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18+");
        } else {
            System.out.println("Age is valid");
        }
    }
    public static void main(String[] args) {
        try {
             int result = 10 / 0; 
             System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }
        finally {
            System.out.println("Finally block executed.");
        }  
        int age=16;
        try{
            checkAge(age);
        }
        catch(Exception e){
            System.out.println("Exception occurred: " + e);
        }
        finally {
            System.out.println("Finally block executed.");
        }
        try{
            A();
        }
        catch(Exception e){
            System.out.println("Exception occurred: " + e);
        }
        finally {
            System.out.println("Finally block executed.");
        }
        
        
          
      
    }
    
}
