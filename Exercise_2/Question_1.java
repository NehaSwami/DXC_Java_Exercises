public class Question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {1,2,3,4,5,};
		int key = 4;
		boolean found = false;
		for(int i=0; i<20; i++)
		{
			if(num[i]==key)
			{
				found= true;
				break;
			}
		}
		if(found)
		{
			System.out.println(key + " found in array");
		}
		else
		{
			System.out.println(key + " not found in array");
		}
		
	}

}