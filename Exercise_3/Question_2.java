import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
public class Question_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
        String strLine = "";
        String str_data = "";
        try {
             BufferedReader br = new BufferedReader(new FileReader("D:\\Neha\\Question_2.txt"));
             while (strLine != null)
             {
                if (strLine == null)
                  break;
                str_data += strLine;
                strLine = br.readLine();
                
            }
              System.out.println(str_data);
             br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
	}

}
