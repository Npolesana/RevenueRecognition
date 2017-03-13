package identityMap;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import com.mysql.jdbc.Connection;

import source.Contract;

public class ContractMap {

	public ContractMap(){}
	
	

	  public static Contract getContract(Long id) throws 
	                                        ClassNotFoundException, SQLException {
	 
	    Contract contract = IdentityMap.isInto(id);
	    if(contract!=null)
	    {
		      System.out.println("I come from the identity mapper!");
	      return contract;
	    }
	    else {
		      System.out.println("I come from the database!");	
	      Contract contract1 = Contract.findContract(id);
	      if(contract1 !=null){
	      IdentityMap.add(contract1);
	      return contract1;}
	    }
		return null;
	 
	  } 
	
	  }
	