package 파일텍스트읽고쓰기;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {

	public static void main(String[] args) throws IOException {

		String text = "헬로우! \n 하 와 유? \n한 줄 더 쓰기";

		Path path = Paths.get("D:\\a.txt"); // 상대경로, 절대경로

		// write(파일의 경로, 바이트데이터)
		//1. 파일 쓰기
		// Files.write(path, text.getBytes());
		// text.getBytes() => 문자열을 바이트 단위로 변환

		//path = Paths.get("D:\\a.txt");
		// 2. 파일 읽기
		String recivedText = Files.readString(path);
		System.out.println(recivedText);
	}
}
