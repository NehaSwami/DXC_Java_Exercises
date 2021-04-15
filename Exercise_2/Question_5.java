public class Question_5 {
	public class Rectangle{
		private double length, breadth;
		public void setRectangle(double l, double b)
		{
			this.length = l;
			this.breadth = b;
		}
		public double getArea()
		{
			return length*breadth;
		}
	}

	public class Box extends Rectangle
	{
		private double height;
		public void setBox(double l, double b, double h)
		{
			setRectangle(l,b);
			this.height = h;
		}
		public double getVolume()
		{
			
			return getArea()*height;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question_5 q = new Question_5();
		Question_5.Box b = q.new Box();
		b.setBox(5,6,4);
		
		System.out.println("Volume is: "+ b.getVolume());
	}

}