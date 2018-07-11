package gogo7_09;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class ukdex {
	
	public void infoprint() throws Exception{
		String URL = "https://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%EC%98%81%EA%B5%AD+%ED%99%98%EC%9C%A8&oquery=%ED%83%9C%EA%B5%AD+%ED%99%98%EC%9C%A8&tqi=Tz8eNspySDNssZLgj2NsssssszV-459631";
		Document doc = Jsoup.connect(URL).get();
		Elements ele = doc.select(".spt_con strong");
		String str = ele.text();
		System.out.println("영국(파운드) 실시간 환율 : "+str + " 파운드");
	}
	
	public double exchange(int kor) throws Exception{
		String URL = "https://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%EC%98%81%EA%B5%AD+%ED%99%98%EC%9C%A8&oquery=%ED%83%9C%EA%B5%AD+%ED%99%98%EC%9C%A8&tqi=Tz8eNspySDNssZLgj2NsssssszV-459631";
		Document doc = Jsoup.connect(URL).get();
		Elements ele = doc.select(".spt_con strong");
		String str = ele.text();
		str = str.replaceAll(",","");
		str = str.substring(0,4); 
		int num = Integer.parseInt(str);
		double result = kor/(double)num;
		return result;
	}
}
