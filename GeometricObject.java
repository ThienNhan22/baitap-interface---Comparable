/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapInTerFace;

/**
 *
 * @author Administrator
 */
public class GeometricObject {
	String color;
	boolean filled;
	public GeometricObject() {
		color = null;
		filled = false;
	}
	public GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public double getArea() {
		return 0;
	}
	public double getPerimeter() {
		return 0;
	}
}
