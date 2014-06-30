public class DumpGeoData extends Procedure{

	public void Task(){

		for(int i = 0; i < myDB.geoDataAL.size(); i++){
			GeoData tmpData = myDB.geoDataAL.get(i);
			System.out.println(tmpData.cityName + " " + tmpData.townshipName + " " + tmpData.villageName);
			System.out.println(tmpData.cityCode + " " + tmpData.townshipCode + " " + tmpData.totalCode);  
		}
	}
}