
package assignment.manager;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class BookingManager {
    
    private Date checkinDate, checkoutDate;
    private int dos;
    private String CID, COD, paymentMethod, roomID, customerName, customerEmail, contactNumber, icNumber;
    private SimpleDateFormat formatter;
    
    public BookingManager(Date checkinDate, Date checkoutDate){
        this.checkinDate = checkinDate;
        this.checkoutDate = checkoutDate;
    }
    
    public BookingManager(Date checkinDate, Date checkoutDate, String roomID, int dos, String customerName, String icNumber, String contactNumber, String customerEmail){
        this.checkinDate = checkinDate;
        this.checkoutDate = checkoutDate;
        this.dos = dos;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.roomID = roomID;
        this.icNumber = icNumber;
        this.contactNumber = contactNumber;
    }
    
    public BookingManager(Date checkinDate, Date checkoutDate, String roomID, int dos, String customerName, String icNumber, String contactNumber, String customerEmail, String paymentMethod){
        this.checkinDate = checkinDate;
        this.checkoutDate = checkoutDate;
        this.dos = dos;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.roomID = roomID;
        this.icNumber = icNumber;
        this.contactNumber = contactNumber;
        this.paymentMethod = paymentMethod;
    }
    
    public boolean Verify(){
        if (checkinDate.compareTo(checkoutDate)<0){
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Check Out Date cannot same as Check In Date or before it! Please try again!");
            return false;
        }
    }
    
    public String getCheckInDateinStr(){
        formatter = new SimpleDateFormat("yyyy-MM-dd");
        CID = formatter.format(checkinDate);
        return CID;
    }
    
    public String getCheckOutDateinStr(){
        formatter = new SimpleDateFormat("yyyy-MM-dd");
        COD = formatter.format(checkoutDate);
        return COD;
    }
    
    public Date getCheckInDate(){
        return checkinDate;
    }
    
    public Date getCheckOutDate(){
        return checkoutDate;
    }
    
    public int getDoS(){
        return dos;
    }
    
    public String getCustomerName(){
        return customerName;
    }
    
    public String getCustomerEmail(){
        return customerEmail;
    }
    
    public String getRoomID(){
        return roomID;
    }
    
    public String getICNumber(){
        return icNumber;
    }
    
    public String getContactNumber(){
        return contactNumber;
    }
    
    public String getPaymentMethod(){
        return paymentMethod;
    }
    
    public void setCustomerName(String newName){
        this.customerName = newName;
    }
    
    public void setCustomerEmail(String newEmail){
        this.customerEmail = newEmail;
    }
    
    public void setICNumber(String newIC){
        this.icNumber = newIC;
    }
    
    public void setContactNumber(String newContact){
        this.contactNumber = newContact;
    }
    
    public void setPaymentMethod(String newPaymentMethod){
        this.paymentMethod = newPaymentMethod;
    }
}
