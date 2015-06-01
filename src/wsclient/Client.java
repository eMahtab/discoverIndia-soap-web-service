package wsclient;

public class Client {
       
   public static void main(String[] args) {        
       CountryImplService service=new CountryImplService();          
       CountryImpl country=service.getCountryImplPort();          
       System.out.println("Capital of Kerala : "+country.getCapital("Kerala"));
       System.out.println("No. of districts in Telangna : "+country.getDistricts("Telangna"));
       System.out.println("Local languages of Gujrat : "+country.getLanguages("Gujrat"));
       System.out.println("Airports in Uttrakhand : "+country.getAirports("Uttrakhand"));
       System.out.println("Places to visit in Rajasthan : "+country.getPlacesToVisit("Rajasthan"));
       System.out.println("Interesting Facts about Meghalaya : "+country.getInterestingFacts("Meghalaya"));        
   }
}
