package identityMap;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import source.Contract;

public class IdentityMap {
	
	 private static Map hash = new HashMap();
	 
	 public IdentityMap(){  }
	 
	  public static Contract isInto(Long id) throws SQLException, ClassNotFoundException {
	 
	    Contract contract = (Contract) hash.get(new Long (id));
	      return contract;
	  }
	 
	 @SuppressWarnings("unchecked")
	public static void add(Contract contract) {
	      hash.put(new Long(contract.getId()), contract);
	  }
	}


