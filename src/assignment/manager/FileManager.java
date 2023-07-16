package assignment.manager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;


public class FileManager {
    
    private static final String TEXT_FILE = "D:\\NetBeans-16\\Assignment\\src\\assignment\\resources\\"; 


    
    public void AddToFile(String list, String filename){
        try {

            String file = TEXT_FILE + filename;
            try (FileWriter writer = new FileWriter(file,true)) {
                writer.write(list + "\n");
                writer.close(); //close filewriter obj
            }
            JOptionPane.showMessageDialog(null, "Successfully saved into "+filename);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "An error occurred.");
        }
    }
    
    public void RewriteArrToFile(Object[][] args, String filename){
        try {
            String file = TEXT_FILE + filename;
            FileWriter writer = new FileWriter(file);
                
            for (Object[] i : args) {
                writer.write(Arrays.toString(i).replace("[", "").replace("]", "") + "\n");
                }
            writer.close(); //close filewriter obj
            JOptionPane.showMessageDialog(null, "Successfully saved into "+filename);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "An error occurred.");
        }
    }
    
    public void saveTableDataToFile(JTable table, String filename) throws IOException{
        String file = TEXT_FILE + filename;
        TableModel model = table.getModel(); //set table model
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < model.getRowCount(); i++) { //loop row
            for (int j = 0; j < model.getColumnCount(); j++) { //loop column
                sb.append(model.getValueAt(i, j));  //add into StringBuilder
                if (j < model.getColumnCount() - 1) {   //add ", "
                    sb.append(", ");
                }
            }
            sb.append(System.lineSeparator());
        }
        
        try (PrintWriter writer = new PrintWriter(file)) {
            writer.write(sb.toString());
            writer.close();
        }
    }
    
    public static String[] FiletoArray(String filename) throws IOException {
        
        try{
            String file = TEXT_FILE + filename;
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            //StringBuilder help appending, inserting, replacing, and deleting characters in the string it represents.
            StringBuilder content = new StringBuilder();
            while((line = reader.readLine())!= null){
                content.append(line).append(",");
            }
            reader.close();
            String[] result = content.toString().split(",");
            return result;
        }catch (IOException e){
            System.err.print("Error reading file: "+e.getMessage());
            return null;
        }
    }
    
    public static Object[][] FiletoList(String filename) throws IOException {
    try {
        String file = TEXT_FILE + filename;
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        //ArrayList = Array contains arrays
        ArrayList<String[]> result = new ArrayList<>();
        while ((line = reader.readLine()) != null) {
            String[] row = line.split(", ");
            Object[] obj = new Object[row.length];
            for (int i=0;i<row.length;i++){
                obj[i] = row[i];
            }
            result.add(row);
        }
        
        //set result into customerdata variable 
        Object[][] customerdata = new Object[result.size()][];
        for (int i = 0; i<result.size(); i++){
            customerdata[i] = result.get(i);
        }
                
        reader.close();
        return customerdata;
        
    } catch (IOException e) {
        System.err.print("Error reading file: " + e.getMessage());
        return null;
    }
}

}
