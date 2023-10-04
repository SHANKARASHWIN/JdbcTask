import java.sql.*;
public class GetData {
public static void main(String[] args) throws Exception {
	getData();
}

public static void getData()throws Exception{
	String url ="jdbc:mysql://127.0.0.1:3306/inventory";
	String username ="root";
	String password= "8939";
	String Query = "select * from product_table";
	Connection con = DriverManager.getConnection(url, username, password);
	Statement st=con.createStatement();
ResultSet rst= st.executeQuery(Query);
 while(rst.next()) {
	 System.out.println("user_product_id:"+rst.getInt(1));
	 System.out.println("user_product_name:"+rst.getString(2));
	 System.out.println("user_price:"+rst.getInt(3));
	 System.out.println("user_quantity:"+rst.getInt(4));
	 System.out.println("user_supplier_id:"+rst.getInt(5));
 }
	con.close();
}}
