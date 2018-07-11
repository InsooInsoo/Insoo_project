package gogo7_09;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class cnyex {
	public void infoprint() throws Exception{//made by insoo
		String URL = "https://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%EC%A4%91%EA%B5%AD+%ED%99%98%EC%9C%A8&oquery=%EC%9D%BC%EB%B3%B8+%ED%99%98%EC%9C%A8&tqi=Tz8RXdpySEKsstIDinKsssssszV-164371";
		Document doc = Jsoup.connect(URL).get();
		Elements ele = doc.select(".spt_con strong");
		String str = ele.text();
		System.out.println("중국(위안) 실시간 환율 : " + str+ " 위안");
	}
	public double exchange(int kor) throws Exception{
		String URL = "https://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%EC%A4%91%EA%B5%AD+%ED%99%98%EC%9C%A8&oquery=%EC%9D%BC%EB%B3%B8+%ED%99%98%EC%9C%A8&tqi=Tz8RXdpySEKsstIDinKsssssszV-164371";
		Document doc = Jsoup.connect(URL).get();
		Elements ele = doc.select(".spt_con strong");
		String str = ele.text();
		str = str.substring(0, 3);
		int num = Integer.parseInt(str);
		double result = kor /(double)num;
		return result;
		
	}

}
