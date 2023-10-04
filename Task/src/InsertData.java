import java.sql.*;


public class InsertData {
	
	public static void main(String[] args)throws Exception {
		insertData();
	}
public static void insertData()throws Exception{
	String url ="jdbc:mysql://127.0.0.1:3306/inventory";
	String username ="root";
	String password= "8939";
	String Query = "insert into product_table values(?,?,?,?,?)";
	Connection con = DriverManager.getConnection(url, username, password);
	PreparedStatement pst = con.prepareStatement(Query);
	pst.setInt(1, 10);
	pst.setString(2, "Tv");
	pst.setInt(3, 30000);
	pst.setInt(4, 10);
	pst.setInt(5, 110);
	pst.executeUpdate();
	con.close();
	
}
}
