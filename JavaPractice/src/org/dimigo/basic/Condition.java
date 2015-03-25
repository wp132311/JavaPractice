package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		int distance = 10;
		String Cartype = "고속버스";
		int Payment1 = 850;
		int Payment2 = 300;
		int Payment3 = 600;
		
		System.out.println("<< 고속도로 통행료 계산 >>");
			
			System.out.printf("거리 : %dkm\n",distance);
		
		switch(Cartype){
		case "고속버스":
			System.out.println("차종 : 고속버스");
			if (distance >= 10 && distance < 20){
				System.out.printf("통행료 : %d원\n",distance / 10 * 300 + Payment1);
				}else if(distance >= 20 && distance < 30){
					System.out.printf("통행료 : %d원\n",distance / 10 * 300 + Payment1);
				}else if(distance >=  30){
					System.out.printf("통행료 : %d원\n",distance / 10 * 300 + Payment1);
				}
			break;
		case "경차":
			System.out.println("차종 :경차");
			if (distance >= 10 && distance < 20){
				System.out.printf("통행료 : %d원\n",distance / 10 * 200 + Payment2);
				}else if(distance >= 20 && distance < 30){
					System.out.printf("통행료 : %d원\n",distance / 10 * 200 + Payment2);
				}else if(distance >=  30){
					System.out.printf("통행료 : %d원\n",distance / 10 * 200 + Payment2);
				}
			break;
			default : 
				System.out.println("차종:그외");
				if (distance >= 10 && distance < 20){
					System.out.printf("통행료 : %d원\n",distance / 10 * 200 + Payment3);
					}else if(distance >= 20 && distance < 30){
						System.out.printf("통행료 : %d원\n",distance / 10 * 200 + Payment2);
					}else if(distance >=  30){
						System.out.printf("통행료 : %d원\n",distance / 10 * 200 + Payment2);
					}
				break;
		}
	}

}
