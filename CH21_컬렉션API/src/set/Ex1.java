package set;

public class Ex1 {

	public static void main(String[] args) {
		// set 예제 1 : 문자열에서 단어만 빼오기
		String text1 = "Netflix's Korean-language crime thriller \"Narco-Saints\" has placed second on the streamer's latest weekly viewership chart for non-English TV shows. The six-part series, released on Sept. 9, marked 27.4 million hours of viewing for the week of Sept. 19-25 to finish No. 2 on the official top 10 list for non-English TV programs available on the service, according to Netflix on Wednesday.";
		String text2 = "간밤 뉴욕증시 3대지수 중 나스닥이 나홀로 상승 마감했다. 국채금리 상승에 혼조세를 보였지만 지수 낙폭도 1% 미만에 그쳤다. 나스닥지수는 11월 기록한 역대 최고치에서 33% 이상 하락한 상태다. 또한 미국 고위 당국자가 미국의 인플레이션감축법(IRA)과 관련, 한국의 우려를 심각하게 받아들이고 있으며 관련한 확대 대화가 진행 중이라고 밝혔다. 다음은 개장 전 주목할 만한 뉴스다.";
		
		/* split : 문자열에서 잘라서(regex:정규식 표현식) 배열로 만듬
		   [^a-zA-Z] 영문 소문자나 대문자가 아닌경우(꺽새 ^) */
		String[] words = text1.split("[^a-zA-Z]+"); 
		//String[] words = text2.split("[^가-힣]+");
		
		for(String word : words) {
			if(word.length() <= 2) 
				continue; //전치사 제외시키기
			//반복문 내에서 continue는 다음 문장부터 진행하지 않고 위로 돌아감
			System.out.println(word.toLowerCase()); //소문자로 출력
		}
		
	}

}
