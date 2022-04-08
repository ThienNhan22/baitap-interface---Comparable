/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapInTerFace;

/**
 *
 * @author Administrator
 */

public class Rectangle extends GeometricObject implements Comparable<Rectangle>{
	double width;
	double height;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
		super();
		width = 0.0;
		height = 0.0;
	}
	public Rectangle(double width, double height) {
		this.height = height;
		this.width = width;
	}
	@Override
	public double getArea() {
		return height * width;
	}

    /**
     *
     * @return
     */
    @Override
	public double getPerimeter() {
		return (height + width) * 2;
	}
	@Override
	public String toString() {
		return "Rectangle[width= "+ width +", height= " + height+ "]";
	}
	@Override
	public int compareTo(Rectangle other) {
		// TODO Auto-generated method stub
		if(this.getPerimeter() < other.getPerimeter()) {
			return -1;
		}
		else if(this.getPerimeter() == other.getPerimeter()) {
			return 0;
		}
		else {
			return 1;
		}
	}
	

}
