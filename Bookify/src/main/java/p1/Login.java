package p1;

import java.sql.*;

public class Login extends DBconn {
	static String uname,password;
	public Login() {
	}
	public Login(String n, String p) {
		uname = n;
		password = p;
	}
	public static int main(String s[]) {
		try {
			ResultSet rs = st.executeQuery("SELECT * FROM user WHERE username='"+uname+"' AND password='"+password+"'");
			if(rs.next())
				return rs.getInt("id");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return 0;
	}
}
