package recognitionStrategy;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.joda.time.DateTime;
import org.joda.time.Days;

import source.Contract;


public class SpreadsheetRevenue extends RecognitionStrategy {



	@Override
	public double calculateRevenueRecognitions(Contract contract, Date date) {
			DateTime dateTime = new DateTime(date.getTime());
			DateTime contractDate = new DateTime(contract.getDateSigned().getTime());
			Days difference = Days.daysBetween(contractDate, dateTime);
			int differenceint = difference.getDays();
			if (differenceint <60 )
				return contract.getRevenue()*1/3;
			else if ((differenceint >=60) && (differenceint <90 )){
				return contract.getRevenue()*2/3;}
				else if ((differenceint >=90)){
					return contract.getRevenue();
			}
			return differenceint;
	}



}
