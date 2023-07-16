
package assignment.manager;

import java.io.IOException;


public class DisplayManager {
    private String bookingdataFile = "customerdata.txt";
    private Object[][] customerData;
    private int totalCustomer;
    
    
    public int getTotalCustomer() throws IOException{
        customerData = FileManager.FiletoList(bookingdataFile);
        totalCustomer = customerData.length;
        return totalCustomer;
    }
    
    public double getTotalEarning() throws IOException{
        double totalEarning = 0;
        customerData = FileManager.FiletoList(bookingdataFile);
        for (Object[] customerData1 : customerData) {
            totalEarning += Double.parseDouble((String) (customerData1[8]));
        }
        return totalEarning;
    }
}
