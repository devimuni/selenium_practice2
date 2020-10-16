package sqlserverconnection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Connecttosqldbselectquery {

	public static Properties prop;

	public static void main(String[] args) throws SQLException {
		
		
		prop =new Properties();
		FileInputStream input;
		try {
			input = new FileInputStream(System.getProperty("user.dir")+ "\\Configurationfile\\config.properties");

			prop.load(input);
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		Connection conn = null;
		/*String dbURL = "jdbc:sqlserver://localhost:1433;database=ORG";
		String user = "sa";
		String pass = "sa@1234";
		conn = DriverManager.getConnection(dbURL,user,pass);*/
		
		//String dbURL = prop.getProperty("dbURL");
		//String dbURL = "jdbc:sqlserver://localhost;database=ORG;user=sa;password=sa@1234";
		//conn = DriverManager.getConnection(dbURL);
		
		
		String dbURL =prop.getProperty("dbURL");
		String user = prop.getProperty("user");
		String pass = prop.getProperty("pass");
		conn = DriverManager.getConnection(dbURL,user,pass);
		
		

		if (conn != null) {
			System.out.println("Connected");
			String sql = "SELECT * FROM worker order by salary asc";

			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);

			while (result.next()){
				String id=result.getString(1);
				String first_name = result.getString(2);
				String last_name = result.getString(3);
				String salary = result.getString(4);
				String joiningdate = result.getString(5);
				String Department = result.getString(6);
				
				System.out.println(id+"||"+first_name+"||"+ last_name+"||"+salary+"||"+joiningdate+"||"+Department);
			}

		}
	}

}
