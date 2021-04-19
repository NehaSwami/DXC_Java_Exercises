package Assessment;
import java.util.*;
import java.util.regex.Pattern;
public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
			  Scanner sc = new Scanner(System.in);
			  String numberOfInput = sc.nextLine();
			  int n = Integer.parseInt(numberOfInput);  
			  List<String> inputList = new ArrayList<String>();
			  List<String> countryList = new ArrayList<String>();
			  List<Country> country = new ArrayList<Country>();
			  for(int i = 0;i<n;i++) {
				  inputList.add(sc.next("Enter COuntry|Name"));
			  }
			  for(String input:inputList) {
				  String countryName= input.split( Pattern.quote("|") )[0];
				  if(countryList.contains(countryName)) {
					  for(Country countryIndividual: country) {
						  if(countryIndividual.getName() == countryName) {
							  countryIndividual.addState(input.split( Pattern.quote("|") )[1]);
						  }
					  }
					 
				  }
				  Country newCountry = new Country(countryName);
				  country.add(newCountry);
				  for(Country countryIndividual: country) {
					   countryIndividual.getStateList();
					  
				  }
			  }
		  }
	}


