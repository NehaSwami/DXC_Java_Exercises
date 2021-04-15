public class Question_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[][]={{6,5,8},{4,7,2},{5,10,3}}; 
		int y[][]={{7,8,2},{12,8,5},{3,17,20}};
		int z[][]=new int[3][3]; 
		
		for(int i=0,j=2;i<3;i++,j--)
			for(int k=0,l=2;k<3;k++,l--)
				z[i][k]=x[i][k]*y[j][l];
			
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				System.out.print(z[i][j]+" ");
			System.out.println();
		}
	}

}