package chap13;

import java.io.*;

public class BinaryCopy {
	public static void main(String[] args) {
		File src = new File("c:\\Users\\Public\\Pictures\\Sample Pictures\\desert.jpg"); // ���� ���� ��θ�
		File dest = new File("c:\\tmp\\desert.jpg"); // ���� ���� ��θ�
		
		int c;
		try {
			FileInputStream fi = new FileInputStream(src); // ���� �Է� ����Ʈ ��Ʈ�� ����
			FileOutputStream fo = new FileOutputStream(dest); // ���� ��� ����Ʈ ��Ʈ�� ����
			
			while((c = fi.read()) != -1) {
				fo.write((byte)c);
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath() + "�� " + dest.getPath() + "�� �����Ͽ����ϴ�.");
		} catch (IOException e) {
			System.out.println("���� ���� ����");
		}
	}
}
