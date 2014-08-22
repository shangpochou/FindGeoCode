import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class WriteQueryResult extends Procedure{
	public void Task(){
		try {
			Output();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void Output() throws IOException{

		BufferedWriter bw = new BufferedWriter(new FileWriter(myDB.outputCSVPath)); 

		String tmpTitle = new String();
		tmpTitle = tmpTitle + '"'+"CityCode"+'"'+","+ '"'+"CityName"+'"'+","+'"'+"TownshipCode"+ '"';
		tmpTitle = tmpTitle + "," + '"'+"TownshipName"+'"'+","+'"'+"VillageCode"+'"'+","+ '"'+"VillageName"+'"' + "," + '"' + "TotalCode" + '"';
		bw.write(tmpTitle);
	    bw.newLine();


		for(int i = 0 ; i < myDB.queryList.size(); i++){

			String tmpKey = myDB.queryList.get(i);
//			System.out.println(tmpKey);
			GeoData tmpGData = myDB.geoHashTable.get(tmpKey);
			
			if(tmpGData != null){
			
			String temp = new String();

	/*		
			temp = temp + '"' + tmpGData.cityName + '"' + "," + '"' + tmpGData.townshipName + '"'+ "," + '"' + tmpGData.villageName + '"' + ",";
	//		temp = temp + '"' + tmpGData.cityCode + '"' + "," + '"' + tmpGData.townshipCode + '"';
			temp = temp + '"' + tmpGData.cityCode + '"' + "," + '"' + tmpGData.townshipCode + '"'+ "," + '"' + tmpGData.totalCode + '"';
	*/		
			temp = temp + '"'  + "\t"+ tmpGData.cityCode +'"' + "," + '"' + tmpGData.cityName + '"' + ","  + '"' + "\t" + tmpGData.townshipCode  +'"' + ",";
			temp = temp + '"' + tmpGData.townshipName + '"'+ "," + '"' + "\t" + tmpGData.villageCode +'"'+ "," + '"' + tmpGData.villageName + '"' + "," + '"' + tmpGData.totalCode + '"';
			
			


			bw.write(temp);
			bw.newLine();
			}else{
				System.out.println("null error");
			}
		}
		bw.close();
	}

}