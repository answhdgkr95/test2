package First;

import java.sql.*;


public class DBManager {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/chobab";
		String user="moon";
		String pass="3464";
		
		 Connection con = null;
	     Statement st = null;
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            con = DriverManager.getConnection(url, user, pass);
	            st = con.createStatement();
	 
	            System.out.println("123");
	 
	            st.close();
	            con.close();
	        } catch (SQLException se1) {
	            se1.printStackTrace();
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        } finally {
	            try {
	                if (st != null)
	                    st.close();
	            } catch (SQLException se2) {
	            }
	            try {
	                if (con != null)
	                    con.close();
	            } catch (SQLException se) {
	                se.printStackTrace();
	            }
	        }
	    }
}