import java.util.ArrayList;

public class FindGeoCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataBase myDB = DataBase.GetDataBase();

		ArrayList<Procedure> myProcAL = new ArrayList<Procedure>();

		ReadCSV myRCSV = new ReadCSV();
		myProcAL.add(myRCSV);

//		WriteToCSV myWCST = new WriteToCSV();
//		myProcAL.add(myWCST);
		
		DumpGeoData myDGD = new DumpGeoData();
//		myProcAL.add(myDGD);
		
		ReadQueryTable myRQT = new ReadQueryTable();
		myProcAL.add(myRQT);
		
		WriteQueryResult myWQR = new WriteQueryResult();
		myProcAL.add(myWQR);

		for(int i = 0; i < myProcAL.size(); i++){
			myProcAL.get(i).GetData(myDB);
			myProcAL.get(i).Task();
		}
	}

}
