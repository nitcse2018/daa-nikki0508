package assignment3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreams {
	 public static void main(String[] args) throws IOException {

	        FileInputStream in = null;
	        FileOutputStream out = null;

	        try {
	            in = new FileInputStream("D:/input-output/input-file.txt");
	            out = new FileOutputStream("D:/input-output/output-file-ByteStreams.txt");
	            int c;

	            while ((c = in.read()) != -1)
	            {
	                out.write(c);
	            }
	            } finally 
	            {
	            if (in != null)
	            {
	                in.close();
	            }
	            if (out != null) 
	            {
	                out.close();
	            }
	        }
	    }
}
