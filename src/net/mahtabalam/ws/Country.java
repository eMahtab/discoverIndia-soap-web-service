package net.mahtabalam.ws;

import javax.jws.WebService;
import javax.jws.WebMethod;


@WebService
public interface Country {

	@WebMethod 
	String getCapital(String s);
	
	@WebMethod
	String getLanguages(String s);
	
	@WebMethod
	String getAirports(String s);
	
	@WebMethod
	int getDistricts(String s);
	
	@WebMethod
	String getPlacesToVisit(String s);
	
	@WebMethod
	String getInterestingFacts(String s);	
}


