import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		
		System.out.println("Create directory");
		File file=new File("C:\\FileIOExample\\CreateDirectory\\IOExample\\MyFile.txt");
		
		try {
			FileOutputStream out=new FileOutputStream(file);
		//	out.write(65);
			
			String msg="Welcome home";
			byte[] b=msg.getBytes();
			out.write(b);
			out.close();
			
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Completed creating directory");
		
	}



	}


