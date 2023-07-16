
package assignment.manager;

import static assignment.manager.FileManager.FiletoList;
import java.io.IOException;
import java.util.ArrayList;

public class Search {
    private final String obj, filename;
    private final int datarole;
    private Object[][] searchResult;
    
    public Search(String obj, int type, String filename){
        this.obj = obj;
        this.datarole = type;
        this.filename = filename;
    }
    
    public Object[][] SearchandReturn() throws IOException{
        ArrayList<Object[]> dataList = new ArrayList<>();
        Object[][] data = FiletoList(filename);
        
        for (Object[] data1 : data) {
            if ((data1[datarole].toString()).contains(obj)) {
                dataList.add(data1);
            }
        }
        
        searchResult = dataList.toArray(Object[][]::new);
        return searchResult;
    }
    
}
