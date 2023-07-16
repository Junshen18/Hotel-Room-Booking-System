
package assignment.manager;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateManager { 
    
    public static String getCurrentDateAndTime(){
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        return formattedDateTime;
    }
    
    public static LocalDate convertDateToLocalDate(Date date) {
        Instant instant = date.toInstant();
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.systemDefault());
        return zonedDateTime.toLocalDate();
    }
    
    public static long countDays(Date startDate, Date endDate){
        
        LocalDate startDateLocal = convertDateToLocalDate(startDate);
        LocalDate endDateLocal = convertDateToLocalDate(endDate);
        long DoS = ChronoUnit.DAYS.between(startDateLocal, endDateLocal);
        return DoS;
    }
    
    public static String[] getDateRangeandReturnUnavailableRoom(Date startDate, Date endDate) throws IOException{
        LocalDate inputCID = startDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate inputCOD = endDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        Object[][] bookingData = FileManager.FiletoList("customerdata.txt");
        String[] roomList = new String[bookingData.length];
        int index = 0;
        
        for (int i = 0; i<bookingData.length;i++){
            
            LocalDate convertedCID = LocalDate.parse((CharSequence)bookingData[i][5]);

            LocalDate convertedCOD = LocalDate.parse((CharSequence)bookingData[i][6]);

            if (((convertedCID.isAfter(inputCID)) && (convertedCID.isBefore(inputCOD))) || ((convertedCOD.isAfter(inputCID)) && (convertedCOD.isBefore(inputCOD))) 
            || ((convertedCID.isEqual(inputCID)) && (convertedCOD.isEqual(inputCOD))) || ((convertedCID.isEqual(inputCID)) && (convertedCOD.isAfter(inputCOD))) 
            || ((convertedCID.isBefore(inputCID)) && (convertedCOD.isEqual(inputCOD))) || ((convertedCID.isBefore(inputCID))&&(convertedCOD.isAfter(inputCOD)))){
                    String roomData = (String) bookingData[i][4];
                    roomList[index] = roomData;
                    index++;
                }
            }
            //convert the array with null values into new array
            String[] selectedRoom = new String[index];
            for (int i=0; i<index; i++){
                selectedRoom[i] = roomList[i];
            }    
            return selectedRoom;
            
        }
        
    }


