package filehandling;
import java.io.FileReader;
import java.io.IOException;
public class read {
	 public static void main(String[] args) {
	        try {
	            FileReader reader = new FileReader("MyFile.txt");
	            int character;
	 
	            while ((character = reader.read()) != -1) {
	                System.out.print((char) character);
	            }
	            reader.close();
	 
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	 
}


