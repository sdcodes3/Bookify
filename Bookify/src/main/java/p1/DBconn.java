package p1;

import java.sql.*;

public class DBconn {
	static private String dbName;
	static private String dbUname;
	static private String dbPass;
	public DBconn(){
		dbName = "test";
		dbUname = "root";
		dbPass = "";
		connect();
	}
	static Connection con;
	static public Statement st;
	static public Statement st1;
	public static void connect() {
		try{
	        Class.forName("com.mysql.jdbc.Driver");
	        String connString = "jdbc:mysql://localhost/"+dbName;
	        con = DriverManager.getConnection(connString, dbUname, dbPass);
	        st = con.createStatement();
	        st1 = con.createStatement();
	    }
	    catch(Exception e){
	        System.out.println(e);
	    }
	}
	
	public static boolean insertBook(String name, String category, String author, String rating,String url, String about){
		try {
			int catId = Integer.parseInt(category);
			PreparedStatement ps = con.prepareStatement("INSERT INTO book VALUES(NULL, ?, ?, ?, ?, ?, ?)");
			ps.setString(1, name);
			ps.setString(2, author);
			ps.setInt(3, catId);
			ps.setString(4, rating);
			ps.setString(5, url);
			ps.setString(6, about);
			int result = ps.executeUpdate();
			if(result>0) {
				return true;
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		return false;
	}
	
	public static boolean insertInsight(int uId, int bId, String insight) {
		try {
			String sql = "INSERT INTO `insight`(`id`, `bookid`, `userid`, `insight`) VALUES (NULL,'"+bId+"','"+uId+"','"+insight+"')";
			int result = st.executeUpdate(sql);
			if(result>0) {
				return true;
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return false;
	}
	
	public static boolean deleteInsight(int iId) {
		try {
			String sql = "DELETE FROM `insight` WHERE id="+iId;
			int result = st.executeUpdate(sql);
			if(result>0) {
				return true;
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return false;
	}
}
