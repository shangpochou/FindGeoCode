import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ReadQueryTable extends Procedure{


	public void Task(){
        BufferedReader reader;
        
        try {

            reader = new BufferedReader(new FileReader(myDB.queryTablePath));
         
            // Read the first line or not (comment means yes)
  //          reader.readLine();
      
            String line = null;
            
            while ((line = reader.readLine()) != null) {               
                String item[] = line.split(",");              
             
                if(item.length == 3){
                	String tmpKey = this.ParseCSV(item[0]);
                	tmpKey = tmpKey + this.ParseCSV(item[1]);
                	tmpKey = tmpKey + this.ParseCSV(item[2]);
                              	
                	myDB.queryList.add(tmpKey);
                }else{
                	System.out.println(item);
                }
                /*
                for(int i = 0; i < item.length; i++)
                	System.out.println(item[i]);
				*/
            }
            reader.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}
	
}
