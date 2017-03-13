package recognitionStrategy;

import java.sql.Date;

import source.Contract;

public abstract class RecognitionStrategy {
	
	public abstract double calculateRevenueRecognitions (Contract contract, Date date);

}
