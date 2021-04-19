package Assessment;
import java.util.*;
public class Country {


		private String name;
		private List<State> stateList = new ArrayList<State>();
		 List<State> countryList = new ArrayList<State>();
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public List<State> getStateList() {
			
			return countryList;
		}
		public void setStateList(List<State> stateList) {
			this.stateList = stateList;
		}
		public Country(String name) {
			super();
			this.name = name;
		}
		
		  public void addState(String stateName) {
		    	State newState = new State(stateName);
		    	this.countryList.add(newState);
		    }
		    
		   
		
}
