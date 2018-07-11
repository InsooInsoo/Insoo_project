package gogo7_09;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class twdex {
	public void infoprint() throws Exception{
		String URL = "https://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%ED%83%9C%EA%B5%AD+%ED%99%98%EC%9C%A8&oquery=%EB%AF%B8%EA%B5%AD+%ED%99%98%EC%9C%A8&tqi=Tz8MtdpVuFZsscI0MSNsssssskR-233504";
		Document doc = Jsoup.connect(URL).get();
		Elements ele = doc.select(".spt_con strong");
		String str = ele.text();
		System.out.println("태국(바트) 현재 환율 : " + str+ " 바트");
	}
	public double exchange(int kor) throws Exception {
		String URL = "https://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%ED%83%9C%EA%B5%AD+%ED%99%98%EC%9C%A8&oquery=%EB%AF%B8%EA%B5%AD+%ED%99%98%EC%9C%A8&tqi=Tz8MtdpVuFZsscI0MSNsssssskR-233504";
		Document doc = Jsoup.connect(URL).get();
		Elements ele = doc.select(".spt_con strong");
		String str = ele.text();
		str = str.substring(0, 2);
		int num = Integer.parseInt(str);
		double result =  kor /(double)num;
		return result ;
	}
	
	
}
