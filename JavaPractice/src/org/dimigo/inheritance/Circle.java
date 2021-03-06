/**
 * </pre>
 * org.dimigo.inheritance
 *		|_ Circle
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
 *		|_ Circle
 *
 * 1.	개요 :
 * 2.	작성일 : &{data}
 * </pre>
 *
 * @author	: &{user}
 * @version	: 1.0
 */
		public class Circle extends Figure {
		private int radius;
		
		Circle(int radius)
		{
			this.radius = radius;
		}
		
		Circle(int centerX, int centerY, int radius)
		{
			super(centerX, centerY);
			this.radius = radius;
		}
		
		protected double calcArea()
		{
			return Math.PI * radius * radius;
		}
		
		protected void printCenter()
		{
			System.out.print("원 ");
			super.printCenter();
		}
	}