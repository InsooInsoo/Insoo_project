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
			System.out.print("0. �ǽð� ȯ�� ����/1. �޷� ȯ��/ 2. ��Ʈ ȯ��/ 3. ���� ȯ��/ 4. �Ŀ�� ȯ��/ 5.�� ȯ�� / 6.����>>>");
			num =sc.nextInt();
			switch(num) {  
			case 0:
				usa.infoprint();  //�̱� ȯ��
				twd.infoprint();  //�±� ȯ��
				ukd.infoprint();  //���� ȯ��
				yen.infoprint();  //�Ϻ� (��) ȯ��
				cny.infoprint();  //�߱� (����) ȯ��
				break;
			case 1:  //�̱� ������ ȯ��
				usa.infoprint();
				System.out.print("ȯ���� �ݾ��� �Է��ϼ���: ");
				kormoney =sc.nextInt();
				df = new DecimalFormat("#.##");
				System.out.println("ȯ�� �޴� �ݾ� : "+df.format(usa.exchange(kormoney)) + " USD");
				System.out.println("***********�̿����ּż� �����մϴ�.***********");
				break;
			case 2:  //�±� �޷��� ȯ��
				twd.infoprint();
				df = new DecimalFormat("#.##");
				System.out.print("ȯ���� �ݾ��� �Է��ϼ���: ");
				kormoney = sc.nextInt();
				System.out.println("ȯ�� �޴� �ݾ� : "+df.format(twd.exchange(kormoney)) + " TWD");
				System.out.println("***********�̿����ּż� �����մϴ�.***********");
				break;
			case 3: //�߱�(����)���� ȯ��
				cny.infoprint();
				df = new DecimalFormat("#.##");
				System.out.print("ȯ���� �ݾ��� �Է��ϼ���: ");
				kormoney = sc.nextInt();
				System.out.println("ȯ�� �޴� �ݾ� : "+df.format(cny.exchange(kormoney)) + " ����");
				System.out.println("***********�̿����ּż� �����մϴ�.***********");
				break;
			case 4:   // ���� ������ ȯ��
				df = new DecimalFormat("#.##");
				ukd.infoprint();
				System.out.print("ȯ���� �ݾ��� �Է��ϼ���: ");
				kormoney = sc.nextInt();
				System.out.println("ȯ�� �޴� �ݾ� : "+df.format(ukd.exchange(kormoney)) +" �Ŀ��");
				System.out.println("***********�̿����ּż� �����մϴ�.***********");
				break;
			case 5: //�Ϻ� ������ ȯ��
				yen.infoprint();
				df = new DecimalFormat("#.##");
				System.out.print("ȯ���� �ݾ��� �Է��ϼ���: ");
				kormoney = sc.nextInt();
				System.out.println("ȯ�� �޴� �ݾ� : "+df.format(yen.exchange(kormoney)) +" ��");
				System.out.println("***********�̿����ּż� �����մϴ�.***********");
				break;
			case 6: //����
				break;
			default: System.out.println(" �߸� �Է��ϼ̽��ϴ�."); 
			 
			}
		}while(num !=6);
		
	}

}
