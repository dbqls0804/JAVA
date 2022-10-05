package demo;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Project1 {

	public static void main(String[] args) {
		// 네이버 스포츠 뉴스 주요뉴스 제목
		String url = "https://sports.news.naver.com/wfootball/index"; // url주소
		Document doc = null;
		try {
			doc = Jsoup.connect(url).get(); // 해당 주소 사이트의 html 문서
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 선택한 태그(div.home_new) 및 자식 태그 등 아래에 있는 여러 개의 태그들 전부 선택한 것
		Elements elements = doc.select("div.home_news");
		// System.out.println(elements.toString());
		// 제목 글자만 가져오기
		String title = elements.select("h2").text();
		System.out.println("======================");
		System.out.println(title);
		System.out.println("======================");

		// li 태그들 중 1개의 li를 반복해서 내용을 출력
		for (Element el : elements.select("li")) {
			System.out.println(el.text());
		}
		System.out.println("======================");
	}

}
