package chap13;

import java.io.*;

public class FileWriterEx {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		
		FileWriter fout = null;
		int c;
		try {
			fout = new FileWriter("c:\\tmp\\test.txt");
			while ((c = in.read()) != -1) {
				fout.write(c); // Ű����κ��� ���� ���ڸ� ���Ͽ� ����
			}
			in.close();
			fout.close();
		}
		catch (IOException e) {
			System.out.println("����� ����");
		}
	}
}
