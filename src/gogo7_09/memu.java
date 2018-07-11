package gogo7_09;

import java.text.DecimalFormat;
import java.util.Scanner;

public class memu extends usaex{
	Scanner sc = new Scanner(System.in);
	public int num1;
	public memu(int num1){
		this.num1 = num1;
	}
	
	usaex usa = new usaex();
	twdex twd = new twdex();
	ukdex ukd = new ukdex();
	yenex yen = new yenex();
	cnyex cny = new cnyex();
	int kormoney =0;
	public void selectmenu() throws Exception {
		int num;
		DecimalFormat df = new DecimalFormat("0");
		df = new DecimalFormat("###,###");
		do{
			System.out.print("0. 실시간 환율 정보/1. 달러 환전/ 2. 바트 환전/ 3. 위안 환전/ 4. 파운드 환전/ 5.엔 환전 / 6.종료>>>");
			num =sc.nextInt();
			switch(num) {  
			case 0:
				usa.infoprint();  //미국 환율
				twd.infoprint();  //태국 환율
				ukd.infoprint();  //영국 환율
				yen.infoprint();  //일본 (엔) 환율
				cny.infoprint();  //중국 (위안) 환율
				break;
			case 1:  //미국 돈으로 환전
				usa.infoprint();
				System.out.print("환전할 금액을 입력하세요: ");
				kormoney =sc.nextInt();
				df = new DecimalFormat("#.##");
				System.out.println("환전 받는 금액 : "+df.format(usa.exchange(kormoney)) + " USD");
				System.out.println("***********이용해주셔서 감사합니다.***********");
				break;
			case 2:  //태국 달러로 환전
				twd.infoprint();
				df = new DecimalFormat("#.##");
				System.out.print("환전할 금액을 입력하세요: ");
				kormoney = sc.nextInt();
				System.out.println("환전 받는 금액 : "+df.format(twd.exchange(kormoney)) + " TWD");
				System.out.println("***********이용해주셔서 감사합니다.***********");
				break;
			case 3: //중국(위안)으로 환전
				cny.infoprint();
				df = new DecimalFormat("#.##");
				System.out.print("환전할 금액을 입력하세요: ");
				kormoney = sc.nextInt();
				System.out.println("환전 받는 금액 : "+df.format(cny.exchange(kormoney)) + " 위안");
				System.out.println("***********이용해주셔서 감사합니다.***********");
				break;
			case 4:   // 영국 돈으로 환전
				df = new DecimalFormat("#.##");
				ukd.infoprint();
				System.out.print("환전할 금액을 입력하세요: ");
				kormoney = sc.nextInt();
				System.out.println("환전 받는 금액 : "+df.format(ukd.exchange(kormoney)) +" 파운드");
				System.out.println("***********이용해주셔서 감사합니다.***********");
				break;
			case 5: //일본 돈으로 환전
				yen.infoprint();
				df = new DecimalFormat("#.##");
				System.out.print("환전할 금액을 입력하세요: ");
				kormoney = sc.nextInt();
				System.out.println("환전 받는 금액 : "+df.format(yen.exchange(kormoney)) +" 엔");
				System.out.println("***********이용해주셔서 감사합니다.***********");
				break;
			case 6: //종료
				break;
			default: System.out.println(" 잘못 입력하셨습니다."); 
			 
			}
		}while(num !=6);
		
	}

}
