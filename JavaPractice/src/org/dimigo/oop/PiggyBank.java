/**
 * </pre>
 * org.dimigo.oop
 *		|_ Piggybank
 *
 * 1.	개요 :
 * 2.	작성일 : &{data}
 * </pre>
 *
 * @author	: &{user}
 * @version	: 1.0
 */
package org.dimigo.oop;

/**
 * </pre>
 * org.dimigo.oop
 *		|_ Piggybank
 *
 * 1.	개요 :
 * 2.	작성일 : &{data}
 * </pre>
 *
 * @author	: &{user}
 * @version	: 1.0
 */
public class PiggyBank {
	private static int balance;
	public static void putMoney(FamilyMember member, int amount)
	{
		balance+=amount;
		System.out.println(member.getMemberName()+""+amount+"원 넣음");
	}
	public static void printBalance()
	{
		System.out.println("돼지저금통 총 금액 :"+balance+"원");
	}
}