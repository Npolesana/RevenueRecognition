package source;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class RevenueRecognition extends Gateway {
	
	private long Contractid;
	private double amount;
	private Date RecognizedOn;
	
	
	
	public RevenueRecognition(long Contractid, double amount, Date RecognizedOn) {
	
		this.Contractid = Contractid;
		this.amount = amount;
		this.RecognizedOn=RecognizedOn;
	}

	private final static String insertRevenue =
			" INSERT "
			+ " INTO revenuerecognitions "
			+ " VALUES (?,?,?) ";
	


	public long insert() throws ClassNotFoundException, SQLException {
		if (db == null) setConnection();
		PreparedStatement stmt = db.prepareStatement(insertRevenue);
		stmt.setLong(1, Contractid);
		stmt.setDouble(2, amount);
		stmt.setDate(3, RecognizedOn);
		stmt.executeUpdate();
		return getID();
	}
	
	private long getID() {
		// TODO Auto-generated method stub
		return Contractid;
	}}


