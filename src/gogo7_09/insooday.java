package gogo7_09;

import java.util.Scanner;

public class insooday {
	//made by insoo
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("\t***INSOO BANK EXCHANGE SERVICE***");
		memu menu = new memu(6);
		menu.selectmenu();
		// ********구현 간략 설명 *********
		//패키지 간의 클래스 사용
		//jsoup libary를 사용한 네이버 환율정보 스크래이핑
		//DecimalFormat API사용해서 숫자 형식 표시
		//while문을 활용해서 반복 진행 구현	
	}
}

