/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapInTerFace;

/**
 *
 * @author Administrator
 */
import java.util.Arrays;

public class SuDungHinhHoc {

	public static void main(String[] args) {
		Circle[] circle = new Circle[10];
		Rectangle[] rect = new Rectangle[10];
		for(int i = 0 ; i < 10; i++) {
			  circle[i] = new Circle(Math.random() * 25 + 5);
			  rect[i] = new Rectangle(Math.random() * 15 + 1, Math.random() * 35 + 20);
		}
		
		System.out.println("\t\tDANH SACH HINH TRON");
		for(int i = 0 ; i < 10; i++) {
			System.out.println((i+1) + ": " + circle[i]);
		}
		System.out.println("\t\tDANH SACH HINH CHU NHAT");
		for(int i = 0 ; i < 10; i++) {
			System.out.println((i+1)+ ": " + rect[i]);
		}
		Arrays.sort(circle);
		Arrays.sort(rect);
		System.out.println("\t\tDANH SACH HINH TRON DA SAP XEP");
		for(int i = 0 ; i < 10; i++) {
			System.out.println((i+1) + ": " + circle[i]);
		}
		System.out.println("\t\tDANH SACH HINH CHU NHAT DA SAP XEP");
		for(int i = 0 ; i < 10; i++) {
			System.out.println((i+1)+ ": " + rect[i]);
		}
	}
}

