import java.sql.*;
public class GetData2 {

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
		 System.out.println("user_price:"+rst.getString(3));
		 System.out.println("user_quantity:"+rst.getString(4));
			 }
		con.close();
		
	
	}}
