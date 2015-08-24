/**
 * </pre>
 * org.dimigo.inheritance
 *		|_ Rectangle
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
 *		|_ Rectangle
 *
 * 1.	개요 :
 * 2.	작성일 : &{data}
 * </pre>
 *
 * @author	: &{user}
 * @version	: 1.0
 */
	public class Rectangle extends Figure {
	private int width;
	private int height;
	
	Rectangle(int width, int height)
	{
		this.width = width;
		this.height= height;
	}
	
	Rectangle(int centerX, int centerY, int width, int height)
	{
		super(centerX, centerY);
		this.width = width;
		this.height = height;
	}
	
	protected double calcArea()
	{
		return width * height;
	}
	
	protected void printCenter()
	{
		System.out.print("사각형");
		super.printCenter();
	}
}