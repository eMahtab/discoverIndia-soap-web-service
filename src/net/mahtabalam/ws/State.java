package net.mahtabalam.ws;

public class State {
	private String name;
	private String capital;
	private int districts;
	private String languages;
	private String airports;
	private String placesToVisit;
	private String interestingFacts;
	
	State(String name,String capital,int districts,String languages,String airports,String placesToVisit,String interestingFacts){
		this.name=name;
		this.capital=capital;
		this.districts=districts;
		this.languages=languages;
		this.airports=airports;
		this.placesToVisit=placesToVisit;
		this.interestingFacts=interestingFacts;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getAirports() {
		return airports;
	}
	public void setAirports(String airports) {
		this.airports = airports;
	}	
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public String getLanguages() {
		return languages;
	}
	public void setLanguages(String languages) {
		this.languages = languages;
	}
	public int getDistricts() {
		return districts;
	}
	public void setDistricts(int districts) {
		this.districts = districts;
	}
	public String getPlacesToVisit() {
		return placesToVisit;
	}
	public void setPlacesToVisit(String placesToVisit) {
		this.placesToVisit = placesToVisit;
	}
	public String getInterestingFacts() {
		return interestingFacts;
	}
	public void setInterestingFacts(String interestingFacts) {
		this.interestingFacts = interestingFacts;
	}

}
