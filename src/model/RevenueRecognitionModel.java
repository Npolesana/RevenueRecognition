package model;

import java.sql.Date;
import java.sql.SQLException;

import source.RevenueRecognition;

public class RevenueRecognitionModel {
	

	
	public static void Insert (Long Id, double amount, Date date) throws ClassNotFoundException, SQLException{
		RevenueRecognition revenue = new RevenueRecognition(Id, amount, date);
		revenue.insert();
		
	}

}
