package chap13_practice;

import java.io.*;

public class UpperCharacter {

	public static void main(String[] args) {
		try {
			FileReader fin = new FileReader("c:\\windows\\system.ini");
			int c;
			while((c=fin.read()) != -1) {
				char a = (char)c;
				if(Character.isLowerCase(a))
					a = Character.toUpperCase(a);
				System.out.print((char)a);
			}
			fin.close();
		}
		catch(IOException e) {
			System.out.println("파일 읽기 오류");
		}

	}

}
