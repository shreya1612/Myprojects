package pattern_Package;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFilelinebyline {

	public static void main(String[] args) throws IOException {
		File f= new File("../Firstproject/Text File.txt");// file class to create connection with txt file
		FileReader fr= new FileReader(f);//to read the file data char by char
		BufferedReader br= new BufferedReader(fr);// will club characterstogether
		String s;
		while((s=br.readLine())!=null)//read file line by line 
		{
			System.out.println(s);
		}
		
	}
}
