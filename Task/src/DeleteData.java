import java.sql.*;

public class DeleteData {

public static void main(String[] args)throws Exception {
	deleteData();

}
public static void deleteData()throws Exception{
	String url ="jdbc:mysql://127.0.0.1:3306/inventory";
	String username ="root";
	String password= "8939";
	String Query = "delete from product_table where product_id=10";
	Connection con = DriverManager.getConnection(url, username, password);
	PreparedStatement pst = con.prepareStatement(Query);
   int rows = pst.executeUpdate();
   System.out.println(rows);
   con.close();
	
}}