package org.dimigo.basic;

public class PrimitiveDataType {

	public static void main(String[] args) {
		String name = "아이유";
		int age = 23;
		String sex = "여자";
		double high = 161.3;
		double weight = 44.3;
		char blood = 'A';
		
		System.out.println("<<아이유 프로필>>");
		System.out.printf("이름 : "+name+"\n",name);
		System.out.printf("성별 :"+sex+" \n",sex);
		System.out.printf("나이 :"+age+" \n",age);
		System.out.printf("키 : "+high+"cm \n",high);
		System.out.printf("몸무게 : "+weight+"kg \n",weight);
		System.out.printf("혈액형 : "+blood+"형 \n",blood);

	}

}
