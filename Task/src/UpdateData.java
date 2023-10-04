import java.sql.*;

public class UpdateData {
public static void main(String[] args)throws Exception {
	updateData();

}
public static void updateData()throws Exception{
	String url ="jdbc:mysql://127.0.0.1:3306/inventory";
	String username ="root";
	String password= "8939";
	String Query = "update product_table set product_name='headphones' where product_id=5";
	Connection con = DriverManager.getConnection(url, username, password);
	PreparedStatement pst = con.prepareStatement(Query);
   int rows = pst.executeUpdate();
   System.out.println(rows);
   con.close();
	
}}