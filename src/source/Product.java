package source;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Product extends Gateway {
	
	private long id;
	private String name;
	private String type;
		

		public Product(long id, String name, String type) {
		
			this.id = id;
			this.name = name;
			this.type=type;
		}

		public Product() {
		}


		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		private final static String findProduct =
				"SELECT * "
				+ " FROM product "
				+ " WHERE id = ? ";
		
		private final static String findProductType =
			"SELECT * "
			+ " FROM product p, contracts c "
			+ " WHERE c.id = ? "
			+ " and p.id = c.product ";
			
		
		public String findproductType(long id) throws SQLException, ClassNotFoundException{
			if (db == null) setConnection();
			PreparedStatement stmt = db.prepareStatement(findProductType);
			stmt.setLong(1, id);
			ResultSet rs = stmt.executeQuery();
			rs.next();
			return loadjoin(rs);	}

		public Product findproduct(long id) throws SQLException, ClassNotFoundException{
			if (db == null) setConnection();
			PreparedStatement stmt = db.prepareStatement(findProduct);
			stmt.setLong(1, id);
			ResultSet rs = stmt.executeQuery();
			rs.next();
			return load(rs);	}
		
		private Product load(ResultSet rs) throws SQLException {
			long id = rs.getLong(1);
			String name = rs.getString(2);
			String type = rs.getString(3);
			Product result = new Product(id, name, type);
			return result;
		}
		private String loadjoin(ResultSet rs) throws SQLException {
			String type = rs.getString(3);
			return type;
		}
	}

	


