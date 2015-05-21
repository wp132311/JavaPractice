package org.dimigo.oop;

public class SnackTest {

	public static void main(String[] args) {
		Snack[] SnackArr= new Snack[] {
				new Snack("새우깡","농심",1100,2),
				new Snack("콘칩","크라운",1200,1),
				new Snack("허니버터칩","해태",1500,4)
		};
		int sum= 0;
		
		for (Snack snack : SnackArr) {
			sum += snack.calcPrice();
			snack.printSnack();
			System.out.println();
		}
		System.out.println("총합 : " + sum);
	}

}