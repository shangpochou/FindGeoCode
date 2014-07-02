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
		
		this.geoDataAL = new ArrayList<GeoData>();
		this.geoHashTable = new Hashtable<String, GeoData>();
		this.queryList = new ArrayList<String>();
	}
	/*
	 * because we used Singulton method, so we can't
	 * pass parameters through constructor
	 * */
	public void SetPath(String GeoCodeTableName, String QueryTableName, String QueryResultName){
		this.geoCodePath = new String(GeoCodeTableName);
		this.outputCSVPath = new String(QueryResultName);
		this.queryTablePath = new String(QueryTableName);
	}

	public static DataBase GetDataBase(){
		if(myDataBase == null){
			myDataBase = new DataBase();
		}
		return myDataBase;
	}

}