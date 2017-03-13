package model;

import source.Contract;
import source.Product;

import java.sql.Date;
import java.sql.SQLException;
import java.text.DecimalFormat;

import identityMap.ContractMap;
import recognitionStrategy.DatabaseRevenue;
import recognitionStrategy.SpreadsheetRevenue;
import recognitionStrategy.WordProcessorRevenue;

public class ContractModel {
	
private static Contract Contract;
private static double revenue;
private static ContractMap maps = new ContractMap();



	public static String findContract(Long Id) throws SQLException, ClassNotFoundException {
	    ContractMap maps = new ContractMap();
		Contract Results = maps.getContract(Id);
		if(Results != null){
		return ContractModel.toString(Results);}
		return null;
	}
	
	public static String toString(Contract contract) {
		return "\nContract Id: " + contract.getId() + "\nProduct Id: " + contract.getProduct()
				+ " Revenue: " + contract.getRevenue() + " Signed on: " + contract.getDateSigned();

	}
	
	public static String calculateRevenueRecognitions(long contractNumber, Date date) throws ClassNotFoundException{
		try{

			Contract contract = maps.getContract(contractNumber);
		
			
			String productContract1 = ProductModel.getProductType(contractNumber);
			
			if (productContract1.equals("WP")){
				WordProcessorRevenue wp = new WordProcessorRevenue();
				revenue  = wp.calculateRevenueRecognitions(contract, date);}
			else if (productContract1.equals("SS")){
				SpreadsheetRevenue SS = new SpreadsheetRevenue();
				revenue = SS.calculateRevenueRecognitions(contract, date);}
			else if (productContract1.equals("DB")){
				DatabaseRevenue DB = new DatabaseRevenue();
				revenue= DB.calculateRevenueRecognitions(contract, date);
			}

		}catch(SQLException e){
			System.out.println(e.getMessage());
		}
		 DecimalFormat df = new DecimalFormat("#.##");
try {
	RevenueRecognitionModel.Insert(contractNumber, revenue, date);
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		return df.format(revenue);
	}
}