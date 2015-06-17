/**
 * </pre>
 * org.dimigo.oop
 *		|_ FamilyMember
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
 *		|_ FamilyMember
 *
 * 1.	개요 :
 * 2.	작성일 : &{data}
 * </pre>
 *
 * @author	: &{user}
 * @version	: 1.0
 */
public class FamilyMember {
	private static int memberCnt;
	private String memberName;
	
	public FamilyMember(String memberName)
	{
		this.memberName=memberName;
		memberCnt++;
	}
	public String getMemberName()
	{
		return this.memberName;
	}
	public static void printMemberCnt()
	{
		System.out.println("가족 총 인원수 : "+memberCnt+"명");
	}
	}