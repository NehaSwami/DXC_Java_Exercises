public class Question_9 {
	private String name;
	private int day; 
	private String month;

public String setname()
{       this.name="Republic day";
		return name;
}
	public int setday()
	{       this.day=26;
			return day;
	}
	public String setmonth()
	{       this.month = "January";
			return month;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question_9 h = new Question_9();
		 System.out.println(h.setday()+"-"+h.setmonth()+"="+h.setname());
	}

}