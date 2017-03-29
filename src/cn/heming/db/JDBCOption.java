package cn.heming.db;



import cn.heming.util.Common;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class JDBCOption {


	public static boolean deleteUuerById(String  sql,int id  ) {
		int returnValue= 0;
		Connection conn;
		boolean isDeleteSuccess=false;
		PreparedStatement preparedStatement;
		try {
			conn = DBconfig.getConn();
			preparedStatement=conn.prepareStatement(sql);
				preparedStatement.setObject(1,id);
			returnValue =  preparedStatement.executeUpdate();
			if (returnValue==1) {
				isDeleteSuccess=true;
				return isDeleteSuccess;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return isDeleteSuccess;
	}
	
	
	public static boolean update(String  sql,  Object ...parameters) {
		int returnValue= 0;
		Connection conn = null ;	
		PreparedStatement preparedStatement =null ;	
		try {
			conn = DBconfig.getConn();	
			preparedStatement=conn.prepareStatement(sql);

			for (int i = 0; i < parameters.length; i++) {
				preparedStatement.setObject(i+1, parameters[i]);
			}

			returnValue =  preparedStatement.executeUpdate();
			if (returnValue==1) {
				return true;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

      finally {
		Common.free(conn, preparedStatement,null);
	}
		return false  ;

	}
	
	public static List query(String  sql,  Object ...parameters) {
	 List returnvalue=new ArrayList();
	 Connection conn = null ;
	 ResultSet rs = null ;
	 PreparedStatement preparedStatement =null ;	
		try {
			conn = DBconfig.getConn();
			preparedStatement=conn.prepareStatement(sql);

			for (int i = 0; i < parameters.length; i++) {
				preparedStatement.setObject(i+1, parameters[i]);
			}

			rs =  preparedStatement.executeQuery();
			
			while (rs.next()) {
				ResultSetMetaData md =rs.getMetaData();
				Map map = new HashMap();
				for (int i = 0; i < md.getColumnCount(); i++) {
					
					map.put(md.getColumnLabel(i+1), rs.getObject(i+1));
					
				}
				returnvalue.add(map);
				
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

   finally {
		Common.free(conn, preparedStatement,rs);
	}
	 
	 
	 return returnvalue;
		
		
	}


}
