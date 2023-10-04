import java.sql.*;
public class InsertData2 {
public static void main(String[] args)throws Exception{
	insertData();
}

public static void insertData()throws Exception{
	String url ="jdbc:mysql://127.0.0.1:3306/inventory";
	String username ="root";
	String password= "8939";
	String Query = "insert into supplier_table values(?,?,?,?)";
	Connection con = DriverManager.getConnection(url, username, password);
	PreparedStatement pst = con.prepareStatement(Query);
	pst.setInt(1, 110);
	pst.setString(2, "suriya");
	pst.setString(3, "9940625189");
	pst.setString(4,"suriya@email");
	pst.executeUpdate();
	con.close();
}




}
