package Assessment;
import java.util.*;
public class State implements Comparable<State>{

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public State(String name) {
		//super();
		this.name = name;
	}
	    
	    public int compareTo(State st){    
	    	 if(name==st.name)    
	    	 return 0;    
	    	 else     
	    	 return -1;    
	    	 }    

}
