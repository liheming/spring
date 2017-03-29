package cn.heming.util;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Common {

    public static String Alert(String msg) {
        StringBuffer sb = new StringBuffer();
        sb.append("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Title</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<script charset=\"UTF-8\">\n" +
                "    alert(\" " + msg+"    \");\n" +
                "</script>\n" +
                "</body>"); 


        return sb.toString();

    }

    public static String AlertBack(String msg) {
        StringBuffer sb = new StringBuffer();
        sb.append("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Title</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<script charset=\"UTF-8\">\n" +
                "    alert(\" " + msg+"    \");\n" +
                "   window.history.back(); \n" +
                "</script>\n" +
                "</body>"); 


        return sb.toString();

    }


    public static String AlertTo(String msg ,String url) {
    	
        StringBuffer sb = new StringBuffer();
        sb.append("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Title</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<script charset=\"UTF-8\">\n" +
                "    alert(\" " +msg+ "  \");\n" +
                "    window.location =\"  "+ url+ "  \"\n" +
                "</script>\n" +
                "</body>"); 


        return sb.toString();
    	
    	
   

    }



    public static void free(Connection conn, Statement st, ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        if (st != null) {
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }

}
