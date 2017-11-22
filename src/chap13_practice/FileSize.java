package chap13_practice;

import java.io.*;

public class FileSize {

	public static void main(String[] args) {
		File f = new File("c:\\");
		File [] files = f.listFiles();
		long big = 0;
		File file =null;
		for(int i=0; i<files.length; i++) {
			File a = files[i];
			if(!a.isFile())
				continue;
			long size = a.length();
			if(big < size) {
				big = size;
				file = a;
			}
		}

		if(file == null)
			System.out.println("������ �����ϴ�");
		else
			System.out.println("���� ū ������ " + file.getPath() + " " + big + "����Ʈ");
	}

}
