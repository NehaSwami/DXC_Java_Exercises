public class Question_10 {
	public class Rectangle
	{
		public int width, height;
		
		public int area() 
		{
			return width*height;
		}
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Question_10 q = new Question_10();
		 Rectangle myRect = q.new Rectangle(); 

	        myRect.width = 40; 

	        myRect.height = 50; 

	        System.out.println("myRect's area is " + myRect.area()); 
	}

}