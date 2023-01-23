package In_Out;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class File_Input_Output {

	public static void main(String[] args) {
		try {
			// 파일 입력
			OutputStream os = new FileOutputStream("C:/Temp/test.txt");
			Writer writer = new OutputStreamWriter(os, "UTF-8");
			String str = "문자 변환 스트림을 사용합니다.";
			writer.write(str); // 파일 입력 준비
			writer.flush(); // 파일 입력(버퍼에 있는 것을 출력)
			writer.close(); // 파일 입력 닫기
			
			//파일 출력
			InputStream is = new FileInputStream("C:/Temp/test.txt");
			Reader reader = new InputStreamReader(is, "UTF-8");
			char[] data = new char[20]; // 문자 20개 내로 받기
			int num = reader.read(data); // 문자 수 리턴 및 data에 데이터 값 저장
			String str2 = new String(data, 0, num);
			System.out.println(str2);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
