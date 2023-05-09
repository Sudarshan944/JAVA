import java.io.*;
public class FileOutputStram {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		DataInputStream dis = new DataInputStream(System.in);
		FileOutputStream fout = new FileOutputStream("S:/java.txt");
		char ch;
		System.out.println("Enter the data upto @");
		while((ch=(char)dis.read())!='@') {
			fout.write(ch);
		}
		fout.close();
		// char ch=dis.readChar(); --> a is input
		// System.out.println(ch); --> ? is output not a which is an an error
		/*
		 * 1char to read from keyboard FileInputStream takes 1 second for input
		 * to get output FileOutputStream will take again 1 second to show output i.e., 2 seconds
		 * takes more time 100 characters read and write ->200 seconds
		 * To overcome this we use Buffered stream 
		 * it takes input all characters at once according buffer size
		 */
	}
}
