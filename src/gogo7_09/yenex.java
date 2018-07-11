package gogo7_09;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
//made by insoo
public class yenex {
	public void infoprint() throws Exception{
		String URL = "https://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%EC%9D%BC%EB%B3%B8+%ED%99%98%EC%9C%A8&oquery=%EC%98%81%EA%B5%AD+%ED%99%98%EC%9C%A8&tqi=Tz8fFspySEssstpdPRGssssss8d-073952";
		Document doc = Jsoup.connect(URL).get();
		Elements ele = doc.select(".spt_con strong");
		String str = ele.text();
		System.out.println("일본(엔) 실시간 환율 : " + str + " 엔");
	}//made by insoo
	public double exchange(int kor) throws Exception{
		String URL = "https://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%EC%9D%BC%EB%B3%B8+%ED%99%98%EC%9C%A8&oquery=%EC%98%81%EA%B5%AD+%ED%99%98%EC%9C%A8&tqi=Tz8fFspySEssstpdPRGssssss8d-073952";
		Document doc = Jsoup.connect(URL).get();
		Elements ele = doc.select(".spt_con strong");
		String str = ele.text();//made by insoo
		str = str.replace(",","");
		str =str.substring(0, 4);	//made by insoo
		int num = Integer.parseInt(str);
		double result = kor /((double)num*0.01);
		return result;
		//made by insoo
	}

}
