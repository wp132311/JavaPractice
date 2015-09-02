/**
 * </pre>
 * org.dimigo.inheritance
 *		|_ IPhone
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
 *		|_ IPhone
 *
 * 1.	개요 :
 * 2.	작성일 : &{data}
 * </pre>
 *
 * @author	: &{박민준}
 * @version	: 1.0
 */
	public class IPhone extends SmartPhone{
		IPhone()
		{
			
		}
		
		IPhone(String model, String company, int price)
		{
			super(model, company, price);
		}
		
		public void pay()
		{
			System.out.println("애풀 페이로 결제합니다.");
		}
		
		public void useAirDrop()
		{
			System.out.println("AirDrop기능을 사용합니다.");
		}
	}
