package net.mahtabalam.ws;

import java.util.HashMap;
import java.util.Map;

public class Utility {

	Map<String, State> state_map;

	Utility() {
		state_map = new HashMap<String, State>();
	}

	void loadData(){
		
		State rajasthan=new State("Rajasthan","Jaipur",33,"Hindi, Rajasthani","Jaipur, Jodhpur, Udaipur","Ajmer, Udaipur, Jaipur","Rajasthan is famous for its marbles");
		State punjab=new State("Punjab","Chandigarh",22,"Hindi, Punjabi","Amritsar","Amritsar, Ludhiana","Punjab is popular for its joyful punjabi people");  
		State mp=new State("Madhya Pradesh","Bhopal",51 ,"Hindi","Bhopal, Gwalior","Bhopal, Gwalior","Madhya Pradesh is well known for its wildlife and monuments");  
		State haryana=new State("Haryana","Chandigarh",21 ,"Hindi, Haryanvi","","Hisar, Rohtak, Fridabad","Haryana is popular for its haryanvi language");  
		State gujrat=new State("Gujrat","Gandhinagar",33 ,"Hindi, Gujrati","Ahmedabad, Vadodara, Gandhinagar","Ahmedabad, Vadodara","Gujrat is famous for its rich culture and dandiya nights");
      
		State up=new State("Uttar Pradesh","Lucknow",75,"Hindi, Bhojpuri","Lucknow, Varanasi, Kanpur","Lucknow, Varanasi","Uttar Pradesh is famous for its Pan and trains");  
		State cht=new State("Chhattisgarh","Raipur",27,"Hindi","Bilaspur, Raigarh","Raigarh, Jagdalpur","Chhattisgarh is well known as a state having most number of forts");   
		State jharkhand=new State("Jharkhand","Ranchi",24 ,"Hindi","Jamshedpur","Jamshedpur","Jharkhand is popular for its rich soil and natural beauty"); 
		State westbengal=new State("West Bengal","Kolkata",20 ,"Hindi","Kolkata","Kolkata","West Bengal is known for its population and bengali language with lot of fish curry");  
		State odisha=new State("Odisha","Bhubaneswar",30 ,"Hindi, Oriya","Bhubaneswar","Bhubaneswar","Odisha is land of Oriya language where people love rice and fish");
		
		State mh=new State("Maharashtra","Mumbai",36 ,"Hindi, Marathi","Mumbai","Mumbai","Maharashtra is known for its farmers , bollywood and vada pav");  
		State ka=new State("Karnataka","Bengaluru",30 ,"Hindi, Kannada","Bengaluru","Bengaluru","Karnataka is land of sandlewood with rich heritage ");  
		State andhra=new State("Andhra Pradesh","Hyderabad",13 ,"Telugu","Hyderabad","Hyderabad","Andhra Pradesh is popular for andhra style mess and telugu movies"); 
		State tamilnadu=new State("Tamilnadu","Chennai",32 ,"Tamil","Chennai","Chennai","Tamilnadu is place where food is served over banana leaves and you should be familiar with tamil language to get accepted");   
		State ta=new State("Telangana","Hyderabad",10 ,"Telugu","Hyderabad","Hyderabad","Telangana is new state which is trying to make its mark");
		
		State kerala=new State("Kerala","Thiruvananthapuram",14 ,"Malayalam","Thiruvananthapuram,Kochi","Thiruvananthapuram,Kochi","Kerala is land of beaches and coconuts"); 
		State ut=new State("Uttarakhand","Dehradun",13 ,"Hindi","Dehradun","Dehradun","Uttrakhand is place of mountains vast terrains and long rivers");
    	State bihar=new State("Bihar","Patna",38 ,"Hindi, Bhojpuri","Patna, Bhagalpur","Patna, Nalanda","Bihar is known for its Chatt puja and minister lalu yadav");
		State assam=new State("Assam","Dispur",27 ,"Assamese","Guwahati","Guwahati, Darjiling","Assam is known for its tea gardens and coal operated rails");
		State meghalaya=new State("Meghalaya","Shillong",11,"English, Khasi, Garo","Shillong","Shillong","Meghalaya is the only state in India which have English as its official language");
		
		State himachal=new State("Himachal Pradesh","Shimla",12 ,"Hindi","Shimla","Shimla","Himachal Pradesh is popular for its mountains, snow fall of Shimla and apples");
		State jk=new State("Jammu and Kashmir","Jammu-Winter, SriNagar-Summer",22 ,"Hindi, English, Urdu, Dogri","Jammu","Jammu, SriNagar","J&K is known as Switzerland of India ");
		
		State delhi=new State("Delhi","Capital City",0 ,"Hindi, English","New Delhi","New Delhi, Old Delhi","Delhi is famous for moughal monuments, narrow lanes of Delhi 6 and Delhi Metro");
        State manipur=new State("Manipur","Imphal",9 ,"Meeteilon","Imphal","Imphal","Manipur is known for its hills, lakes and kangla fort");
        State mizoram=new State("Mizoram","Aizawl",8 ,"Mizo","Aizawl","Aizawl","Mizoram have the scenery that can catch your eyes");
		
        state_map.put("Rajasthan", rajasthan);
		state_map.put("Punjab", punjab);
		state_map.put("Madhya Pradesh", mp);
		state_map.put("Haryana", haryana);
		state_map.put("Gujrat", gujrat);	
		state_map.put("Uttar Pradesh", up);
		state_map.put("Chhattisgarh", cht);
		state_map.put("Jharkhand", jharkhand);
		state_map.put("West Bengal", westbengal);
		state_map.put("Odisha", odisha);
		state_map.put("Maharashtra", mh);
		state_map.put("Karnataka", ka);
		state_map.put("Andhra Pradesh", andhra);
		state_map.put("Tamilnadu", tamilnadu);
		state_map.put("Telangna", ta);
		state_map.put("Kerala", kerala);
		state_map.put("Uttrakhand", ut);
		state_map.put("Bihar", bihar);
		state_map.put("Assam", assam);
		state_map.put("Meghalaya", meghalaya);
		state_map.put("Himachal Pradesh", himachal);
		state_map.put("Jammu and Kashmir", jk);
		state_map.put("Delhi", delhi);
		state_map.put("Manipur", manipur);
		state_map.put("Mizoram", mizoram);	
		
		}

	State getState(String stateName) {
		State state = null;
		state = state_map.get(stateName);
		return state;
	}

}
