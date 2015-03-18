package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {
		
		int  pay = 1700000;
		int member = 3;
		int jumpo = 1500;
		long total = (long)pay * 12 * (long)member * (long)jumpo;
		
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println(String.format("월 평균 급여 : %,d원",pay));
		System.out.println(String.format("점포 내 직원 수 : %,d명",member));
		System.out.println(String.format("점포 수 : %d개",jumpo));
		
		System.out.println(String.format("연간 인건비 : %,d원",total));
		

	}

}
