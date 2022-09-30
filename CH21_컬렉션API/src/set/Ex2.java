package set;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class Ex2 {

	public static void main(String[] args) {
		//  책.txt를 다운로드하여 중복되지 않은 단어를 순서대로 출력
		File aliceBook = new File("alice.txt"); //상대경로
		System.out.println(aliceBook.exists());
		TreeSet<String> alice = loadWords(aliceBook);
		
		System.out.println(alice.size()); //단어의 개수

		displaywords(alice);
	}	

	private static void displaywords(TreeSet<String> list) {
		// 화면에 단어들을 출력하는 메소드 단어 길이 6자 이상
		int count = 0;
		for (String w : list) {
			if (w.length() < 6) continue;
			//반복문 내에서 continue는 다음 문장부터 진행하지 않고 위로 돌아감
			System.out.printf("%-10s \t", w);
			count++;
			if(count == 6) {
				System.out.println();
				count = 0;
			}
		}
	}

	/**
	 * txt책을 읽어서 모든 단어를 트리셋에 담아서 리턴
	 * @param aliceBook => 파일객체
	 * @return TreeSet<String> 단어리스트
	 */
	private static TreeSet<String> loadWords(File file) {
		// 1. 파일을 읽기 (BufferedReader : 한 문장씩 빨리 읽기 가능)
		TreeSet<String> wordSet = new TreeSet<>();
		try(BufferedReader br = new BufferedReader(new FileReader(file));) {
			String line;
			while((line = br.readLine()) !=null) {
				String[] words = line.split("[^a-zA-Z]+"); 
				//[^a-zA-Z] : 소문자, 대문자 a~z제외한 영어 문자가 아닌것으로 분리
				for(String word : words) {
					wordSet.add(word.toLowerCase());//트리셋에 단어추가
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일 찾지 못함");
		} catch (IOException e1) {
			System.out.println("파일 읽지 못함");
		} 
		return wordSet;
	}

}
