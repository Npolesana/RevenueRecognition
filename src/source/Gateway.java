package source;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Calendar;

import identityMap.ContractMap;
import model.ContractModel;
import model.ProductModel;
import model.RevenueRecognitionModel;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Gateway {
	protected static Connection db;

	
	protected static void setConnection() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
	      // Setup the connection with the DB
	    db = DriverManager
	          .getConnection("jdbc:mysql://localhost:8080/soen387?"
	              + "user=root&password=1234");


	}
    public static void main(String[] args) throws Exception {
    	long id = 2L;
	System.out.println(ProductModel.getProductType(id));
	long idd = 9L;
	java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
	System.out.println("Hi");

	//Testing the identity map.
    ContractMap pmap = new ContractMap();
    
   

	System.out.println(Contract.findContract(idd));

}}
