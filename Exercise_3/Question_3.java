import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter; 
import java.io.IOException; 
import java.io.PrintWriter;

public class Question_3 {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
	
		BufferedWriter bw = null; 
		PrintWriter pw = null;

	try { 
		FileWriter fw = new FileWriter("D:\\Neha\\Question_2.txt");
			bw = new BufferedWriter(fw); 
			pw = new PrintWriter(bw); 
			pw.println("New append to this file");
			System.out.println("Data Successfully appended into file"); 
			pw.flush(); 
			
					pw.close(); 
					bw.close(); 
					fw.close(); 
					} 
				catch (IOException io)
				{
					// can't do anything 
				}
		}
		

}



