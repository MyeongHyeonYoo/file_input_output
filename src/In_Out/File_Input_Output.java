package In_Out;

import java.io.BufferedReader;
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
			write("문자 변환 스트림을 사용합니다.");
			String str = read();
			System.out.println(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 파일 입력
	public static void write(String str) throws IOException {
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		Writer writer = new OutputStreamWriter(os, "UTF-8");
		writer.write(str); // 파일 입력 준비
		writer.flush(); // 파일 입력(버퍼에 있는 것을 출력)
		writer.close(); // 파일 입력 닫기
	}
	
	//파일 출력
	public static String read() throws IOException {
		/*
		 * InputStream is = new FileInputStream("C:/Temp/test.txt"); Reader reader = new
		 * InputStreamReader(is, "UTF-8"); char[] data = new char[20]; // 문자 20개 내로 받기
		 * int num = reader.read(data); // 문자 수 리턴 및 data에 데이터 값 저장 reader.close();
		 * String str = new String(data, 0, num); return str;
		 */
		
		// char 타입 변환 과정 없애기 - BufferedReader 사용
		InputStream is = new FileInputStream("C:/Temp/test.txt");
		Reader reader = new InputStreamReader(is, "UTF-8");
		BufferedReader br = new BufferedReader(reader);
		String str = br.readLine(); // 행 단위로 문자열 읽기
		return str;
	}

}
