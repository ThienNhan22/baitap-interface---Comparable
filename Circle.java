/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapInTerFace;

/**
 *
 * @author Administrator
 */
public class Circle extends GeometricObject implements Comparable<Circle> {
	double radius;
	final double PI = 3.14;
	public Circle() {
		// TODO Auto-generated constructor stub
		super();
		radius = 0.0;
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	public double getArea() {
		return PI * radius * radius;
	}
	@Override
	public double getPerimeter() {
		return 2 * PI * radius;
	}
	@Override
	public String toString() {
		return "Circle[radius=" + radius +", color=" + color + ", filled="+ filled +"]";
	}
	@Override
	public int compareTo(Circle other) {
		if(this.getArea() < other.getArea()) {
			return -1;
		}
		else if(this.getArea() == other.getArea()) {
			return 0;
		}
		else {
			return 1;
		}
	}
}


