/**
 * </pre>
 * org.dimigo.oop
 *		|_ PiggybankTest
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
 *		|_ PiggybankTest
 *
 * 1.	개요 :
 * 2.	작성일 : &{data}
 * </pre>
 *
 * @author	: &{user}
 * @version	: 1.0
 */
public class PiggyBankTest {
	public static void main(String[] args) {
		FamilyMember family[]={
		new FamilyMember("아빠"), 
		new FamilyMember("엄마"),
		new FamilyMember("나"), 
		new FamilyMember("동생")
		};
		
		FamilyMember.printMemberCnt();
		
		PiggyBank.putMoney(family[0], 10000);
		PiggyBank.putMoney(family[1], 5000);
		PiggyBank.putMoney(family[2], 2000);
		PiggyBank.putMoney(family[3], 1000);
		PiggyBank.printBalance();
		PiggyBank.putMoney(family[2], 1000);
		PiggyBank.printBalance();
		}
	}
