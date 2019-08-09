package inout;
 
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
 
public class Demo {
 
    public static void main(String[] args) throws IOException 
    {
    	FileWriter fw = new FileWriter("c:\\deloitte\\first.txt");
    	fw.write("Hello good morning!!");
    	fw.close();
    	System.out.println("done");
    }
 
}

