package cn.heming.db;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import com.mysql.jdbc.* ;


public class DBconfig {
	static String driver;
	static String url;
	static String username;
public static Connection getConn() {
	Connection conn = null ;
	try {
			Class.forName(driver);
		conn  =	DriverManager.getConnection(url,username,"");
	}catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return conn;
}
	static  {

		InputStream is=null ;
		try {
			 is =new FileInputStream("H:\\property\\jdbc.properties") ;
			Properties properties=new Properties();
			properties.load(is);
			
			driver=properties.getProperty("jdbc.driver");
			url=properties.getProperty("jdbc.url");
			username=properties.getProperty("jdbc.username");
			
//			this.driver= "com.mysql.jdbc.Driver" ;
//	        this.url= "jdbc:mysql://localhost:3306/enterprise?useUnicode=true&characterEncoding=UTF8";
//			this.username="root";
			

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch blo
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}


}
