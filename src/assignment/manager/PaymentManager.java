
package assignment.manager;

public class PaymentManager {

    private final double firstFloorPricePerNight = 350, secondFloorPricePerNight = 500, serviceTax = 0.1, tourismTax = 10;
    private double Paymentb4Tax = 0, TotalPayment = 0, serviceTaxValue = 0, tourismTaxValue = 0;
    private int floorNum = 0;
    private final int roomNum, dos;
    private final int[] firstFloor  = {1,2,3,4,5,6,7,8,9,10}, secondFloor = {11,12,13,14,15,16,17,18,19,20};

    public PaymentManager(int dos, int roomNum){
        if (roomNum < 1 || roomNum > 20){
            throw new IllegalArgumentException("Invalid value: "+roomNum);
        }
        this.dos = dos;
        this.roomNum = roomNum;
    }
    
    public int checkFloor(){
        for (int i=0; i<10; i++){
            if(firstFloor[i] == roomNum){
                return 1;
            } else if (secondFloor[i] == roomNum){
                return 2;
            }
        }
        return 0;
    }
    
    public double getPaymentb4Tax(){
        floorNum = checkFloor();
        if (floorNum == 1){
            Paymentb4Tax = dos*firstFloorPricePerNight;
        }else if (floorNum == 2){
            Paymentb4Tax = dos*secondFloorPricePerNight;
        }
        
        return Paymentb4Tax;
    }
    
    public double getServiceTax(){
        Paymentb4Tax = getPaymentb4Tax();
        serviceTaxValue = Paymentb4Tax*serviceTax;
        return serviceTaxValue;
    }
    
    public double getTourismTax(){
        tourismTaxValue = dos*tourismTax;
        return tourismTaxValue;
    }
    
    public double getTotalPayment(){
        Paymentb4Tax = getPaymentb4Tax();
        TotalPayment = Paymentb4Tax+(Paymentb4Tax*serviceTax)+(dos*tourismTax);
        return TotalPayment;
    }
}
