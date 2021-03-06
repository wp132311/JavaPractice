/**
 * </pre>
 * org.dimigo.inheritance
 *		|_ Figure
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
 *		|_ Figure
 *
 * 1.	개요 :
 * 2.	작성일 : &{data}
 * </pre>
 *
 * @author	: &{user}
 * @version	: 1.0
 */
		public class Figure {
		private int centerX = 0;
		private int centerY = 0;
		
		Figure(){
			
		}
		Figure(int centerX, int centerY){
			this.centerX = centerX;
			this.centerY = centerY;
		}
		protected double calcArea(){
			return 0.0;
		}
		protected void printCenter(){
			System.out.println("중심좌표 : (" + centerX + ", " + centerY + ")");
		}
		protected void moveFigure(int x, int y){
			centerX += x;
			centerY += y;
		}
	}
