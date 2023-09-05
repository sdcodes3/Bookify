package p1;

public class Register extends DBconn {
	static String name,uname,email,pass;
	static boolean canRegister = true;
	public Register(){
	}
	public Register(String n, String u, String e, String p){
		name = n;
		uname = u;
		email = e;
		pass = p;
		new Login(uname,pass);
		if(Login.main(null) > 100)
			canRegister = false;
	}
	public static boolean main(String s[]) {
		if(canRegister) {
			try {
				String sql = "INSERT INTO user VALUES(NULL,'"+name+"','"+uname+"','"+email+"','"+pass+"')";
				int result = st.executeUpdate(sql);
				if(result>0) {
					return true;
				}
			}
			catch(Exception e) {
				System.out.println(e);		
			}
		}
		return false;
	}
}
