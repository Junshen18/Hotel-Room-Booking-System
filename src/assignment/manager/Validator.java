
package assignment.manager;


public class Validator{
    public boolean validateName(String name){
        return name.matches("[a-zA-Z+]");
    }
    
    public boolean validateICNumber(String icnumber){
        return icnumber.matches("[0-9]{6}-[0-9]{2}-[0-9]{4}");
    }
    
}
