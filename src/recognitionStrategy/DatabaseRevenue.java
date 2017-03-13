package recognitionStrategy;

import java.sql.Date;
import java.util.Calendar;

import org.joda.time.DateTime;
import org.joda.time.Days;

import source.Contract;


public class DatabaseRevenue extends RecognitionStrategy {

	@Override
	public double calculateRevenueRecognitions(Contract contract, Date date) {
			DateTime dateTime = new DateTime(date.getTime());
			DateTime contractDate = new DateTime(contract.getDateSigned().getTime());
			Days difference = Days.daysBetween(contractDate, dateTime);
			int differenceint = difference.getDays();
			System.out.println(differenceint);
			if (differenceint <30 )
				return contract.getRevenue()*1/3;
			else if ((differenceint >=30) && (differenceint <60 )){
				return contract.getRevenue()*2/3;}
				else if ((differenceint >=60)){
					return contract.getRevenue();
			}
			return differenceint;
	}





}
