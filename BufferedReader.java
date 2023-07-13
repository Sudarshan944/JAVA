import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;

public class BufferedReader {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
//		DataInputStream dis = new DataInputStream(System.in);
//		FileOutputStream fout = new FileOutputStream("S:/java.txt");
//		BufferedOutputStream bout = new BufferedOutputStream(fout,1024);
//		char ch;
//		System.out.println("Enter the data upto @");
		//File Exists or not
		int ch;
		FileReader fr=null;
		try {
			fr=new FileReader("S:/java.txt"); // File exists or not
			System.out.println("File is checked");
		}catch(FileNotFoundException fnf) {
			System.err.print("File Not Found");
		}
		while((ch=fr.read())!=-1) {
//			bout.write(ch);
			System.out.print((char)ch);
		}
		fr.close();
	}

}
