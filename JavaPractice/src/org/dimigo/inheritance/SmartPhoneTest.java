/**
 * </pre>
 * org.dimigo.inheritance
 *		|_ SmartPhoneTest
 *
 * 1.	개요 :
 * 2.	작성일 : &{data}
 * </pre>
 *
 * @author	: &{user}
 * @version	: 1.0
 */
package org.dimigo.inheritance;

/**
 * </pre>
 * org.dimigo.inheritance
 *		|_ SmartPhoneTest
 *
 * 1.	개요 :
 * 2.	작성일 : &{data}
 * </pre>
 *
 * @author	: &{박민준}
 * @version	: 1.0
 */
public class SmartPhoneTest {
	public static void main(String[] args) {
			SmartPhone iphone = new IPhone("iPhone6", "애플", 700000);
			SmartPhone galaxy = new Galaxy("갤럭시6", "삼성", 650000);
			
			System.out.println(iphone.toString());
			iphone.turnOn();
			iphone.pay();
			iphone.useSpecialFunction(iphone);
			iphone.turnOff();
			
			System.out.println();
			
			System.out.println(galaxy.toString());
			galaxy.turnOn();
			galaxy.pay();
			galaxy.useSpecialFunction(galaxy);
			galaxy.turnOff();
		}
	
	}
