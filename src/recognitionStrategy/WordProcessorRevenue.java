package recognitionStrategy;

import java.sql.Date;

import org.joda.time.DateTime;
import org.joda.time.Days;

import source.Contract;

public class WordProcessorRevenue extends RecognitionStrategy {

	@Override
	public  double calculateRevenueRecognitions(Contract contract, Date date) {

					return contract.getRevenue();
			}
	}

