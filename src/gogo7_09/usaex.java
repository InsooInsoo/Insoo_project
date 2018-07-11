package gogo7_09;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class usaex {//made by insoo
	public  void infoprint() throws Exception{
		String URL = "https://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%EB%AF%B8%EA%B5%AD+%ED%99%98%EC%9C%A8&oquery=%EB%A1%9C%EB%98%90+%EB%B2%88%ED%98%B8&tqi=Tz8LZspVuERssbcgvUdssssssZZ-212055";
		Document doc = Jsoup.connect(URL).get();
		Elements ele = doc.select(".spt_con strong");
		String str = ele.text();
		//made by insoo
		//String[] str1 = strnew.split(".");
		//int num = Integer.parseInt(str1[0]);
		System.out.println("미국(달러) 실시간 환율 : " + str+" 달러");
	}//made by insoo
	public double exchange(int kor) throws Exception{
		String URL = "https://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%EB%AF%B8%EA%B5%AD+%ED%99%98%EC%9C%A8&oquery=%EB%A1%9C%EB%98%90+%EB%B2%88%ED%98%B8&tqi=Tz8LZspVuERssbcgvUdssssssZZ-212055";
		Document doc = Jsoup.connect(URL).get();
		Elements ele = doc.select(".spt_con strong");
		String str = ele.text();
		String strnew = str.replace(",","");
		strnew = strnew.substring(0,4);
		int num = Integer.parseInt(strnew);
		double result = kor /(double)num;
		return result;
		//made by insoo
	}
}
