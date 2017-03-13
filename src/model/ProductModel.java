package model;

import java.sql.SQLException;

import source.Product;

public class ProductModel {

	private static Product product;

	//I have used lazy loading here, 
	//since the call to the database uses a join statement and therefore more costly.
	
	public static String getProductType(Long Id) throws SQLException, ClassNotFoundException {

		ProductModel.LazyLoading();
		return product.findproductType(Id);

	}

	private static void LazyLoading() {
		if (product == null) {
			product = new Product();
		}
	}

}
