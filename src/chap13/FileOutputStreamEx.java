package chap13;

import java.io.*;

public class FileOutputStreamEx {
	public static void main(String[] args) {
		byte b[] = {7, 51, 3, 4, -1, 24};
		
		try {
			FileOutputStream fout = new FileOutputStream("c:\\test.out");
			for(int i=0; i<b.length; i++)
				fout.write(b[i]); // 배열 b의 바이너리를 그대로 기록
			
			fout.close();
		} catch(IOException e) {}
			System.out.println("c:\\test.out을 저장하였습니다.");
	}
}
