/**
 * </pre>
 * org.dimigo.oop
 *		|_ IdolGroup
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
 *		|_ IdolGroup
 *
 * 1.	개요 :
 * 2.	작성일 : &{data}
 * </pre>
 *
 * @author	: &{박민준}
 * @version	: 1.0
 */
public class IdolGroup {
	
	public static void main(String[] args) {
		String [] idolGroup = {"씨스타", "민준이꺼", "걸스데이"};
		String[] [] members = {
				{"효린", "보라", "소유","다솜"},
				{"하니", "수지", "현아", "전효성"},
				{"유라", "소진", "민아", "혜리"}
				};
		for(int i = 0; i<idolGroup.length; i++){
			
			System.out.println("<<" + idolGroup[i] + "멤버 >>");
			for(String member : members[i]){
				System.out.println(member);
				}
			System.out.println();
			}
		}
	}
