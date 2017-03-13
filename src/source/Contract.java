package source;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Contract extends Gateway {

	private long id;
	private int product;
	private double revenue;
	private Date dateSigned;

	public long getId() {
		return this.id;
	}

	public int getProduct() {
		return this.product;
	}

	public double getRevenue() {
		return this.revenue;
	}

	public Date getDateSigned() {
		return this.dateSigned;
	}

	public Contract(long id, int product, Double revenue, Date dateSigned) {

		this.id = id;
		this.product = product;
		this.revenue = revenue;
		this.dateSigned = dateSigned;
	}

	public Contract(){}
		private final static String findContract = "SELECT * " + " FROM contracts " + " WHERE id = ? ";

		public static Contract findContract(long id) throws SQLException, ClassNotFoundException {
		if (db == null)
			setConnection();
		PreparedStatement stmt = db.prepareStatement(findContract);
		stmt.setLong(1, id);
		ResultSet rs = stmt.executeQuery();
		 if(rs.next()){
		return load(rs);}
		return null;
		 
	}

	private static Contract load(ResultSet rs) throws SQLException {
		long id = rs.getLong(1);
		Double revenue = rs.getDouble(2);
		Date DateSigned = rs.getDate(3);
		int product = rs.getInt(4);
		Contract result = new Contract(id, product, revenue, DateSigned);
		return result;
	}

	
}
