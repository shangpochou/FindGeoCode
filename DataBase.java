import java.util.*;

public class DataBase {


	public ArrayList<GeoData> geoDataAL;

	public ArrayList<String> queryList;
	
	public Hashtable<String, GeoData> geoHashTable;
	
	public String geoCodePath;

	public String outputCSVPath;
	
	public String queryTablePath;
	//singulaton 
	private static DataBase myDataBase;

	/*
	 * Constructor, and config here.
	 */
	public DataBase(){
		this.geoCodePath = new String("GeoCode103.csv");
		this.outputCSVPath = new String("QueryResult103.csv");
		this.queryTablePath = new String("QueryTable103.csv");
		this.geoDataAL = new ArrayList<GeoData>();
		this.geoHashTable = new Hashtable<String, GeoData>();
		this.queryList = new ArrayList<String>();
	}

	public static DataBase GetDataBase(){
		if(myDataBase == null){
			myDataBase = new DataBase();
		}
		return myDataBase;
	}

}