package File_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class read_write_file {
	public read_write_file() {
		// TODO Auto-generated constructor stub
		FileOutputStream fout = FileOutputStream("student.txt");
	FileInputStream fin = new FileInputStream("sam.txt");
	int i = 0;
	while ((i = fin.read()) != -1) { // Read until end of file
		System.out.print((char) i); // Print character
		fout.write(i); // Write character to output file
		
	}}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new read_write_file();
	}

}
