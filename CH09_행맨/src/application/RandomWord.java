package application;

import java.util.Random;

/* 랜덤 단어 만드는 사이트
 * https://randomwordgenerator.com/
 * https://www.browserling.com/tools/newlines-to-spaces
 */

public class RandomWord {

	private String books = "language understand earthflax ostracize eavesdrop mistreat assignment multiply movement replacement teenager satisfied railroad prescription depression presidential fabricate profound conservative connection argument invisible executive unfortunate feminist memorial exhibition evolution mutation nominate";
	// 여기서 \r\n은 한 줄 띄움 => 지저분하니깐 newlines-to-spaces으로 한칸띄움으로 바꿔줌
	private String[] words = books.split(" "); // 문자열에서 스페이스로 분리한 단어
	private String selectWord; // 랜덤 단어 변수로 지정
	private Random random = new Random(); // random 객체
	private char[] characters; // characters 배열의 크기는 단어의 문자 개수 만큼 정해져야함

	public RandomWord() {
		// 객체를 생성하면 랜덤 단어 하나 선택
		int index = random.nextInt(words.length); // 단어의 갯수만큼 랜덤으로 나옴
		selectWord = words[index];
		characters = new char[selectWord.length()]; // 선택 단어 철자의 개수만큼 배열의 크기가 결정됨
	}

	public String toString() {

		// String text = "";
		StringBuilder sb = new StringBuilder();
		for (char c : characters) {
			// 예제 : 삼항 조건 연산자를 써서 한줄로 줄이기
			
			/* if (c == '\u0000') { // 문자형 char 배열의 초기값(문자 배열에 아무 것도 없을 때)
				//text += '_'; // 정답이 틀릴 때 (=초기값)
				sb.append('_');
			} else {
				//text += c; // 정답일 경우 문자 철자를 넣어줌
				sb.append(c);
			}
			//text += ' '; // 언더바 다음 한 칸 스페이스
			*/
			sb.append((c == '\u0000') ? '_' : c);
			sb.append(' ');
			
		}
		// System.out.println(selectWord);
		// return text; // 선택 단어를 _ <- 언더바로 리턴
		return sb.toString();
	}

	// 모든 단어를 출력하는 메소드
	public void getWords() {
		for (String w : words) {
			System.out.println(w);
		}
	}

	public void addGuess(char c) {
		/* 랜덤으로 선택한 단어에 c 문자가 있으면 
		그 문자를 characters의 인덱스 위치에 입력 */
		for(int i = 0; i < selectWord.length(); i++) {
			if( c == selectWord.charAt(i)) {
				characters[i] = c;
			}
		}
	}
	
	public boolean isCompleted() {
		// 맞춘 문자는 characters배열에 있으므로 배열에 모든 철자가 초기값'\u0000')이 아니면 전부 맞춘거
		for(char c : characters) {
			if ( c == '\u0000' ) {
				return false; // 하나라도 틀려서 틀린것
			}
		}
		
		return true; //다 맞춘것
	}

}
