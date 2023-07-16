
package assignment.manager;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerValidator extends Validator{
    public boolean validateCustomerName(String name){
        return name.matches("[a-zA-Z\\s'-]+");
    }
    
    public boolean validateCustomerICNumber(String icNumber){
        return super.validateICNumber(icNumber);
    }
    
    public boolean validateCustomerEmail(String email){
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    
    public boolean validateCustomerContact(String contact){
        return contact.matches("^\\+60\\d{9,10}$");
    }
}
