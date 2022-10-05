package 한줄씩읽기;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		// 파일이 있는지 확인
		String fileLocation = "D:\\java-work\\Ch19_파일읽고쓰기\\text.txt";
		System.out.println(new File(fileLocation).exists());
		System.out.println(); // 한 칸 띄움

		//try-with-resources 자동으로 객체를 close 시킴
		try(BufferedReader br = new BufferedReader(new FileReader(fileLocation))) {
			String line = null;
			while ((line = br.readLine()) != null) { // readLine(한 줄씩 읽기)
				System.out.println(line); // 한 줄이 null값이 아닐때까지 계속 읽기
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일은 못찾음 : " + fileLocation);
			// 파일은 있다가 없을 수도 있으므로 예외 처리 필요
		} catch (IOException e) {
			System.out.println("파일을 읽지 못함 : " + fileLocation);
		} // 파일을 읽지 못할 수도 있으므로 예외 처리 추가 필요

	}

}
