package chap13;

import java.io.*;

public class BinaryCopy {
	public static void main(String[] args) {
		File src = new File("c:\\Users\\Public\\Pictures\\Sample Pictures\\desert.jpg"); // 원본 파일 경로명
		File dest = new File("c:\\tmp\\desert.jpg"); // 복사 파일 경로명
		
		int c;
		try {
			FileInputStream fi = new FileInputStream(src); // 파일 입력 바이트 스트림 생성
			FileOutputStream fo = new FileOutputStream(dest); // 파일 출력 바이트 스트림 생성
			
			while((c = fi.read()) != -1) {
				fo.write((byte)c);
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath() + "를 " + dest.getPath() + "로 복사하였습니다.");
		} catch (IOException e) {
			System.out.println("파일 복사 오류");
		}
	}
}
