package cn.heming.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args) {
		String sql = "  INSERT INTO `admin` (`id`, `username`, `password`, `email`) VALUES (NULL, '888888', '77777', '777') "  ;
		Connection conn= null;
		Statement st= null;
		ResultSet rs=null ;
		try {
         Class.forName("com.mysql.jdbc.Driver");//
         conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/enterprise","root","");
         st=conn.createStatement();
         st.executeUpdate(sql);
//          rs=st.executeQuery(sql);
//          while (rs.next()) {
//        	  System.out.println(rs.getString("username"));
//        	  System.out.println(rs.getString("password"));
//        	  System.out.println(rs.getString("email"));
////        	  System.out.println(rs.getFloat("english"));
//			
//		}
          	
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		finally {
			try {
				rs.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
			try {
				st.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			try {
				conn.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}

}
