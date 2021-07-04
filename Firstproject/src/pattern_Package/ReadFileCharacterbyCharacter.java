package pattern_Package;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileCharacterbyCharacter {

	public static void main(String[] args) throws IOException {
		File f= new File("../Firstproject/Text File.txt");// file class to create connection with txt file
		FileReader fr= new FileReader(f);//to read the file data char by char
		int a;
		while((a=fr.read())!=-1)//read file giving int or ascii value, so need to store it.
		{
			System.out.println((char)a);
			
		}
		
	}
}
